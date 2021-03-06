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
import org.apache.camel.impl.cloud.DefaultServiceDefinition;
import org.apache.camel.impl.cloud.StaticServiceDiscovery;
import org.apache.camel.test.AvailablePortFinder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RibbonServiceCallRouteMetadataTest extends CamelTestSupport {
    private static final int PORT1 = AvailablePortFinder.getNextAvailable();
    private static final int PORT2 = AvailablePortFinder.getNextAvailable();

    @Test
    public void testServiceCall() throws Exception {
        getMockEndpoint("mock:app1").expectedMessageCount(1);
        getMockEndpoint("mock:app2").expectedMessageCount(1);
        getMockEndpoint("mock:result").expectedMessageCount(2);

        String out = template.requestBody("direct:start", null, String.class);
        String out2 = template.requestBody("direct:start", null, String.class);
        assertEquals("app2", out);
        assertEquals("app1", out2);

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                // setup a static ribbon server list with these 2 servers to start with
                StaticServiceDiscovery servers = new StaticServiceDiscovery();
                servers.addServer(DefaultServiceDefinition.builder().withName("myService").withHost("localhost").withPort(PORT1)
                        .addMeta("contextPath", "app1").build());
                servers.addServer(DefaultServiceDefinition.builder().withName("myService").withHost("localhost").withPort(PORT2)
                        .addMeta("contextPath", "app2").build());

                RibbonConfiguration configuration = new RibbonConfiguration();
                RibbonServiceLoadBalancer loadBalancer = new RibbonServiceLoadBalancer(configuration);

                from("direct:start")
                        .serviceCall()
                        .name("myService")
                        .expression()
                        .simple("http://${header.CamelServiceCallServiceHost}:${header.CamelServiceCallServicePort}/${header.CamelServiceCallServiceMeta[contextPath]}")
                        .loadBalancer(loadBalancer)
                        .serviceDiscovery(servers)
                        .end()
                        .to("mock:result");
                fromF("jetty:http://localhost:%d/app1", PORT1)
                        .to("mock:app1")
                        .transform().constant("app1");
                fromF("jetty:http://localhost:%d/app2", PORT2)
                        .to("mock:app2")
                        .transform().constant("app2");
            }
        };
    }
}
