/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.micro.integrator.ntask.core.internal;

import org.wso2.micro.integrator.coordination.ClusterCoordinator;
import org.wso2.micro.integrator.ntask.core.TaskManager;

import java.util.concurrent.ScheduledExecutorService;

/**
 * Data holder for this component.
 *
 * @see TasksDSComponent
 */
public class DataHolder {

    private static final DataHolder instance = new DataHolder();
    private boolean coordinationEnabledGlobally = false;
    private ClusterCoordinator clusterCoordinator;
    private TaskManager taskManager;
    private ScheduledExecutorService taskScheduler;

    private DataHolder() {

    }

    public static DataHolder getInstance() {
        return instance;
    }

    public boolean isCoordinationEnabledGlobally() {
        return coordinationEnabledGlobally;
    }

    public void setCoordinationEnabledGlobally(boolean coordinationEnabledGlobally) {
        this.coordinationEnabledGlobally = coordinationEnabledGlobally;
    }

    public ClusterCoordinator getClusterCoordinator() {
        return clusterCoordinator;
    }

    public void setClusterCoordinator(ClusterCoordinator clusterCoordinator) {
        this.clusterCoordinator = clusterCoordinator;
    }

    public TaskManager getTaskManager() {
        return taskManager;
    }

    public void setTaskManager(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public ScheduledExecutorService getTaskScheduler() {
        return taskScheduler;
    }

    public void setTaskScheduler(ScheduledExecutorService taskScheduler) {
        this.taskScheduler = taskScheduler;
    }

}