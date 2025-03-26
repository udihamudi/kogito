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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RejectInputData {

    private String action_code;

    private String reason_code;

    private String extr_org_code;

    //private Integer experience;
    //private Integer employee_id;
    private Integer extr_client_id;

    //private List<String> skills;
    private List<String> problems;

    public RejectInputData() {
    }

    //public RejectInputData(String name, String lastName, String email, Integer experience, List<String> skills) {
    public RejectInputData(String action_code, String reason_code, String extr_org_code, Integer extr_client_id, List<String> problems) {
        this.action_code = action_code;
        this.reason_code = reason_code;
        this.extr_org_code = extr_org_code;
        //this.experience = experience;
        this.extr_client_id = extr_client_id;
        //this.skills = skills;
        this.problems = problems;
    }

    public String getAction_code() {
        return action_code;
    }

    public void setAction_code(String action_code) {
        this.action_code = action_code;
    }

    public String getReason_code() {
        return reason_code;
    }

    public void setReason_code(String reason_code) {
        this.reason_code = reason_code;
    }

    public String getExtr_org_code() {
        return extr_org_code;
    }

    public void setExtr_org_code(String extr_org_code) {
        this.extr_org_code = extr_org_code;
    }

    //public Integer getExperience() {
    //    return experience;
    //}
    public Integer getExtr_client_id() {
        return extr_client_id;
    }

    //public void setExperience(Integer experience) {
    //    this.experience = experience;
    // }
    public void setExtr_client_id(Integer extr_client_id) {
        this.extr_client_id = extr_client_id;
    }

    //public List<String> getSkills() {
    //    return skills;
    // }
    public List<String> getProblems() {
        return problems;
    }

    //public void setSkills(List<String> skills) {
    //    this.skills = skills;
    //}
    public void setProblems(List<String> problems) {
        this.problems = problems;
    }

    @JsonIgnore
    public String getFullName() {
        return action_code + " " + reason_code;
    }
}
