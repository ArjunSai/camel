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
package org.apache.camel.management.mbean;

import java.util.Date;

import org.apache.camel.api.management.ManagedResource;
import org.apache.camel.api.management.mbean.ManagedCounterMBean;
import org.apache.camel.spi.ManagementStrategy;

@ManagedResource(description = "Managed Counter")
public abstract class ManagedCounter implements ManagedCounterMBean {
    protected Statistic exchangesTotal;
    protected Date startTimestamp;
    protected Date resetTimestamp;

    public void init(ManagementStrategy strategy) {
        this.exchangesTotal = new StatisticCounter();
        Date now = new Date();
        startTimestamp = now;
        resetTimestamp = now;
    }

    @Override
    public void reset() {
        exchangesTotal.reset();
        resetTimestamp = new Date();
    }

    @Override
    public Date getStartTimestamp() {
        return startTimestamp;
    }

    @Override
    public Date getResetTimestamp() {
        return resetTimestamp;
    }

    @Override
    public long getExchangesTotal() {
        return exchangesTotal.getValue();
    }

    public void increment() {
        exchangesTotal.increment();
    }
}
