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
import org.apache.camel.model.cloud.ServiceCallConfigurationDefinition;

public class RibbonServiceCallRegistryRouteTest extends RibbonServiceCallRouteTest {

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                // setup a static ribbon server list with these 2 servers to start with
                StaticServiceDiscovery servers = new StaticServiceDiscovery();
                servers.addServer("myService@localhost:" + PORT1);
                servers.addServer("myService@localhost:" + PORT2);

                RibbonConfiguration configuration = new RibbonConfiguration();
                RibbonServiceLoadBalancer loadBalancer = new RibbonServiceLoadBalancer(configuration);

                // configure camel service call
                ServiceCallConfigurationDefinition config = new ServiceCallConfigurationDefinition();
                config.setLoadBalancer(loadBalancer);
                config.setServiceDiscovery(servers);

                // register configuration
                context.setServiceCallConfiguration(config);

                from("direct:start")
                        .serviceCall()
                        .name("myService")
                        .component("http")
                        .end()
                        .to("mock:result");
                fromF("jetty:http://localhost:%d", PORT1)
                        .to("mock:" + ROUTE_1_ID)
                        .transform().constant("9090");
                fromF("jetty:http://localhost:%d", PORT2)
                        .to("mock:" + ROUTE_2_ID)
                        .transform().constant("9091");
            }
        };
    }
}
