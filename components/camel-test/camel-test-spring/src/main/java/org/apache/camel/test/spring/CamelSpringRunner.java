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
package org.apache.camel.test.spring;

import java.util.List;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.BootstrapContext;
import org.springframework.test.context.CacheAwareContextLoaderDelegate;
import org.springframework.test.context.TestContextBootstrapper;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.TestExecutionListener;
import org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DefaultBootstrapContext;

/**
 * An implementation bringing the functionality of {@link org.apache.camel.test.spring.CamelSpringTestSupport} to Spring
 * Test based test cases. This approach allows developers to implement tests for their Spring based applications/routes
 * using the typical Spring Test conventions for test development.
 */
@Deprecated
public class CamelSpringRunner extends SpringJUnit4ClassRunner {

    public CamelSpringRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }

    /**
     * Returns the specialized manager instance that provides tight integration between Camel testing features and
     * Spring.
     *
     * @return a new instance of {@link CamelTestContextManager}.
     */
    @Override
    protected TestContextManager createTestContextManager(Class<?> clazz) {
        return new CamelTestContextManager(clazz);
    }

    /**
     * An implementation providing additional integration between Spring Test and Camel testing features.
     */
    public static final class CamelTestContextManager extends TestContextManager {

        public CamelTestContextManager(Class<?> testClass) {
            super(createTestContextBootstrapper(testClass));

            // is Camel already registered
            if (!alreadyRegistered()) {
                // inject Camel first, and then disable jmx and add the stop-watch
                List<TestExecutionListener> list = getTestExecutionListeners();
                list.add(0, new CamelSpringTestContextLoaderTestExecutionListener());
                list.add(1, new StopWatchTestExecutionListener());
            }
        }

        static TestContextBootstrapper createTestContextBootstrapper(Class<?> testClass) {
            CacheAwareContextLoaderDelegate cacheAwareContextLoaderDelegate = new DefaultCacheAwareContextLoaderDelegate();
            BootstrapContext bootstrapContext = new DefaultBootstrapContext(testClass, cacheAwareContextLoaderDelegate);
            TestContextBootstrapper testContextBootstrapper = new CamelTestContextBootstrapper();
            testContextBootstrapper.setBootstrapContext(bootstrapContext);
            return testContextBootstrapper;
        }

        private boolean alreadyRegistered() {
            List<TestExecutionListener> list = getTestExecutionListeners();
            if (list != null) {
                for (TestExecutionListener listener : list) {
                    if (listener instanceof CamelSpringTestContextLoaderTestExecutionListener) {
                        return true;
                    }
                }
            }

            return false;
        }

    }

}
