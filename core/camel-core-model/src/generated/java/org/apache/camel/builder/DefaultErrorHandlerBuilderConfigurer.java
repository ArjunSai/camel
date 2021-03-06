/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.builder;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.builder.DefaultErrorHandlerBuilder;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DefaultErrorHandlerBuilderConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.builder.DefaultErrorHandlerBuilder target = (org.apache.camel.builder.DefaultErrorHandlerBuilder) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "asyncdelayedredelivery":
        case "AsyncDelayedRedelivery": target.setAsyncDelayedRedelivery(property(camelContext, boolean.class, value)); return true;
        case "deadletterhandlenewexception":
        case "DeadLetterHandleNewException": target.setDeadLetterHandleNewException(property(camelContext, boolean.class, value)); return true;
        case "deadletteruri":
        case "DeadLetterUri": target.setDeadLetterUri(property(camelContext, java.lang.String.class, value)); return true;
        case "executorservice":
        case "ExecutorService": target.setExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "executorserviceref":
        case "ExecutorServiceRef": target.setExecutorServiceRef(property(camelContext, java.lang.String.class, value)); return true;
        case "logger":
        case "Logger": target.setLogger(property(camelContext, org.apache.camel.spi.CamelLogger.class, value)); return true;
        case "onexceptionoccurred":
        case "OnExceptionOccurred": target.setOnExceptionOccurred(property(camelContext, org.apache.camel.Processor.class, value)); return true;
        case "onexceptionoccurredref":
        case "OnExceptionOccurredRef": target.setOnExceptionOccurredRef(property(camelContext, java.lang.String.class, value)); return true;
        case "onpreparefailure":
        case "OnPrepareFailure": target.setOnPrepareFailure(property(camelContext, org.apache.camel.Processor.class, value)); return true;
        case "onpreparefailureref":
        case "OnPrepareFailureRef": target.setOnPrepareFailureRef(property(camelContext, java.lang.String.class, value)); return true;
        case "onredelivery":
        case "OnRedelivery": target.setOnRedelivery(property(camelContext, org.apache.camel.Processor.class, value)); return true;
        case "onredeliveryref":
        case "OnRedeliveryRef": target.setOnRedeliveryRef(property(camelContext, java.lang.String.class, value)); return true;
        case "redeliverypolicy":
        case "RedeliveryPolicy": target.setRedeliveryPolicy(property(camelContext, org.apache.camel.processor.errorhandler.RedeliveryPolicy.class, value)); return true;
        case "retrywhile":
        case "RetryWhile": target.setRetryWhile(property(camelContext, org.apache.camel.Predicate.class, value)); return true;
        case "retrywhileref":
        case "RetryWhileRef": target.setRetryWhileRef(property(camelContext, java.lang.String.class, value)); return true;
        case "useoriginalbody":
        case "UseOriginalBody": target.setUseOriginalBody(property(camelContext, boolean.class, value)); return true;
        case "useoriginalmessage":
        case "UseOriginalMessage": target.setUseOriginalMessage(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "asyncdelayedredelivery":
        case "AsyncDelayedRedelivery": return boolean.class;
        case "deadletterhandlenewexception":
        case "DeadLetterHandleNewException": return boolean.class;
        case "deadletteruri":
        case "DeadLetterUri": return java.lang.String.class;
        case "executorservice":
        case "ExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "executorserviceref":
        case "ExecutorServiceRef": return java.lang.String.class;
        case "logger":
        case "Logger": return org.apache.camel.spi.CamelLogger.class;
        case "onexceptionoccurred":
        case "OnExceptionOccurred": return org.apache.camel.Processor.class;
        case "onexceptionoccurredref":
        case "OnExceptionOccurredRef": return java.lang.String.class;
        case "onpreparefailure":
        case "OnPrepareFailure": return org.apache.camel.Processor.class;
        case "onpreparefailureref":
        case "OnPrepareFailureRef": return java.lang.String.class;
        case "onredelivery":
        case "OnRedelivery": return org.apache.camel.Processor.class;
        case "onredeliveryref":
        case "OnRedeliveryRef": return java.lang.String.class;
        case "redeliverypolicy":
        case "RedeliveryPolicy": return org.apache.camel.processor.errorhandler.RedeliveryPolicy.class;
        case "retrywhile":
        case "RetryWhile": return org.apache.camel.Predicate.class;
        case "retrywhileref":
        case "RetryWhileRef": return java.lang.String.class;
        case "useoriginalbody":
        case "UseOriginalBody": return boolean.class;
        case "useoriginalmessage":
        case "UseOriginalMessage": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.builder.DefaultErrorHandlerBuilder target = (org.apache.camel.builder.DefaultErrorHandlerBuilder) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "asyncdelayedredelivery":
        case "AsyncDelayedRedelivery": return target.isAsyncDelayedRedelivery();
        case "deadletterhandlenewexception":
        case "DeadLetterHandleNewException": return target.isDeadLetterHandleNewException();
        case "deadletteruri":
        case "DeadLetterUri": return target.getDeadLetterUri();
        case "executorservice":
        case "ExecutorService": return target.getExecutorService();
        case "executorserviceref":
        case "ExecutorServiceRef": return target.getExecutorServiceRef();
        case "logger":
        case "Logger": return target.getLogger();
        case "onexceptionoccurred":
        case "OnExceptionOccurred": return target.getOnExceptionOccurred();
        case "onexceptionoccurredref":
        case "OnExceptionOccurredRef": return target.getOnExceptionOccurredRef();
        case "onpreparefailure":
        case "OnPrepareFailure": return target.getOnPrepareFailure();
        case "onpreparefailureref":
        case "OnPrepareFailureRef": return target.getOnPrepareFailureRef();
        case "onredelivery":
        case "OnRedelivery": return target.getOnRedelivery();
        case "onredeliveryref":
        case "OnRedeliveryRef": return target.getOnRedeliveryRef();
        case "redeliverypolicy":
        case "RedeliveryPolicy": return target.getRedeliveryPolicy();
        case "retrywhile":
        case "RetryWhile": return target.getRetryWhile();
        case "retrywhileref":
        case "RetryWhileRef": return target.getRetryWhileRef();
        case "useoriginalbody":
        case "UseOriginalBody": return target.isUseOriginalBody();
        case "useoriginalmessage":
        case "UseOriginalMessage": return target.isUseOriginalMessage();
        default: return null;
        }
    }
}

