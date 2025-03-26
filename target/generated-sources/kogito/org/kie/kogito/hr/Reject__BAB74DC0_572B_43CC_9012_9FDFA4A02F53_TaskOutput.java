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

import java.util.HashMap;
import java.util.Map;
import org.kie.kogito.MapOutput;
import org.kie.kogito.UserTask;
import org.kie.kogito.UserTaskParam.ParamType;
import org.kie.kogito.UserTaskParam;

@UserTask(taskName = "Task", processName = "reject")
public class Reject__BAB74DC0_572B_43CC_9012_9FDFA4A02F53_TaskOutput implements MapOutput {

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> params = new HashMap<>();
        params.put("rejectProcessResult", this.rejectProcessResult);
        params.put("approve", this.approve);
        return params;
    }

    public static Reject__BAB74DC0_572B_43CC_9012_9FDFA4A02F53_TaskOutput fromMap(Map<String, Object> params) {
        org.kie.kogito.hr.Reject__BAB74DC0_572B_43CC_9012_9FDFA4A02F53_TaskOutput result = new Reject__BAB74DC0_572B_43CC_9012_9FDFA4A02F53_TaskOutput();
        result.rejectProcessResult = (org.kie.kogito.hr.RejectProcessResult) params.get("rejectProcessResult");
        result.approve = (java.lang.Boolean) params.get("approve");
        return result;
    }

    @UserTaskParam(value = ParamType.OUTPUT)
    private org.kie.kogito.hr.RejectProcessResult rejectProcessResult;

    public org.kie.kogito.hr.RejectProcessResult getRejectProcessResult() {
        return rejectProcessResult;
    }

    public void setRejectProcessResult(org.kie.kogito.hr.RejectProcessResult rejectProcessResult) {
        this.rejectProcessResult = rejectProcessResult;
    }

    @UserTaskParam(value = ParamType.OUTPUT)
    private java.lang.Boolean approve;

    public java.lang.Boolean getApprove() {
        return approve;
    }

    public void setApprove(java.lang.Boolean approve) {
        this.approve = approve;
    }
}
//Task output for user task '5.0Process reject (manual)' in process 'reject'
