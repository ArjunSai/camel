/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.cloud;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.model.cloud.EtcdServiceCallServiceDiscoveryConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class EtcdServiceCallServiceDiscoveryConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("Id", java.lang.String.class);
        map.put("Password", java.lang.String.class);
        map.put("Properties", java.util.List.class);
        map.put("ServicePath", java.lang.String.class);
        map.put("SslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("Timeout", java.lang.String.class);
        map.put("Type", java.lang.String.class);
        map.put("Uris", java.lang.String.class);
        map.put("UserName", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.model.cloud.EtcdServiceCallServiceDiscoveryConfiguration target = (org.apache.camel.model.cloud.EtcdServiceCallServiceDiscoveryConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "id":
        case "Id": target.setId(property(camelContext, java.lang.String.class, value)); return true;
        case "password":
        case "Password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "properties":
        case "Properties": target.setProperties(property(camelContext, java.util.List.class, value)); return true;
        case "servicepath":
        case "ServicePath": target.setServicePath(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "SslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "timeout":
        case "Timeout": target.setTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "type":
        case "Type": target.setType(property(camelContext, java.lang.String.class, value)); return true;
        case "uris":
        case "Uris": target.setUris(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "UserName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "id":
        case "Id": return java.lang.String.class;
        case "password":
        case "Password": return java.lang.String.class;
        case "properties":
        case "Properties": return java.util.List.class;
        case "servicepath":
        case "ServicePath": return java.lang.String.class;
        case "sslcontextparameters":
        case "SslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "timeout":
        case "Timeout": return java.lang.String.class;
        case "type":
        case "Type": return java.lang.String.class;
        case "uris":
        case "Uris": return java.lang.String.class;
        case "username":
        case "UserName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.model.cloud.EtcdServiceCallServiceDiscoveryConfiguration target = (org.apache.camel.model.cloud.EtcdServiceCallServiceDiscoveryConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "id":
        case "Id": return target.getId();
        case "password":
        case "Password": return target.getPassword();
        case "properties":
        case "Properties": return target.getProperties();
        case "servicepath":
        case "ServicePath": return target.getServicePath();
        case "sslcontextparameters":
        case "SslContextParameters": return target.getSslContextParameters();
        case "timeout":
        case "Timeout": return target.getTimeout();
        case "type":
        case "Type": return target.getType();
        case "uris":
        case "Uris": return target.getUris();
        case "username":
        case "UserName": return target.getUserName();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "properties":
        case "Properties": return org.apache.camel.model.PropertyDefinition.class;
        default: return null;
        }
    }
}

