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

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "reject", name = "Reject", hidden = true)
public class RejectModelOutput implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<RejectModel> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "output")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "rejectProcessResult")
    @jakarta.validation.Valid()
    private org.kie.kogito.hr.RejectProcessResult rejectProcessResult;

    public org.kie.kogito.hr.RejectProcessResult getRejectProcessResult() {
        return rejectProcessResult;
    }

    public void setRejectProcessResult(org.kie.kogito.hr.RejectProcessResult rejectProcessResult) {
        this.rejectProcessResult = rejectProcessResult;
    }

    @Override()
    public RejectModel toModel() {
        RejectModel result = new RejectModel();
        result.setId(getId());
        result.setRejectProcessResult(getRejectProcessResult());
        return result;
    }
}
