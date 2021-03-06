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
package org.apache.camel.component.jgroups.raft.cluster;

import java.util.concurrent.TimeUnit;

import org.apache.camel.RuntimeCamelException;
import org.jgroups.raft.RaftHandle;

public abstract class JGroupsRaftClusterAbstractTest {
    protected void waitForLeader(int attempts, RaftHandle rh, RaftHandle rh2, RaftHandle rh3) throws InterruptedException {
        boolean thereIsLeader = rh.isLeader() || rh2.isLeader() || rh3.isLeader();
        while (!thereIsLeader && attempts > 0) {
            thereIsLeader = rh.isLeader() || rh2.isLeader() || rh3.isLeader();
            TimeUnit.SECONDS.sleep(1);
            attempts--;
        }
        if (attempts <= 0) {
            throw new RuntimeCamelException("No leader in time!");
        }
    }
}
