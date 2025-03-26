/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.kie.kogito.hr;

import org.kie.kogito.process.workitem.TaskModel;

public class Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskModel implements TaskModel<org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskInput, org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskOutput> {

    private String id;

    private String name;

    private int state;

    private String phase;

    private String phaseStatus;

    private org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskInput parameters;

    private org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskOutput results;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getPhaseStatus() {
        return phaseStatus;
    }

    public void setPhaseStatus(String phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    public org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskInput getParameters() {
        return parameters;
    }

    public void setParameters(org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskInput parameters) {
        this.parameters = parameters;
    }

    public org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskOutput getResults() {
        return results;
    }

    public void setParams(org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskOutput results) {
        this.results = results;
    }

    public static org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskModel from(org.kie.kogito.process.WorkItem workItem) {
        org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskModel taskModel = new org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskModel();
        taskModel.id = workItem.getId();
        taskModel.name = workItem.getName();
        taskModel.state = workItem.getState();
        taskModel.phaseStatus = workItem.getPhaseStatus();
        taskModel.phase = workItem.getPhase();
        taskModel.parameters = org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskInput.fromMap(workItem.getParameters());
        taskModel.results = org.kie.kogito.hr.Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskOutput.fromMap(workItem.getResults());
        return taskModel;
    }
}
//Task model for user task '11.0Procress variance' in process 'reject'
