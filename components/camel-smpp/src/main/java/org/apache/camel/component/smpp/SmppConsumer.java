/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.smpp;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.camel.Processor;
import org.apache.camel.support.DefaultConsumer;
import org.apache.camel.support.task.BlockingTask;
import org.jsmpp.DefaultPDUReader;
import org.jsmpp.DefaultPDUSender;
import org.jsmpp.SynchronizedPDUSender;
import org.jsmpp.bean.BindType;
import org.jsmpp.bean.NumberingPlanIndicator;
import org.jsmpp.bean.TypeOfNumber;
import org.jsmpp.extra.SessionState;
import org.jsmpp.session.BindParameter;
import org.jsmpp.session.MessageReceiverListener;
import org.jsmpp.session.SMPPSession;
import org.jsmpp.session.Session;
import org.jsmpp.session.SessionStateListener;
import org.jsmpp.util.DefaultComposer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.apache.camel.component.smpp.SmppUtils.isServiceStopping;
import static org.apache.camel.component.smpp.SmppUtils.isSessionClosed;
import static org.apache.camel.component.smpp.SmppUtils.newReconnectTask;

/**
 * An implementation of consumer which use the SMPP protocol
 */
public class SmppConsumer extends DefaultConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(SmppConsumer.class);

    private SmppConfiguration configuration;
    private SMPPSession session;
    private MessageReceiverListener messageReceiverListener;
    private SessionStateListener internalSessionStateListener;

    private final ReentrantLock reconnectLock = new ReentrantLock();

    /**
     * The constructor which gets a smpp endpoint, a smpp configuration and a processor
     */
    public SmppConsumer(SmppEndpoint endpoint, SmppConfiguration config, Processor processor) {
        super(endpoint, processor);

        this.configuration = config;
        this.internalSessionStateListener = new SessionStateListener() {
            @Override
            public void onStateChange(SessionState newState, SessionState oldState, Session source) {
                if (configuration.getSessionStateListener() != null) {
                    configuration.getSessionStateListener().onStateChange(newState, oldState, source);
                }

                if (newState.equals(SessionState.CLOSED)) {
                    LOG.warn("Lost connection to: {} - trying to reconnect...", getEndpoint().getConnectionString());
                    closeSession();
                    reconnect(configuration.getInitialReconnectDelay());
                }
            }
        };
        this.messageReceiverListener
                = new MessageReceiverListenerImpl(this, getEndpoint(), getProcessor(), getExceptionHandler());
    }

    @Override
    protected void doStart() throws Exception {
        LOG.debug("Connecting to: {}...", getEndpoint().getConnectionString());

        super.doStart();
        session = createSession();

        LOG.info("Connected to: {}", getEndpoint().getConnectionString());
    }

    private SMPPSession createSession() throws IOException {
        SMPPSession session = createSMPPSession();
        session.setEnquireLinkTimer(configuration.getEnquireLinkTimer());
        session.setTransactionTimer(configuration.getTransactionTimer());
        session.setPduProcessorDegree(this.configuration.getPduProcessorDegree());
        session.setQueueCapacity(this.configuration.getPduProcessorQueueCapacity());
        session.addSessionStateListener(internalSessionStateListener);
        session.setMessageReceiverListener(messageReceiverListener);
        session.connectAndBind(this.configuration.getHost(), this.configuration.getPort(),
                new BindParameter(
                        BindType.BIND_RX, this.configuration.getSystemId(),
                        this.configuration.getPassword(), this.configuration.getSystemType(),
                        TypeOfNumber.UNKNOWN, NumberingPlanIndicator.UNKNOWN,
                        configuration.getAddressRange()));

        return session;
    }

    /**
     * Factory method to easily instantiate a SMPPSession
     * 
     * @return the SMPPSession
     */
    SMPPSession createSMPPSession() {
        return new SMPPSession(
                new SynchronizedPDUSender(
                        new DefaultPDUSender(
                                new DefaultComposer())),
                new DefaultPDUReader(), SmppConnectionFactory
                        .getInstance(configuration));
    }

    @Override
    protected void doStop() throws Exception {
        LOG.debug("Disconnecting from: {}...", getEndpoint().getConnectionString());

        super.doStop();
        closeSession();

        LOG.info("Disconnected from: {}", getEndpoint().getConnectionString());
    }

    private void closeSession() {
        if (session != null) {
            session.removeSessionStateListener(this.internalSessionStateListener);
            session.unbindAndClose();
            // clear session as we closed it successfully
            session = null;
        }
    }

    private boolean doReconnect() {
        if (isServiceStopping(this)) {
            return true;
        }

        if (isSessionClosed(session)) {
            try {
                LOG.info("Trying to reconnect to {}", getEndpoint().getConnectionString());
                session = createSession();
                return true;
            } catch (IOException e) {
                LOG.warn("Failed to reconnect to {}", getEndpoint().getConnectionString());
                closeSession();

                return false;
            }
        }

        return true;
    }

    private void reconnect(final long initialReconnectDelay) {
        if (reconnectLock.tryLock()) {
            BlockingTask task = newReconnectTask(this, getEndpoint(), initialReconnectDelay,
                    configuration.getMaxReconnect());

            try {
                task.run(this::doReconnect);
            } finally {
                reconnectLock.unlock();
            }
        }
    }

    @Override
    public String toString() {
        return "SmppConsumer[" + getEndpoint().getConnectionString() + "]";
    }

    @Override
    public SmppEndpoint getEndpoint() {
        return (SmppEndpoint) super.getEndpoint();
    }

    /**
     * Returns the smpp configuration
     * 
     * @return the configuration
     */
    public SmppConfiguration getConfiguration() {
        return configuration;
    }
}
