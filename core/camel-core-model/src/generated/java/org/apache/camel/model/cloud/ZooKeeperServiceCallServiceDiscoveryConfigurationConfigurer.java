/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.cloud;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.model.cloud.ZooKeeperServiceCallServiceDiscoveryConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ZooKeeperServiceCallServiceDiscoveryConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("BasePath", java.lang.String.class);
        map.put("ConnectionTimeout", java.lang.String.class);
        map.put("Id", java.lang.String.class);
        map.put("Namespace", java.lang.String.class);
        map.put("Nodes", java.lang.String.class);
        map.put("Properties", java.util.List.class);
        map.put("ReconnectBaseSleepTime", java.lang.String.class);
        map.put("ReconnectMaxRetries", java.lang.String.class);
        map.put("ReconnectMaxSleepTime", java.lang.String.class);
        map.put("SessionTimeout", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.model.cloud.ZooKeeperServiceCallServiceDiscoveryConfiguration target = (org.apache.camel.model.cloud.ZooKeeperServiceCallServiceDiscoveryConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basepath":
        case "BasePath": target.setBasePath(property(camelContext, java.lang.String.class, value)); return true;
        case "connectiontimeout":
        case "ConnectionTimeout": target.setConnectionTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "id":
        case "Id": target.setId(property(camelContext, java.lang.String.class, value)); return true;
        case "namespace":
        case "Namespace": target.setNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "nodes":
        case "Nodes": target.setNodes(property(camelContext, java.lang.String.class, value)); return true;
        case "properties":
        case "Properties": target.setProperties(property(camelContext, java.util.List.class, value)); return true;
        case "reconnectbasesleeptime":
        case "ReconnectBaseSleepTime": target.setReconnectBaseSleepTime(property(camelContext, java.lang.String.class, value)); return true;
        case "reconnectmaxretries":
        case "ReconnectMaxRetries": target.setReconnectMaxRetries(property(camelContext, java.lang.String.class, value)); return true;
        case "reconnectmaxsleeptime":
        case "ReconnectMaxSleepTime": target.setReconnectMaxSleepTime(property(camelContext, java.lang.String.class, value)); return true;
        case "sessiontimeout":
        case "SessionTimeout": target.setSessionTimeout(property(camelContext, java.lang.String.class, value)); return true;
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
        case "basepath":
        case "BasePath": return java.lang.String.class;
        case "connectiontimeout":
        case "ConnectionTimeout": return java.lang.String.class;
        case "id":
        case "Id": return java.lang.String.class;
        case "namespace":
        case "Namespace": return java.lang.String.class;
        case "nodes":
        case "Nodes": return java.lang.String.class;
        case "properties":
        case "Properties": return java.util.List.class;
        case "reconnectbasesleeptime":
        case "ReconnectBaseSleepTime": return java.lang.String.class;
        case "reconnectmaxretries":
        case "ReconnectMaxRetries": return java.lang.String.class;
        case "reconnectmaxsleeptime":
        case "ReconnectMaxSleepTime": return java.lang.String.class;
        case "sessiontimeout":
        case "SessionTimeout": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.model.cloud.ZooKeeperServiceCallServiceDiscoveryConfiguration target = (org.apache.camel.model.cloud.ZooKeeperServiceCallServiceDiscoveryConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basepath":
        case "BasePath": return target.getBasePath();
        case "connectiontimeout":
        case "ConnectionTimeout": return target.getConnectionTimeout();
        case "id":
        case "Id": return target.getId();
        case "namespace":
        case "Namespace": return target.getNamespace();
        case "nodes":
        case "Nodes": return target.getNodes();
        case "properties":
        case "Properties": return target.getProperties();
        case "reconnectbasesleeptime":
        case "ReconnectBaseSleepTime": return target.getReconnectBaseSleepTime();
        case "reconnectmaxretries":
        case "ReconnectMaxRetries": return target.getReconnectMaxRetries();
        case "reconnectmaxsleeptime":
        case "ReconnectMaxSleepTime": return target.getReconnectMaxSleepTime();
        case "sessiontimeout":
        case "SessionTimeout": return target.getSessionTimeout();
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

