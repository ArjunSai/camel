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
package org.apache.camel.component.ribbon.cloud;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.ribbon.RibbonConfiguration;
import org.apache.camel.impl.cloud.StaticServiceDiscovery;
import org.apache.camel.test.AvailablePortFinder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.apache.camel.util.ObjectHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RibbonServiceCallUpdateRouteTest extends CamelTestSupport {
    private static final int PORT1 = AvailablePortFinder.getNextAvailable();
    private static final int PORT2 = AvailablePortFinder.getNextAvailable();

    private static final Logger LOG = LoggerFactory.getLogger(RibbonServiceCallUpdateRouteTest.class);
    private final StaticServiceDiscovery servers = new StaticServiceDiscovery();

    @Override
    @BeforeEach
    public void setUp() throws Exception {
        // setup a static ribbon server list with these 2 servers to start with
        servers.addServer("myService@localhost:" + PORT1);
        servers.addServer("myService@localhost:" + PORT2);

        super.setUp();
    }

    @Test
    public void testServiceCall() throws Exception {
        getMockEndpoint("mock:" + PORT1).expectedMessageCount(1);
        getMockEndpoint("mock:" + PORT2).expectedMessageCount(1);
        getMockEndpoint("mock:result").expectedMessageCount(2);

        String out = template.requestBody("direct:start", null, String.class);
        String out2 = template.requestBody("direct:start", null, String.class);
        assertEquals("9091", out);
        assertEquals("9090", out2);

        assertMockEndpointsSatisfied();

        // stop the first server and remove it from the known list of servers
        context.getRouteController().stopRoute(String.valueOf(PORT1));
        servers.removeServer(s -> ObjectHelper.equal("localhost", s.getHost()) && PORT1 == s.getPort());

        // call the other active server
        String out3 = template.requestBody("direct:start", null, String.class);
        assertEquals("9091", out3);

        // sleep a bit to make the server updated run and detect that a server is no longer in the list
        LOG.debug("Sleeping to all the server list updated to run");
        Thread.sleep(1000);
        LOG.debug("Calling the service now");

        // call again and it should call 9091 as its the only active server
        String out4 = template.requestBody("direct:start", null, String.class);
        assertEquals("9091", out4);
    }

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                RibbonConfiguration configuration = new RibbonConfiguration();
                // lets update quick so we do not have to sleep so much in the tests
                configuration.addProperty("ServerListRefreshInterval", "250");
                RibbonServiceLoadBalancer loadBalancer = new RibbonServiceLoadBalancer(configuration);

                from("direct:start")
                        .serviceCall()
                        .name("myService")
                        .component("http")
                        .loadBalancer(loadBalancer)
                        .serviceDiscovery(servers)
                        .end()
                        .to("mock:result");
                fromF("jetty:http://localhost:%d", PORT1).routeId(String.valueOf(PORT1))
                        .to("mock:" + PORT1)
                        .transform().constant("9090");
                fromF("jetty:http://localhost:%d", PORT2).routeId(String.valueOf(PORT2))
                        .to("mock:" + PORT2)
                        .transform().constant("9091");
            }
        };
    }
}
