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
public class Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskInput {

    public static Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskInput fromMap(Map<String, Object> params) {
        Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskInput item = new Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskInput();
        item.RejectInputData = (org.kie.kogito.hr.RejectInputData) params.get("RejectInputData");
        return item;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private org.kie.kogito.hr.RejectInputData RejectInputData;

    public org.kie.kogito.hr.RejectInputData getRejectInputData() {
        return RejectInputData;
    }

    public void setRejectInputData(org.kie.kogito.hr.RejectInputData RejectInputData) {
        this.RejectInputData = RejectInputData;
    }
}
//Task input for user task '11.0Procress variance' in process 'reject'
