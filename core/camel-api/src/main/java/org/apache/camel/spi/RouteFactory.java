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
package org.apache.camel.spi;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.NamedNode;
import org.apache.camel.Route;

/**
 * A factory to create {@link Route}
 */
public interface RouteFactory {

    /**
     * Creates the route which should be configured afterwards with more configurations.
     *
     * @param  camelContext     the camel context
     * @param  routeDefinition  the route definition
     * @param  routeId          the route id
     * @param  routeDescription the route description
     * @param  endpoint         the input endpoint (consumer)
     * @param  resource         the source resource (if loaded via a DSL routes loader)
     * @return                  the created route
     */
    Route createRoute(
            CamelContext camelContext, NamedNode routeDefinition,
            String routeId, String routeDescription, Endpoint endpoint,
            Resource resource);

}
