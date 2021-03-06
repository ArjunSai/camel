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
package org.apache.camel.management;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.apache.camel.management.DefaultManagementObjectNameStrategy.TYPE_COMPONENT;
import static org.apache.camel.management.DefaultManagementObjectNameStrategy.TYPE_ENDPOINT;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisabledOnOs(OS.AIX)
public class JmxRecipientListTest extends ManagementTestSupport {

    @Test
    public void testJmxEndpointsAddedDynamicallyDefaultRegister() throws Exception {
        MockEndpoint x = getMockEndpoint("mock:x");
        MockEndpoint y = getMockEndpoint("mock:y");
        MockEndpoint z = getMockEndpoint("mock:z");

        x.expectedBodiesReceived("answer");
        y.expectedBodiesReceived("answer");
        z.expectedBodiesReceived("answer");

        sendBody();

        assertMockEndpointsSatisfied();

        MBeanServer mbeanServer = getMBeanServer();

        // this endpoint is part of the route and should be registered
        ObjectName name = getCamelObjectName(TYPE_ENDPOINT, "direct://a");
        assertTrue(mbeanServer.isRegistered(name), "Should be registered");

        // endpoints added after routes has been started is by default not registered
        name = getCamelObjectName(TYPE_ENDPOINT, "mock://x");
        assertFalse(mbeanServer.isRegistered(name), "Should not be registered");

        name = getCamelObjectName(TYPE_ENDPOINT, "mock://y");
        assertFalse(mbeanServer.isRegistered(name), "Should not be registered");

        name = getCamelObjectName(TYPE_ENDPOINT, "mock://z");
        assertFalse(mbeanServer.isRegistered(name), "Should not be registered");

        // however components is always registered
        name = getCamelObjectName(TYPE_COMPONENT, "mock");
        assertTrue(mbeanServer.isRegistered(name), "Should be registered");
    }

    @Test
    public void testJmxEndpointsAddedDynamicallyAlwaysRegister() throws Exception {
        // enable always register
        context.getManagementStrategy().getManagementAgent().setRegisterAlways(true);

        MockEndpoint x = getMockEndpoint("mock:x");
        MockEndpoint y = getMockEndpoint("mock:y");
        MockEndpoint z = getMockEndpoint("mock:z");

        x.expectedBodiesReceived("answer");
        y.expectedBodiesReceived("answer");
        z.expectedBodiesReceived("answer");

        sendBody();

        assertMockEndpointsSatisfied();

        MBeanServer mbeanServer = getMBeanServer();

        // this endpoint is part of the route and should be registered
        ObjectName name = getCamelObjectName(TYPE_ENDPOINT, "direct://a");
        assertTrue(mbeanServer.isRegistered(name), "Should be registered: " + name);

        // endpoints added after routes has been started is now also registered
        name = getCamelObjectName(TYPE_ENDPOINT, "mock://x");
        assertTrue(mbeanServer.isRegistered(name), "Should be registered: " + name);

        name = getCamelObjectName(TYPE_ENDPOINT, "mock://y");
        assertTrue(mbeanServer.isRegistered(name), "Should be registered: " + name);

        name = getCamelObjectName(TYPE_ENDPOINT, "mock://z");
        assertTrue(mbeanServer.isRegistered(name), "Should be registered: " + name);

        // however components is always registered
        name = getCamelObjectName(TYPE_COMPONENT, "mock");
        assertTrue(mbeanServer.isRegistered(name), "Should be registered: " + name);
    }

    protected void sendBody() {
        template.sendBodyAndHeader("direct:a", "answer", "recipientListHeader",
                "mock:x,mock:y,mock:z");
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("direct:a").recipientList(
                        header("recipientListHeader").tokenize(","));
            }
        };

    }

}
