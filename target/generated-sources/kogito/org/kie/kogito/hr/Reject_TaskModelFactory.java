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

import org.kie.kogito.usertask.model.Attachment;
import org.kie.kogito.usertask.model.AttachmentInfo;
import org.kie.kogito.usertask.model.Comment;
import org.kie.kogito.process.workitem.TaskModel;

public class Reject_TaskModelFactory {

    public static TaskModel from(org.kie.kogito.process.WorkItem workItem) {
        switch(workItem.getNodeId().toExternalFormat()) {
            case "_BAB74DC0-572B-43CC-9012-9FDFA4A02F53":
                return Reject__BAB74DC0_572B_43CC_9012_9FDFA4A02F53_TaskModel.from(workItem);
            case "_595808F1-70F6-4BD5-B849-4CF90AF013B6":
                return Reject__595808F1_70F6_4BD5_B849_4CF90AF013B6_TaskModel.from(workItem);
            default:
                throw new IllegalArgumentException("Invalid task name for work item " + workItem);
        }
    }
}
