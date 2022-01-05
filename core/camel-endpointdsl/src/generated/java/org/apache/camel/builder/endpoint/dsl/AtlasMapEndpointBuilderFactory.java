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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Transforms the message using an AtlasMap transformation.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AtlasMapEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AtlasMap component.
     */
    public interface AtlasMapEndpointBuilder extends EndpointProducerBuilder {
        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowContextMapAll the value to set
         * @return the dsl builder
         */
        default AtlasMapEndpointBuilder allowContextMapAll(
                boolean allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowContextMapAll the value to set
         * @return the dsl builder
         */
        default AtlasMapEndpointBuilder allowContextMapAll(
                String allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default AtlasMapEndpointBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default AtlasMapEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AtlasMapEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AtlasMapEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The Exchange property name for a source message map which hold
         * &lt;code&gt;java.util.Map&lt;String, Message&gt; where the key is
         * AtlasMap Document ID. AtlasMap consumes Message bodies as source
         * documents, as well as message headers as source properties where the
         * scope equals to Document ID.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param sourceMapName the value to set
         * @return the dsl builder
         */
        default AtlasMapEndpointBuilder sourceMapName(String sourceMapName) {
            doSetProperty("sourceMapName", sourceMapName);
            return this;
        }
        /**
         * TargetMapMode enum value to specify how multiple target documents are
         * delivered if exist. &lt;ul&gt; &lt;li&gt;'MAP': Stores them into a
         * java.util.Map, and the java.util.Map is set to an exchange property
         * if 'targetMapName' is specified, otherwise message body.
         * &lt;li&gt;'MESSAGE_HEADER': Stores them into message headers.
         * &lt;li&gt;'EXCHANGE_PROPERTY': Stores them into exchange properties.
         * ).
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.atlasmap.AtlasMapEndpoint$TargetMapMode&lt;/code&gt; type.
         * 
         * Default: MAP
         * Group: producer
         * 
         * @param targetMapMode the value to set
         * @return the dsl builder
         */
        default AtlasMapEndpointBuilder targetMapMode(
                TargetMapMode targetMapMode) {
            doSetProperty("targetMapMode", targetMapMode);
            return this;
        }
        /**
         * TargetMapMode enum value to specify how multiple target documents are
         * delivered if exist. &lt;ul&gt; &lt;li&gt;'MAP': Stores them into a
         * java.util.Map, and the java.util.Map is set to an exchange property
         * if 'targetMapName' is specified, otherwise message body.
         * &lt;li&gt;'MESSAGE_HEADER': Stores them into message headers.
         * &lt;li&gt;'EXCHANGE_PROPERTY': Stores them into exchange properties.
         * ).
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.atlasmap.AtlasMapEndpoint$TargetMapMode&lt;/code&gt; type.
         * 
         * Default: MAP
         * Group: producer
         * 
         * @param targetMapMode the value to set
         * @return the dsl builder
         */
        default AtlasMapEndpointBuilder targetMapMode(String targetMapMode) {
            doSetProperty("targetMapMode", targetMapMode);
            return this;
        }
        /**
         * The Exchange property name for a target document map which hold
         * &lt;code&gt;java.util.Map&lt;String, Object&gt; where the key is
         * AtlasMap Document ID. AtlasMap populates multiple target documents
         * into this map.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param targetMapName the value to set
         * @return the dsl builder
         */
        default AtlasMapEndpointBuilder targetMapName(String targetMapName) {
            doSetProperty("targetMapName", targetMapName);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.atlasmap.AtlasMapEndpoint$TargetMapMode</code> enum.
     */
    enum TargetMapMode {
        MAP,
        MESSAGE_HEADER,
        EXCHANGE_PROPERTY;
    }

    public interface AtlasMapBuilders {
        /**
         * AtlasMap (camel-atlasmap)
         * Transforms the message using an AtlasMap transformation.
         * 
         * Category: transformation
         * Since: 3.7
         * Maven coordinates: org.apache.camel:camel-atlasmap
         * 
         * Syntax: <code>atlasmap:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * 
         * @param path resourceUri
         * @return the dsl builder
         */
        default AtlasMapEndpointBuilder atlasmap(String path) {
            return AtlasMapEndpointBuilderFactory.endpointBuilder("atlasmap", path);
        }
        /**
         * AtlasMap (camel-atlasmap)
         * Transforms the message using an AtlasMap transformation.
         * 
         * Category: transformation
         * Since: 3.7
         * Maven coordinates: org.apache.camel:camel-atlasmap
         * 
         * Syntax: <code>atlasmap:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path resourceUri
         * @return the dsl builder
         */
        default AtlasMapEndpointBuilder atlasmap(
                String componentName,
                String path) {
            return AtlasMapEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static AtlasMapEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class AtlasMapEndpointBuilderImpl extends AbstractEndpointBuilder implements AtlasMapEndpointBuilder {
            public AtlasMapEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new AtlasMapEndpointBuilderImpl(path);
    }
}