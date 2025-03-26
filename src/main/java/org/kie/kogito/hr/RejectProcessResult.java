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

public class RejectProcessResult {

    // this needs to be static for the gateway path to access
    // it still needs getter and setter or the dmn won't modify it
    static Integer status = 200;

    private String category;

    //private Integer salary;
    private Integer priority;

    public RejectProcessResult() {
    }

    public Integer getStatus() {
        return RejectProcessResult.status;
    }

    public void setStatus(Integer status) {
        RejectProcessResult.status = status;
    }

    public String getCategory() {
        return category; 
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //public Integer getSalary() {
    //    return salary;
    // }
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
