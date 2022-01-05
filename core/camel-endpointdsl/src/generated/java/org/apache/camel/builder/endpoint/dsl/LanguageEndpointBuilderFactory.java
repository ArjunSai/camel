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
 * Execute scripts in any of the languages supported by Camel.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LanguageEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Language component.
     */
    public interface LanguageEndpointBuilder extends EndpointProducerBuilder {
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
        default LanguageEndpointBuilder allowContextMapAll(
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
        default LanguageEndpointBuilder allowContextMapAll(
                String allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Whether the script is binary content or text content. &lt;p/&gt; By
         * default the script is read as text content (eg
         * &lt;tt&gt;java.lang.String).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param binary the value to set
         * @return the dsl builder
         */
        default LanguageEndpointBuilder binary(boolean binary) {
            doSetProperty("binary", binary);
            return this;
        }
        /**
         * Whether the script is binary content or text content. &lt;p/&gt; By
         * default the script is read as text content (eg
         * &lt;tt&gt;java.lang.String).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param binary the value to set
         * @return the dsl builder
         */
        default LanguageEndpointBuilder binary(String binary) {
            doSetProperty("binary", binary);
            return this;
        }
        /**
         * Whether to cache the compiled script and reuse &lt;p/&gt; Notice
         * reusing the script can cause side effects from processing one Camel
         * org.apache.camel.Exchange to the next org.apache.camel.Exchange.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param cacheScript the value to set
         * @return the dsl builder
         */
        default LanguageEndpointBuilder cacheScript(boolean cacheScript) {
            doSetProperty("cacheScript", cacheScript);
            return this;
        }
        /**
         * Whether to cache the compiled script and reuse &lt;p/&gt; Notice
         * reusing the script can cause side effects from processing one Camel
         * org.apache.camel.Exchange to the next org.apache.camel.Exchange.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param cacheScript the value to set
         * @return the dsl builder
         */
        default LanguageEndpointBuilder cacheScript(String cacheScript) {
            doSetProperty("cacheScript", cacheScript);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default LanguageEndpointBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default LanguageEndpointBuilder contentCache(String contentCache) {
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
        default LanguageEndpointBuilder lazyStartProducer(
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
        default LanguageEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Sets the script to execute.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param script the value to set
         * @return the dsl builder
         */
        default LanguageEndpointBuilder script(String script) {
            doSetProperty("script", script);
            return this;
        }
        /**
         * Whether or not the result of the script should be used as message
         * body. &lt;p/&gt; This options is default &lt;tt&gt;true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param transform the value to set
         * @return the dsl builder
         */
        default LanguageEndpointBuilder transform(boolean transform) {
            doSetProperty("transform", transform);
            return this;
        }
        /**
         * Whether or not the result of the script should be used as message
         * body. &lt;p/&gt; This options is default &lt;tt&gt;true.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param transform the value to set
         * @return the dsl builder
         */
        default LanguageEndpointBuilder transform(String transform) {
            doSetProperty("transform", transform);
            return this;
        }
    }

    public interface LanguageBuilders {
        /**
         * Language (camel-language)
         * Execute scripts in any of the languages supported by Camel.
         * 
         * Category: core,script
         * Since: 2.5
         * Maven coordinates: org.apache.camel:camel-language
         * 
         * Syntax: <code>language:languageName:resourceUri</code>
         * 
         * Path parameter: languageName (required)
         * Sets the name of the language to use
         * There are 20 enums and the value can be one of: bean, constant,
         * exchangeProperty, file, groovy, header, javascript, jsonpath, mvel,
         * ognl, , ref, simple, spel, sql, terser, tokenize, xpath, xquery,
         * xtokenize
         * 
         * Path parameter: resourceUri
         * Path to the resource, or a reference to lookup a bean in the Registry
         * to use as the resource
         * 
         * @param path languageName:resourceUri
         * @return the dsl builder
         */
        default LanguageEndpointBuilder language(String path) {
            return LanguageEndpointBuilderFactory.endpointBuilder("language", path);
        }
        /**
         * Language (camel-language)
         * Execute scripts in any of the languages supported by Camel.
         * 
         * Category: core,script
         * Since: 2.5
         * Maven coordinates: org.apache.camel:camel-language
         * 
         * Syntax: <code>language:languageName:resourceUri</code>
         * 
         * Path parameter: languageName (required)
         * Sets the name of the language to use
         * There are 20 enums and the value can be one of: bean, constant,
         * exchangeProperty, file, groovy, header, javascript, jsonpath, mvel,
         * ognl, , ref, simple, spel, sql, terser, tokenize, xpath, xquery,
         * xtokenize
         * 
         * Path parameter: resourceUri
         * Path to the resource, or a reference to lookup a bean in the Registry
         * to use as the resource
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path languageName:resourceUri
         * @return the dsl builder
         */
        default LanguageEndpointBuilder language(
                String componentName,
                String path) {
            return LanguageEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static LanguageEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class LanguageEndpointBuilderImpl extends AbstractEndpointBuilder implements LanguageEndpointBuilder {
            public LanguageEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new LanguageEndpointBuilderImpl(path);
    }
}