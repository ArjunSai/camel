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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.azure.storage.datalake.DataLakeComponent;

/**
 * Camel Azure Datalake Gen2 Component
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AzureStorageDatalakeComponentBuilderFactory {

    /**
     * Azure storage datalake service (camel-azure-storage-datalake)
     * Camel Azure Datalake Gen2 Component
     * 
     * Category: cloud,file
     * Since: 3.8
     * Maven coordinates: org.apache.camel:camel-azure-storage-datalake
     * 
     * @return the dsl builder
     */
    static AzureStorageDatalakeComponentBuilder azureStorageDatalake() {
        return new AzureStorageDatalakeComponentBuilderImpl();
    }

    /**
     * Builder for the Azure storage datalake service component.
     */
    interface AzureStorageDatalakeComponentBuilder
            extends
                ComponentBuilder<DataLakeComponent> {
        /**
         * account key for authentication.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param accountKey the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder accountKey(
                java.lang.String accountKey) {
            doSetProperty("accountKey", accountKey);
            return this;
        }
        /**
         * client id for azure account.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param clientId the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder clientId(
                java.lang.String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * client secret for azure account.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param clientSecret the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder clientSecret(
                java.lang.String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * client secret credential for authentication.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.identity.ClientSecretCredential&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param clientSecretCredential the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder clientSecretCredential(
                com.azure.identity.ClientSecretCredential clientSecretCredential) {
            doSetProperty("clientSecretCredential", clientSecretCredential);
            return this;
        }
        /**
         * Whether or not a file changed event raised indicates completion
         * (true) or modification (false).
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param close the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder close(
                java.lang.Boolean close) {
            doSetProperty("close", close);
            return this;
        }
        /**
         * check for closing stream after read.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param closeStreamAfterRead the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder closeStreamAfterRead(
                java.lang.Boolean closeStreamAfterRead) {
            doSetProperty("closeStreamAfterRead", closeStreamAfterRead);
            return this;
        }
        /**
         * configuration object for datalake.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder configuration(
                org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * count number of bytes to download.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param dataCount the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder dataCount(
                java.lang.Long dataCount) {
            doSetProperty("dataCount", dataCount);
            return this;
        }
        /**
         * directory of the file to be handled in component.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param directoryName the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder directoryName(
                java.lang.String directoryName) {
            doSetProperty("directoryName", directoryName);
            return this;
        }
        /**
         * download link expiration time.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param downloadLinkExpiration the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder downloadLinkExpiration(
                java.lang.Long downloadLinkExpiration) {
            doSetProperty("downloadLinkExpiration", downloadLinkExpiration);
            return this;
        }
        /**
         * expression for queryInputStream.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param expression the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder expression(
                java.lang.String expression) {
            doSetProperty("expression", expression);
            return this;
        }
        /**
         * directory of file to do operations in the local system.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param fileDir the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder fileDir(
                java.lang.String fileDir) {
            doSetProperty("fileDir", fileDir);
            return this;
        }
        /**
         * name of file to be handled in component.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param fileName the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder fileName(
                java.lang.String fileName) {
            doSetProperty("fileName", fileName);
            return this;
        }
        /**
         * offset position in file for different operations.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param fileOffset the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder fileOffset(
                java.lang.Long fileOffset) {
            doSetProperty("fileOffset", fileOffset);
            return this;
        }
        /**
         * maximum number of results to show at a time.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param maxResults the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder maxResults(
                java.lang.Integer maxResults) {
            doSetProperty("maxResults", maxResults);
            return this;
        }
        /**
         * no of retries to a given request.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param maxRetryRequests the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder maxRetryRequests(
                int maxRetryRequests) {
            doSetProperty("maxRetryRequests", maxRetryRequests);
            return this;
        }
        /**
         * set open options for creating file.
         * 
         * The option is a:
         * &lt;code&gt;java.util.Set&lt;java.nio.file.OpenOption&gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param openOptions the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder openOptions(
                java.util.Set<java.nio.file.OpenOption> openOptions) {
            doSetProperty("openOptions", openOptions);
            return this;
        }
        /**
         * path in azure datalake for operations.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param path the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder path(java.lang.String path) {
            doSetProperty("path", path);
            return this;
        }
        /**
         * permission string for the file.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param permission the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder permission(
                java.lang.String permission) {
            doSetProperty("permission", permission);
            return this;
        }
        /**
         * This parameter allows the caller to upload data in parallel and
         * control the order in which it is appended to the file.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param position the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder position(
                java.lang.Long position) {
            doSetProperty("position", position);
            return this;
        }
        /**
         * recursively include all paths.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param recursive the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder recursive(
                java.lang.Boolean recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
        /**
         * regular expression for matching file names.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param regex the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder regex(
                java.lang.String regex) {
            doSetProperty("regex", regex);
            return this;
        }
        /**
         * Whether or not uncommitted data is to be retained after the
         * operation.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param retainUncommitedData the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder retainUncommitedData(
                java.lang.Boolean retainUncommitedData) {
            doSetProperty("retainUncommitedData", retainUncommitedData);
            return this;
        }
        /**
         * datalake service client for azure storage datalake.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.storage.file.datalake.DataLakeServiceClient&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceClient the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder serviceClient(
                com.azure.storage.file.datalake.DataLakeServiceClient serviceClient) {
            doSetProperty("serviceClient", serviceClient);
            return this;
        }
        /**
         * shared key credential for azure datalake gen2.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.storage.common.StorageSharedKeyCredential&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param sharedKeyCredential the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder sharedKeyCredential(
                com.azure.storage.common.StorageSharedKeyCredential sharedKeyCredential) {
            doSetProperty("sharedKeyCredential", sharedKeyCredential);
            return this;
        }
        /**
         * tenant id for azure account.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param tenantId the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder tenantId(
                java.lang.String tenantId) {
            doSetProperty("tenantId", tenantId);
            return this;
        }
        /**
         * Timeout for operation.
         * 
         * The option is a: &lt;code&gt;java.time.Duration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder timeout(
                java.time.Duration timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * umask permission for file.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param umask the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder umask(
                java.lang.String umask) {
            doSetProperty("umask", umask);
            return this;
        }
        /**
         * whether or not to use upn.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param userPrincipalNameReturned the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder userPrincipalNameReturned(
                java.lang.Boolean userPrincipalNameReturned) {
            doSetProperty("userPrincipalNameReturned", userPrincipalNameReturned);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
        default AzureStorageDatalakeComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * operation to be performed.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.storage.datalake.DataLakeOperationsDefinition&lt;/code&gt; type.
         * 
         * Default: listFileSystem
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder operation(
                org.apache.camel.component.azure.storage.datalake.DataLakeOperationsDefinition operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default AzureStorageDatalakeComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    }

    class AzureStorageDatalakeComponentBuilderImpl
            extends
                AbstractComponentBuilder<DataLakeComponent>
            implements
                AzureStorageDatalakeComponentBuilder {
        @Override
        protected DataLakeComponent buildConcreteComponent() {
            return new DataLakeComponent();
        }
        private org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration getOrCreateConfiguration(
                org.apache.camel.component.azure.storage.datalake.DataLakeComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "accountKey": getOrCreateConfiguration((DataLakeComponent) component).setAccountKey((java.lang.String) value); return true;
            case "clientId": getOrCreateConfiguration((DataLakeComponent) component).setClientId((java.lang.String) value); return true;
            case "clientSecret": getOrCreateConfiguration((DataLakeComponent) component).setClientSecret((java.lang.String) value); return true;
            case "clientSecretCredential": getOrCreateConfiguration((DataLakeComponent) component).setClientSecretCredential((com.azure.identity.ClientSecretCredential) value); return true;
            case "close": getOrCreateConfiguration((DataLakeComponent) component).setClose((java.lang.Boolean) value); return true;
            case "closeStreamAfterRead": getOrCreateConfiguration((DataLakeComponent) component).setCloseStreamAfterRead((java.lang.Boolean) value); return true;
            case "configuration": ((DataLakeComponent) component).setConfiguration((org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration) value); return true;
            case "dataCount": getOrCreateConfiguration((DataLakeComponent) component).setDataCount((java.lang.Long) value); return true;
            case "directoryName": getOrCreateConfiguration((DataLakeComponent) component).setDirectoryName((java.lang.String) value); return true;
            case "downloadLinkExpiration": getOrCreateConfiguration((DataLakeComponent) component).setDownloadLinkExpiration((java.lang.Long) value); return true;
            case "expression": getOrCreateConfiguration((DataLakeComponent) component).setExpression((java.lang.String) value); return true;
            case "fileDir": getOrCreateConfiguration((DataLakeComponent) component).setFileDir((java.lang.String) value); return true;
            case "fileName": getOrCreateConfiguration((DataLakeComponent) component).setFileName((java.lang.String) value); return true;
            case "fileOffset": getOrCreateConfiguration((DataLakeComponent) component).setFileOffset((java.lang.Long) value); return true;
            case "maxResults": getOrCreateConfiguration((DataLakeComponent) component).setMaxResults((java.lang.Integer) value); return true;
            case "maxRetryRequests": getOrCreateConfiguration((DataLakeComponent) component).setMaxRetryRequests((int) value); return true;
            case "openOptions": getOrCreateConfiguration((DataLakeComponent) component).setOpenOptions((java.util.Set) value); return true;
            case "path": getOrCreateConfiguration((DataLakeComponent) component).setPath((java.lang.String) value); return true;
            case "permission": getOrCreateConfiguration((DataLakeComponent) component).setPermission((java.lang.String) value); return true;
            case "position": getOrCreateConfiguration((DataLakeComponent) component).setPosition((java.lang.Long) value); return true;
            case "recursive": getOrCreateConfiguration((DataLakeComponent) component).setRecursive((java.lang.Boolean) value); return true;
            case "regex": getOrCreateConfiguration((DataLakeComponent) component).setRegex((java.lang.String) value); return true;
            case "retainUncommitedData": getOrCreateConfiguration((DataLakeComponent) component).setRetainUncommitedData((java.lang.Boolean) value); return true;
            case "serviceClient": getOrCreateConfiguration((DataLakeComponent) component).setServiceClient((com.azure.storage.file.datalake.DataLakeServiceClient) value); return true;
            case "sharedKeyCredential": getOrCreateConfiguration((DataLakeComponent) component).setSharedKeyCredential((com.azure.storage.common.StorageSharedKeyCredential) value); return true;
            case "tenantId": getOrCreateConfiguration((DataLakeComponent) component).setTenantId((java.lang.String) value); return true;
            case "timeout": getOrCreateConfiguration((DataLakeComponent) component).setTimeout((java.time.Duration) value); return true;
            case "umask": getOrCreateConfiguration((DataLakeComponent) component).setUmask((java.lang.String) value); return true;
            case "userPrincipalNameReturned": getOrCreateConfiguration((DataLakeComponent) component).setUserPrincipalNameReturned((java.lang.Boolean) value); return true;
            case "bridgeErrorHandler": ((DataLakeComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((DataLakeComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((DataLakeComponent) component).setOperation((org.apache.camel.component.azure.storage.datalake.DataLakeOperationsDefinition) value); return true;
            case "autowiredEnabled": ((DataLakeComponent) component).setAutowiredEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}