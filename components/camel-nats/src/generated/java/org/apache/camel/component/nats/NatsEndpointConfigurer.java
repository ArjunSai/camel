/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.nats;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class NatsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        NatsEndpoint target = (NatsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "connection": target.getConfiguration().setConnection(property(camelContext, io.nats.client.Connection.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.getConfiguration().setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "flushconnection":
        case "flushConnection": target.getConfiguration().setFlushConnection(property(camelContext, boolean.class, value)); return true;
        case "flushtimeout":
        case "flushTimeout": target.getConfiguration().setFlushTimeout(property(camelContext, int.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxmessages":
        case "maxMessages": target.getConfiguration().setMaxMessages(property(camelContext, java.lang.String.class, value)); return true;
        case "maxpingsout":
        case "maxPingsOut": target.getConfiguration().setMaxPingsOut(property(camelContext, int.class, value)); return true;
        case "maxreconnectattempts":
        case "maxReconnectAttempts": target.getConfiguration().setMaxReconnectAttempts(property(camelContext, int.class, value)); return true;
        case "noecho":
        case "noEcho": target.getConfiguration().setNoEcho(property(camelContext, boolean.class, value)); return true;
        case "norandomizeservers":
        case "noRandomizeServers": target.getConfiguration().setNoRandomizeServers(property(camelContext, boolean.class, value)); return true;
        case "pedantic": target.getConfiguration().setPedantic(property(camelContext, boolean.class, value)); return true;
        case "pinginterval":
        case "pingInterval": target.getConfiguration().setPingInterval(property(camelContext, int.class, value)); return true;
        case "poolsize":
        case "poolSize": target.getConfiguration().setPoolSize(property(camelContext, int.class, value)); return true;
        case "queuename":
        case "queueName": target.getConfiguration().setQueueName(property(camelContext, java.lang.String.class, value)); return true;
        case "reconnect": target.getConfiguration().setReconnect(property(camelContext, boolean.class, value)); return true;
        case "reconnecttimewait":
        case "reconnectTimeWait": target.getConfiguration().setReconnectTimeWait(property(camelContext, int.class, value)); return true;
        case "replysubject":
        case "replySubject": target.getConfiguration().setReplySubject(property(camelContext, java.lang.String.class, value)); return true;
        case "replytodisabled":
        case "replyToDisabled": target.getConfiguration().setReplyToDisabled(property(camelContext, boolean.class, value)); return true;
        case "requestcleanupinterval":
        case "requestCleanupInterval": target.getConfiguration().setRequestCleanupInterval(property(camelContext, int.class, value)); return true;
        case "secure": target.getConfiguration().setSecure(property(camelContext, boolean.class, value)); return true;
        case "servers": target.getConfiguration().setServers(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "traceconnection":
        case "traceConnection": target.getConfiguration().setTraceConnection(property(camelContext, boolean.class, value)); return true;
        case "verbose": target.getConfiguration().setVerbose(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "connection": return io.nats.client.Connection.class;
        case "connectiontimeout":
        case "connectionTimeout": return int.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "flushconnection":
        case "flushConnection": return boolean.class;
        case "flushtimeout":
        case "flushTimeout": return int.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxmessages":
        case "maxMessages": return java.lang.String.class;
        case "maxpingsout":
        case "maxPingsOut": return int.class;
        case "maxreconnectattempts":
        case "maxReconnectAttempts": return int.class;
        case "noecho":
        case "noEcho": return boolean.class;
        case "norandomizeservers":
        case "noRandomizeServers": return boolean.class;
        case "pedantic": return boolean.class;
        case "pinginterval":
        case "pingInterval": return int.class;
        case "poolsize":
        case "poolSize": return int.class;
        case "queuename":
        case "queueName": return java.lang.String.class;
        case "reconnect": return boolean.class;
        case "reconnecttimewait":
        case "reconnectTimeWait": return int.class;
        case "replysubject":
        case "replySubject": return java.lang.String.class;
        case "replytodisabled":
        case "replyToDisabled": return boolean.class;
        case "requestcleanupinterval":
        case "requestCleanupInterval": return int.class;
        case "secure": return boolean.class;
        case "servers": return java.lang.String.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "synchronous": return boolean.class;
        case "traceconnection":
        case "traceConnection": return boolean.class;
        case "verbose": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        NatsEndpoint target = (NatsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "connection": return target.getConfiguration().getConnection();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConfiguration().getConnectionTimeout();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "flushconnection":
        case "flushConnection": return target.getConfiguration().isFlushConnection();
        case "flushtimeout":
        case "flushTimeout": return target.getConfiguration().getFlushTimeout();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxmessages":
        case "maxMessages": return target.getConfiguration().getMaxMessages();
        case "maxpingsout":
        case "maxPingsOut": return target.getConfiguration().getMaxPingsOut();
        case "maxreconnectattempts":
        case "maxReconnectAttempts": return target.getConfiguration().getMaxReconnectAttempts();
        case "noecho":
        case "noEcho": return target.getConfiguration().isNoEcho();
        case "norandomizeservers":
        case "noRandomizeServers": return target.getConfiguration().isNoRandomizeServers();
        case "pedantic": return target.getConfiguration().isPedantic();
        case "pinginterval":
        case "pingInterval": return target.getConfiguration().getPingInterval();
        case "poolsize":
        case "poolSize": return target.getConfiguration().getPoolSize();
        case "queuename":
        case "queueName": return target.getConfiguration().getQueueName();
        case "reconnect": return target.getConfiguration().isReconnect();
        case "reconnecttimewait":
        case "reconnectTimeWait": return target.getConfiguration().getReconnectTimeWait();
        case "replysubject":
        case "replySubject": return target.getConfiguration().getReplySubject();
        case "replytodisabled":
        case "replyToDisabled": return target.getConfiguration().isReplyToDisabled();
        case "requestcleanupinterval":
        case "requestCleanupInterval": return target.getConfiguration().getRequestCleanupInterval();
        case "secure": return target.getConfiguration().isSecure();
        case "servers": return target.getConfiguration().getServers();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "synchronous": return target.isSynchronous();
        case "traceconnection":
        case "traceConnection": return target.getConfiguration().isTraceConnection();
        case "verbose": return target.getConfiguration().isVerbose();
        default: return null;
        }
    }
}
