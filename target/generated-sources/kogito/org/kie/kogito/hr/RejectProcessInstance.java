package org.kie.kogito.hr;

import org.kie.kogito.hr.RejectModel;

public class RejectProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<RejectModel> {

    public RejectProcessInstance(org.kie.kogito.hr.RejectProcess process, RejectModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public RejectProcessInstance(org.kie.kogito.hr.RejectProcess process, RejectModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public RejectProcessInstance(org.kie.kogito.hr.RejectProcess process, RejectModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public RejectProcessInstance(org.kie.kogito.hr.RejectProcess process, RejectModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public RejectProcessInstance(org.kie.kogito.hr.RejectProcess process, RejectModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(RejectModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(RejectModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
