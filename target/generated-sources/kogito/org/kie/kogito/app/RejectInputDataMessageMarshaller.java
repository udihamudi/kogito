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
package org.kie.kogito.app;

import java.io.IOException;
import org.infinispan.protostream.MessageMarshaller;

public class RejectInputDataMessageMarshaller implements MessageMarshaller<org.kie.kogito.hr.RejectInputData> {

    public java.lang.Class<org.kie.kogito.hr.RejectInputData> getJavaClass() {
        return org.kie.kogito.hr.RejectInputData.class;
    }

    public String getTypeName() {
        return "org.kie.kogito.app.RejectInputData";
    }

    public org.kie.kogito.hr.RejectInputData readFrom(ProtoStreamReader reader) throws IOException {
        org.kie.kogito.hr.RejectInputData value = new org.kie.kogito.hr.RejectInputData();
        value.setAction_code(reader.readString("action_code"));
        value.setExtr_client_id(reader.readInt("extr_client_id"));
        value.setExtr_org_code(reader.readString("extr_org_code"));
        value.setProblems(reader.readCollection("problems", new java.util.ArrayList(), String.class));
        value.setReason_code(reader.readString("reason_code"));
        return value;
    }

    public void writeTo(ProtoStreamWriter writer, org.kie.kogito.hr.RejectInputData t) throws IOException {
        writer.writeString("action_code", t.getAction_code());
        writer.writeInt("extr_client_id", t.getExtr_client_id());
        writer.writeString("extr_org_code", t.getExtr_org_code());
        writer.writeCollection("problems", t.getProblems(), String.class);
        writer.writeString("reason_code", t.getReason_code());
    }
}
