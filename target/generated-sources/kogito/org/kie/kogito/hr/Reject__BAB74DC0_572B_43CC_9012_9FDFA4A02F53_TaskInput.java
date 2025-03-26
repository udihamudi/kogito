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

import java.util.Map;
import org.kie.kogito.UserTask;
import org.kie.kogito.UserTaskParam.ParamType;
import org.kie.kogito.UserTaskParam;

@UserTask(taskName = "Task", processName = "reject")
public class Reject__BAB74DC0_572B_43CC_9012_9FDFA4A02F53_TaskInput {

    public static Reject__BAB74DC0_572B_43CC_9012_9FDFA4A02F53_TaskInput fromMap(Map<String, Object> params) {
        Reject__BAB74DC0_572B_43CC_9012_9FDFA4A02F53_TaskInput item = new Reject__BAB74DC0_572B_43CC_9012_9FDFA4A02F53_TaskInput();
        item.rejectProcessResult = (org.kie.kogito.hr.RejectProcessResult) params.get("rejectProcessResult");
        item.approve = (java.lang.Boolean) params.get("approve");
        item.rejectInputData = (org.kie.kogito.hr.RejectInputData) params.get("rejectInputData");
        return item;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private org.kie.kogito.hr.RejectProcessResult rejectProcessResult;

    public org.kie.kogito.hr.RejectProcessResult getRejectProcessResult() {
        return rejectProcessResult;
    }

    public void setRejectProcessResult(org.kie.kogito.hr.RejectProcessResult rejectProcessResult) {
        this.rejectProcessResult = rejectProcessResult;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private java.lang.Boolean approve;

    public java.lang.Boolean getApprove() {
        return approve;
    }

    public void setApprove(java.lang.Boolean approve) {
        this.approve = approve;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private org.kie.kogito.hr.RejectInputData rejectInputData;

    public org.kie.kogito.hr.RejectInputData getRejectInputData() {
        return rejectInputData;
    }

    public void setRejectInputData(org.kie.kogito.hr.RejectInputData rejectInputData) {
        this.rejectInputData = rejectInputData;
    }
}
//Task input for user task '5.0Process reject (manual)' in process 'reject'
