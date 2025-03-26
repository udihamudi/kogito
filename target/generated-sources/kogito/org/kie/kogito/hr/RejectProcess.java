package org.kie.kogito.hr;

import org.kie.kogito.hr.RejectModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("reject")
@io.quarkus.runtime.Startup()
public class RejectProcess extends org.kie.kogito.process.impl.AbstractProcess<org.kie.kogito.hr.RejectModel> {

    @jakarta.inject.Inject()
    public RejectProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory) {
        super(app, java.util.Arrays.asList(), correlations, factory);
        activate();
    }

    public RejectProcess() {
    }

    @Override()
    public org.kie.kogito.hr.RejectProcessInstance createInstance(org.kie.kogito.hr.RejectModel value) {
        return new org.kie.kogito.hr.RejectProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.kie.kogito.hr.RejectProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.hr.RejectModel value) {
        return new org.kie.kogito.hr.RejectProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.kie.kogito.hr.RejectProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.kie.kogito.hr.RejectModel value) {
        return new org.kie.kogito.hr.RejectProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.kie.kogito.hr.RejectModel createModel() {
        return new org.kie.kogito.hr.RejectModel();
    }

    public org.kie.kogito.hr.RejectProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.kie.kogito.hr.RejectModel) value);
    }

    public org.kie.kogito.hr.RejectProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.kie.kogito.hr.RejectModel) value);
    }

    public org.kie.kogito.hr.RejectProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.kie.kogito.hr.RejectProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.kie.kogito.hr.RejectProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.kie.kogito.hr.RejectProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("reject", true);
        factory.variable("hr_approval", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), java.util.Map.of("customTags", "internal", "ItemSubjectRef", "_hr_approvalItem", "hr_approval", "hr_approval"));
        factory.variable("rejectInputData", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.kie.kogito.hr.RejectInputData.class), java.util.Map.of("customTags", "input", "rejectInputData", "rejectInputData", "ItemSubjectRef", "_rejectInputDataItem"));
        factory.variable("rejectProcessResult", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.kie.kogito.hr.RejectProcessResult.class), java.util.Map.of("rejectProcessResult", "rejectProcessResult", "customTags", "output", "ItemSubjectRef", "_rejectProcessResultItem"));
        factory.name("reject");
        factory.packageName("org.kie.kogito.hr");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("jbpm.enable.multi.con", null);
        factory.metaData("jbpm.transactions.enable", "true");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_991B8396_3BB4_46EE_9A77_31A70F35C913 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_991B8396-3BB4-46EE-9A77-31A70F35C913"));
        actionNode_991B8396_3BB4_46EE_9A77_31A70F35C913.name("13.0\nClose task");
        actionNode_991B8396_3BB4_46EE_9A77_31A70F35C913.metaData("UniqueId", "_991B8396-3BB4-46EE-9A77-31A70F35C913");
        actionNode_991B8396_3BB4_46EE_9A77_31A70F35C913.metaData("elementname", "13.0\nClose task");
        actionNode_991B8396_3BB4_46EE_9A77_31A70F35C913.metaData("NodeType", "ScriptTask");
        actionNode_991B8396_3BB4_46EE_9A77_31A70F35C913.metaData("x", 934);
        actionNode_991B8396_3BB4_46EE_9A77_31A70F35C913.metaData("width", 154);
        actionNode_991B8396_3BB4_46EE_9A77_31A70F35C913.metaData("y", 1415);
        actionNode_991B8396_3BB4_46EE_9A77_31A70F35C913.metaData("height", 102);
        actionNode_991B8396_3BB4_46EE_9A77_31A70F35C913.action(kcontext -> {
            System.out.println("==================");
            System.out.println("13.0 Close task");
            System.out.println("==================");
        });
        actionNode_991B8396_3BB4_46EE_9A77_31A70F35C913.done();
        org.jbpm.ruleflow.core.factory.JoinFactory<?> joinNode_B328A9F5_0DD9_41D2_A90F_830B83EF1540 = factory.joinNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B328A9F5-0DD9-41D2-A90F-830B83EF1540"));
        joinNode_B328A9F5_0DD9_41D2_A90F_830B83EF1540.name("Join");
        joinNode_B328A9F5_0DD9_41D2_A90F_830B83EF1540.type(5);
        joinNode_B328A9F5_0DD9_41D2_A90F_830B83EF1540.metaData("UniqueId", "_B328A9F5-0DD9-41D2-A90F-830B83EF1540");
        joinNode_B328A9F5_0DD9_41D2_A90F_830B83EF1540.metaData("x", 984);
        joinNode_B328A9F5_0DD9_41D2_A90F_830B83EF1540.metaData("width", 56);
        joinNode_B328A9F5_0DD9_41D2_A90F_830B83EF1540.metaData("y", 1146);
        joinNode_B328A9F5_0DD9_41D2_A90F_830B83EF1540.metaData("height", 56);
        joinNode_B328A9F5_0DD9_41D2_A90F_830B83EF1540.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_595808F1-70F6-4BD5-B849-4CF90AF013B6"));
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.name("11.0\nProcress variance");
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.workParameter("NodeName", "11.0\nProcress variance");
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.workParameter("Skippable", "false");
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.workParameter("TaskName", "Task");
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.workParameter("UNIQUE_TASK_ID", "_595808F1-70F6-4BD5-B849-4CF90AF013B6");
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_595808F1-70F6-4BD5-B849-4CF90AF013B6_TaskNameInputX", "TaskName", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("d1d4983f-e679-42fc-81d6-afd57a939a7c", "EXPRESSION (Task)", "java.lang.Object", "Task"), new org.jbpm.workflow.core.impl.DataDefinition("_595808F1-70F6-4BD5-B849-4CF90AF013B6_TaskNameInputX", "TaskName", "Object", null))), null));
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("rejectInputData", "rejectInputData", "org.kie.kogito.hr.RejectInputData", null)), new org.jbpm.workflow.core.impl.DataDefinition("_595808F1-70F6-4BD5-B849-4CF90AF013B6_RejectInputDataInputX", "RejectInputData", "org.kie.kogito.hr.RejectInputData", null), null, null));
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_595808F1-70F6-4BD5-B849-4CF90AF013B6_SkippableInputX", "Skippable", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("ec068f75-e958-423b-ba75-64a5dfdac8d4", "EXPRESSION (false)", "java.lang.Object", "false"), new org.jbpm.workflow.core.impl.DataDefinition("_595808F1-70F6-4BD5-B849-4CF90AF013B6_SkippableInputX", "Skippable", "Object", null))), null));
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_595808F1-70F6-4BD5-B849-4CF90AF013B6_RejectProcessResultOutputX", "RejectProcessResult", "org.kie.kogito.hr.RejectProcessResult", null)), new org.jbpm.workflow.core.impl.DataDefinition("rejectProcessResult", "rejectProcessResult", "org.kie.kogito.hr.RejectProcessResult", null), null, null));
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.done();
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.metaData("UniqueId", "_595808F1-70F6-4BD5-B849-4CF90AF013B6");
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.metaData("elementname", "11.0\nProcress variance");
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.metaData("x", 1191);
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.metaData("width", 154);
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.metaData("y", 1124);
        humanTaskNode_595808F1_70F6_4BD5_B849_4CF90AF013B6.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2 = factory.ruleSetNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_BA629B06-946D-417C-8B74-2845D5FAD7F2"));
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.name("9.0\nDetermine variance");
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.decision("https://kie.apache.org/dmn/_42E18B21-84C5-45D2-8F6C-79B4D2B99CDC", "Reject Processing", "Reject Processing", () -> {
            return app.get(org.kie.kogito.decision.DecisionModels.class).getDecisionModel("https://kie.apache.org/dmn/_42E18B21-84C5-45D2-8F6C-79B4D2B99CDC", "Reject Processing");
        });
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_BA629B06-946D-417C-8B74-2845D5FAD7F2_fileNameInputX", "fileName", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("38d9c832-8065-4e85-8c11-b82507b906d4", "EXPRESSION (RejectProcessing.dmn)", "java.lang.Object", "RejectProcessing.dmn"), new org.jbpm.workflow.core.impl.DataDefinition("_BA629B06-946D-417C-8B74-2845D5FAD7F2_fileNameInputX", "fileName", "java.lang.String", null))), null));
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_BA629B06-946D-417C-8B74-2845D5FAD7F2_namespaceInputX", "namespace", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("4df1520e-933f-45d2-9a1e-2bdc3ea63d4f", "EXPRESSION (https://kie.apache.org/dmn/_42E18B21-84C5-45D2-8F6C-79B4D2B99CDC)", "java.lang.Object", "https://kie.apache.org/dmn/_42E18B21-84C5-45D2-8F6C-79B4D2B99CDC"), new org.jbpm.workflow.core.impl.DataDefinition("_BA629B06-946D-417C-8B74-2845D5FAD7F2_namespaceInputX", "namespace", "java.lang.String", null))), null));
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_BA629B06-946D-417C-8B74-2845D5FAD7F2_decisionInputX", "decision", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("62aedf8c-18e1-4547-bb33-346f1339a973", "EXPRESSION (Reject Processing)", "java.lang.Object", "Reject Processing"), new org.jbpm.workflow.core.impl.DataDefinition("_BA629B06-946D-417C-8B74-2845D5FAD7F2_decisionInputX", "decision", "java.lang.String", null))), null));
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_BA629B06-946D-417C-8B74-2845D5FAD7F2_modelInputX", "model", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("37530f86-c862-41a7-a063-13189fd0d570", "EXPRESSION (Reject Processing)", "java.lang.Object", "Reject Processing"), new org.jbpm.workflow.core.impl.DataDefinition("_BA629B06-946D-417C-8B74-2845D5FAD7F2_modelInputX", "model", "java.lang.String", null))), null));
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("rejectInputData", "rejectInputData", "org.kie.kogito.hr.RejectInputData", null)), new org.jbpm.workflow.core.impl.DataDefinition("_BA629B06-946D-417C-8B74-2845D5FAD7F2_RejectInputDataInputX", "RejectInputData", "org.kie.kogito.hr.RejectInputData", null), null, null));
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_BA629B06-946D-417C-8B74-2845D5FAD7F2_RejectProcessingResultOutputX", "RejectProcessingResult", "org.kie.kogito.hr.RejectProcessResult", null)), new org.jbpm.workflow.core.impl.DataDefinition("rejectProcessResult", "rejectProcessResult", "org.kie.kogito.hr.RejectProcessResult", null), null, null));
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.metaData("UniqueId", "_BA629B06-946D-417C-8B74-2845D5FAD7F2");
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.metaData("elementname", "9.0\nDetermine variance");
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.metaData("x", 1055);
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.metaData("width", 154);
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.metaData("y", 683);
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.metaData("height", 102);
        ruleSetNode_BA629B06_946D_417C_8B74_2845D5FAD7F2.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_F0987C25_87DB_454E_BE86_94AAA6EB831A = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F0987C25-87DB-454E-BE86-94AAA6EB831A"));
        endNode_F0987C25_87DB_454E_BE86_94AAA6EB831A.name("End");
        endNode_F0987C25_87DB_454E_BE86_94AAA6EB831A.terminate(false);
        endNode_F0987C25_87DB_454E_BE86_94AAA6EB831A.metaData("UniqueId", "_F0987C25-87DB-454E-BE86-94AAA6EB831A");
        endNode_F0987C25_87DB_454E_BE86_94AAA6EB831A.metaData("x", 983);
        endNode_F0987C25_87DB_454E_BE86_94AAA6EB831A.metaData("width", 56);
        endNode_F0987C25_87DB_454E_BE86_94AAA6EB831A.metaData("y", 1553);
        endNode_F0987C25_87DB_454E_BE86_94AAA6EB831A.metaData("height", 56);
        endNode_F0987C25_87DB_454E_BE86_94AAA6EB831A.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_8CFDF682_F9E8_4C08_9EFF_CB6448540216 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8CFDF682-F9E8-4C08-9EFF-CB6448540216"));
        actionNode_8CFDF682_F9E8_4C08_9EFF_CB6448540216.name("10.0\nRead data from PRISM");
        actionNode_8CFDF682_F9E8_4C08_9EFF_CB6448540216.metaData("UniqueId", "_8CFDF682-F9E8-4C08-9EFF-CB6448540216");
        actionNode_8CFDF682_F9E8_4C08_9EFF_CB6448540216.metaData("elementname", "10.0\nRead data from PRISM");
        actionNode_8CFDF682_F9E8_4C08_9EFF_CB6448540216.metaData("NodeType", "ScriptTask");
        actionNode_8CFDF682_F9E8_4C08_9EFF_CB6448540216.metaData("x", 1195);
        actionNode_8CFDF682_F9E8_4C08_9EFF_CB6448540216.metaData("width", 154);
        actionNode_8CFDF682_F9E8_4C08_9EFF_CB6448540216.metaData("y", 962);
        actionNode_8CFDF682_F9E8_4C08_9EFF_CB6448540216.metaData("height", 102);
        actionNode_8CFDF682_F9E8_4C08_9EFF_CB6448540216.action(kcontext -> {
            System.out.println("=========================");
            System.out.println("10.0 Read data from PRISM");
            System.out.println("=========================");
        });
        actionNode_8CFDF682_F9E8_4C08_9EFF_CB6448540216.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_1044F271_FBBF_48BE_AF05_78BE64253BBA = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1044F271-FBBF-48BE-AF05-78BE64253BBA"));
        actionNode_1044F271_FBBF_48BE_AF05_78BE64253BBA.name("12.0\nUpdate PRISM\n(if required)");
        actionNode_1044F271_FBBF_48BE_AF05_78BE64253BBA.metaData("UniqueId", "_1044F271-FBBF-48BE-AF05-78BE64253BBA");
        actionNode_1044F271_FBBF_48BE_AF05_78BE64253BBA.metaData("elementname", "12.0\nUpdate PRISM\n(if required)");
        actionNode_1044F271_FBBF_48BE_AF05_78BE64253BBA.metaData("NodeType", "ScriptTask");
        actionNode_1044F271_FBBF_48BE_AF05_78BE64253BBA.metaData("x", 934);
        actionNode_1044F271_FBBF_48BE_AF05_78BE64253BBA.metaData("width", 154);
        actionNode_1044F271_FBBF_48BE_AF05_78BE64253BBA.metaData("y", 1258);
        actionNode_1044F271_FBBF_48BE_AF05_78BE64253BBA.metaData("height", 102);
        actionNode_1044F271_FBBF_48BE_AF05_78BE64253BBA.action(kcontext -> {
            System.out.println("==================");
            System.out.println("12.0 Update PRISM");
            System.out.println("==================");
        });
        actionNode_1044F271_FBBF_48BE_AF05_78BE64253BBA.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_32C14C87-E69A-41EB-8483-67FEE19C65F4"));
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.name("XGW2");
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.type(2);
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.metaData("UniqueId", "_32C14C87-E69A-41EB-8483-67FEE19C65F4");
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.metaData("elementname", "XGW2");
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.metaData("x", 1103);
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.metaData("width", 56);
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.metaData("y", 828);
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.metaData("Default", null);
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.metaData("height", 56);
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8CFDF682-F9E8-4C08-9EFF-CB6448540216"), "_C2099B31-4F59-4FB1-8D2B-99983AD69DA3", "DROOLS_DEFAULT", "java", kcontext -> {
            return (RejectProcessResult.status == 100);
        }, 0, false);
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B328A9F5-0DD9-41D2-A90F-830B83EF1540"), "_082745C7-D0C0-4F7F-B95F-9577DDC8662D", "DROOLS_DEFAULT", "java", kcontext -> {
            return (RejectProcessResult.status == 200);
        }, 0, false);
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.done();
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8CFDF682-F9E8-4C08-9EFF-CB6448540216"), "_C2099B31-4F59-4FB1-8D2B-99983AD69DA3", "DROOLS_DEFAULT", "java", kcontext -> {
            return (RejectProcessResult.status == 100);
        }, 0, false);
        splitNode_32C14C87_E69A_41EB_8483_67FEE19C65F4.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B328A9F5-0DD9-41D2-A90F-830B83EF1540"), "_082745C7-D0C0-4F7F-B95F-9577DDC8662D", "DROOLS_DEFAULT", "java", kcontext -> {
            return (RejectProcessResult.status == 200);
        }, 0, false);
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_FE289E51_E8D0_4D8C_8FD0_DF8A90387EB5 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_FE289E51-E8D0-4D8C-8FD0-DF8A90387EB5"));
        actionNode_FE289E51_E8D0_4D8C_8FD0_DF8A90387EB5.name("8.0\nRead from CSC table");
        actionNode_FE289E51_E8D0_4D8C_8FD0_DF8A90387EB5.metaData("UniqueId", "_FE289E51-E8D0-4D8C-8FD0-DF8A90387EB5");
        actionNode_FE289E51_E8D0_4D8C_8FD0_DF8A90387EB5.metaData("elementname", "8.0\nRead from CSC table");
        actionNode_FE289E51_E8D0_4D8C_8FD0_DF8A90387EB5.metaData("NodeType", "ScriptTask");
        actionNode_FE289E51_E8D0_4D8C_8FD0_DF8A90387EB5.metaData("x", 1053);
        actionNode_FE289E51_E8D0_4D8C_8FD0_DF8A90387EB5.metaData("width", 154);
        actionNode_FE289E51_E8D0_4D8C_8FD0_DF8A90387EB5.metaData("y", 518);
        actionNode_FE289E51_E8D0_4D8C_8FD0_DF8A90387EB5.metaData("height", 102);
        actionNode_FE289E51_E8D0_4D8C_8FD0_DF8A90387EB5.action(kcontext -> {
            System.out.println("========================");
            System.out.println("8.0 Read from CSC table");
            System.out.println("========================");
        });
        actionNode_FE289E51_E8D0_4D8C_8FD0_DF8A90387EB5.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_4CED4104_32B1_41FA_8629_CF54E52095F7 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4CED4104-32B1-41FA-8629-CF54E52095F7"));
        actionNode_4CED4104_32B1_41FA_8629_CF54E52095F7.name("7.0\nExecute CSC SP");
        actionNode_4CED4104_32B1_41FA_8629_CF54E52095F7.metaData("UniqueId", "_4CED4104-32B1-41FA-8629-CF54E52095F7");
        actionNode_4CED4104_32B1_41FA_8629_CF54E52095F7.metaData("elementname", "7.0\nExecute CSC SP");
        actionNode_4CED4104_32B1_41FA_8629_CF54E52095F7.metaData("NodeType", "ScriptTask");
        actionNode_4CED4104_32B1_41FA_8629_CF54E52095F7.metaData("x", 1052);
        actionNode_4CED4104_32B1_41FA_8629_CF54E52095F7.metaData("width", 154);
        actionNode_4CED4104_32B1_41FA_8629_CF54E52095F7.metaData("y", 370);
        actionNode_4CED4104_32B1_41FA_8629_CF54E52095F7.metaData("height", 102);
        actionNode_4CED4104_32B1_41FA_8629_CF54E52095F7.action(kcontext -> {
            System.out.println("========================");
            System.out.println("7.0 Execute CSC SP");
            System.out.println("========================");
        });
        actionNode_4CED4104_32B1_41FA_8629_CF54E52095F7.done();
        org.jbpm.ruleflow.core.factory.JoinFactory<?> joinNode_B98D5503_C768_4B81_BDDC_6BED0E572194 = factory.joinNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B98D5503-C768-4B81-BDDC-6BED0E572194"));
        joinNode_B98D5503_C768_4B81_BDDC_6BED0E572194.name("IGW1");
        joinNode_B98D5503_C768_4B81_BDDC_6BED0E572194.type(5);
        joinNode_B98D5503_C768_4B81_BDDC_6BED0E572194.metaData("UniqueId", "_B98D5503-C768-4B81-BDDC-6BED0E572194");
        joinNode_B98D5503_C768_4B81_BDDC_6BED0E572194.metaData("elementname", "IGW1");
        joinNode_B98D5503_C768_4B81_BDDC_6BED0E572194.metaData("x", 913);
        joinNode_B98D5503_C768_4B81_BDDC_6BED0E572194.metaData("width", 56);
        joinNode_B98D5503_C768_4B81_BDDC_6BED0E572194.metaData("y", 247);
        joinNode_B98D5503_C768_4B81_BDDC_6BED0E572194.metaData("height", 56);
        joinNode_B98D5503_C768_4B81_BDDC_6BED0E572194.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_74E7EA41_850E_49CE_BDB2_8E583CE8D243 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_74E7EA41-850E-49CE-BDB2-8E583CE8D243"));
        actionNode_74E7EA41_850E_49CE_BDB2_8E583CE8D243.name("4.0\nRead data from Prism");
        actionNode_74E7EA41_850E_49CE_BDB2_8E583CE8D243.metaData("UniqueId", "_74E7EA41-850E-49CE-BDB2-8E583CE8D243");
        actionNode_74E7EA41_850E_49CE_BDB2_8E583CE8D243.metaData("elementname", "4.0\nRead data from Prism");
        actionNode_74E7EA41_850E_49CE_BDB2_8E583CE8D243.metaData("NodeType", "ScriptTask");
        actionNode_74E7EA41_850E_49CE_BDB2_8E583CE8D243.metaData("x", 626);
        actionNode_74E7EA41_850E_49CE_BDB2_8E583CE8D243.metaData("width", 154);
        actionNode_74E7EA41_850E_49CE_BDB2_8E583CE8D243.metaData("y", 69);
        actionNode_74E7EA41_850E_49CE_BDB2_8E583CE8D243.metaData("height", 102);
        actionNode_74E7EA41_850E_49CE_BDB2_8E583CE8D243.action(kcontext -> {
            System.out.println("======================");
            System.out.println("4.0 Read from PRISM");
            System.out.println("======================");
        });
        actionNode_74E7EA41_850E_49CE_BDB2_8E583CE8D243.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_6E08A068_6D48_45A9_A79B_895CD892641F = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6E08A068-6D48-45A9-A79B-895CD892641F"));
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.name("XGW1");
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.type(2);
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.metaData("UniqueId", "_6E08A068-6D48-45A9-A79B-895CD892641F");
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.metaData("elementname", "XGW1");
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.metaData("x", 675);
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.metaData("width", 56);
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.metaData("y", 246);
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.metaData("Default", null);
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.metaData("height", 56);
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_74E7EA41-850E-49CE-BDB2-8E583CE8D243"), "_D2EAD34A-EB67-4CC7-BD80-D8BF65515C67", "DROOLS_DEFAULT", "java", kcontext -> {
            return (RejectProcessResult.status == 100);
        }, 0, false);
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B98D5503-C768-4B81-BDDC-6BED0E572194"), "_3320A59C-0ADE-4B53-8427-CDDBDD05ECFC", "DROOLS_DEFAULT", "java", kcontext -> {
            return (RejectProcessResult.status == 200);
        }, 0, false);
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.done();
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_74E7EA41-850E-49CE-BDB2-8E583CE8D243"), "_D2EAD34A-EB67-4CC7-BD80-D8BF65515C67", "DROOLS_DEFAULT", "java", kcontext -> {
            return (RejectProcessResult.status == 100);
        }, 0, false);
        splitNode_6E08A068_6D48_45A9_A79B_895CD892641F.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B98D5503-C768-4B81-BDDC-6BED0E572194"), "_3320A59C-0ADE-4B53-8427-CDDBDD05ECFC", "DROOLS_DEFAULT", "java", kcontext -> {
            return (RejectProcessResult.status == 200);
        }, 0, false);
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_581EA9AE_5DDF_4A4F_8796_BF15633F782A = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_581EA9AE-5DDF-4A4F-8796-BF15633F782A"));
        actionNode_581EA9AE_5DDF_4A4F_8796_BF15633F782A.name("6.0\nUpdate PRISM\n(work/salary)");
        actionNode_581EA9AE_5DDF_4A4F_8796_BF15633F782A.metaData("UniqueId", "_581EA9AE-5DDF-4A4F-8796-BF15633F782A");
        actionNode_581EA9AE_5DDF_4A4F_8796_BF15633F782A.metaData("elementname", "6.0\nUpdate PRISM\n(work/salary)");
        actionNode_581EA9AE_5DDF_4A4F_8796_BF15633F782A.metaData("NodeType", "ScriptTask");
        actionNode_581EA9AE_5DDF_4A4F_8796_BF15633F782A.metaData("x", 1052);
        actionNode_581EA9AE_5DDF_4A4F_8796_BF15633F782A.metaData("width", 154);
        actionNode_581EA9AE_5DDF_4A4F_8796_BF15633F782A.metaData("y", 224);
        actionNode_581EA9AE_5DDF_4A4F_8796_BF15633F782A.metaData("height", 102);
        actionNode_581EA9AE_5DDF_4A4F_8796_BF15633F782A.action(kcontext -> {
            System.out.println("========================");
            System.out.println("6.0 Update PRISM");
            System.out.println("========================");
        });
        actionNode_581EA9AE_5DDF_4A4F_8796_BF15633F782A.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44 = factory.ruleSetNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_AB930C72-21F4-4AC0-875E-2E84B85C8E44"));
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.name("3.0\nAnalayse reject codes");
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.decision("https://kie.apache.org/dmn/_42E18B21-84C5-45D2-8F6C-79B4D2B99CDC", "Reject Processing", "Reject Processing", () -> {
            return app.get(org.kie.kogito.decision.DecisionModels.class).getDecisionModel("https://kie.apache.org/dmn/_42E18B21-84C5-45D2-8F6C-79B4D2B99CDC", "Reject Processing");
        });
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_AB930C72-21F4-4AC0-875E-2E84B85C8E44_fileNameInputX", "fileName", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("feab9e97-ba6b-4f71-964a-ce73f2ac06ae", "EXPRESSION (RejectProcessing.dmn)", "java.lang.Object", "RejectProcessing.dmn"), new org.jbpm.workflow.core.impl.DataDefinition("_AB930C72-21F4-4AC0-875E-2E84B85C8E44_fileNameInputX", "fileName", "java.lang.String", null))), null));
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_AB930C72-21F4-4AC0-875E-2E84B85C8E44_namespaceInputX", "namespace", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("e61cad8e-1457-49bf-a05b-03d2f66d36fd", "EXPRESSION (https://kie.apache.org/dmn/_42E18B21-84C5-45D2-8F6C-79B4D2B99CDC)", "java.lang.Object", "https://kie.apache.org/dmn/_42E18B21-84C5-45D2-8F6C-79B4D2B99CDC"), new org.jbpm.workflow.core.impl.DataDefinition("_AB930C72-21F4-4AC0-875E-2E84B85C8E44_namespaceInputX", "namespace", "java.lang.String", null))), null));
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_AB930C72-21F4-4AC0-875E-2E84B85C8E44_decisionInputX", "decision", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("dd03ed9d-9a7b-4af9-80f6-914c2b9d08f8", "EXPRESSION (Reject Processing)", "java.lang.Object", "Reject Processing"), new org.jbpm.workflow.core.impl.DataDefinition("_AB930C72-21F4-4AC0-875E-2E84B85C8E44_decisionInputX", "decision", "java.lang.String", null))), null));
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_AB930C72-21F4-4AC0-875E-2E84B85C8E44_modelInputX", "model", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("7b92cf44-9689-4187-8991-00dbee507111", "EXPRESSION (Reject Processing)", "java.lang.Object", "Reject Processing"), new org.jbpm.workflow.core.impl.DataDefinition("_AB930C72-21F4-4AC0-875E-2E84B85C8E44_modelInputX", "model", "java.lang.String", null))), null));
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("rejectInputData", "rejectInputData", "org.kie.kogito.hr.RejectInputData", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AB930C72-21F4-4AC0-875E-2E84B85C8E44_RejectInputDataInputX", "RejectInputData", "org.kie.kogito.hr.RejectInputData", null), null, null));
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AB930C72-21F4-4AC0-875E-2E84B85C8E44_RejectProcessResultOutputX", "RejectProcessResult", "org.kie.kogito.hr.RejectProcessResult", null)), new org.jbpm.workflow.core.impl.DataDefinition("rejectProcessResult", "rejectProcessResult", "org.kie.kogito.hr.RejectProcessResult", null), null, null));
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.metaData("UniqueId", "_AB930C72-21F4-4AC0-875E-2E84B85C8E44");
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.metaData("elementname", "3.0\nAnalayse reject codes");
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.metaData("x", 416);
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.metaData("width", 154);
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.metaData("y", 224);
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.metaData("height", 102);
        ruleSetNode_AB930C72_21F4_4AC0_875E_2E84B85C8E44.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_BAB74DC0-572B-43CC-9012-9FDFA4A02F53"));
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.name("5.0\nProcess reject (manual)");
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.workParameter("ActorId", "jdoe");
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.workParameter("NodeName", "5.0\nProcess reject (manual)");
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.workParameter("Skippable", "false");
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.workParameter("TaskName", "Task");
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.workParameter("UNIQUE_TASK_ID", "_BAB74DC0-572B-43CC-9012-9FDFA4A02F53");
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_BAB74DC0-572B-43CC-9012-9FDFA4A02F53_TaskNameInputX", "TaskName", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("73f34340-01ed-4576-8a7d-880ae85de357", "EXPRESSION (Task)", "java.lang.Object", "Task"), new org.jbpm.workflow.core.impl.DataDefinition("_BAB74DC0-572B-43CC-9012-9FDFA4A02F53_TaskNameInputX", "TaskName", "Object", null))), null));
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("rejectInputData", "rejectInputData", "org.kie.kogito.hr.RejectInputData", null)), new org.jbpm.workflow.core.impl.DataDefinition("_BAB74DC0-572B-43CC-9012-9FDFA4A02F53_rejectInputDataInputX", "rejectInputData", "org.kie.kogito.hr.RejectInputData", null), null, null));
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("hr_approval", "hr_approval", "java.lang.Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("_BAB74DC0-572B-43CC-9012-9FDFA4A02F53_approveInputX", "approve", "Boolean", null), null, null));
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("rejectProcessResult", "rejectProcessResult", "org.kie.kogito.hr.RejectProcessResult", null)), new org.jbpm.workflow.core.impl.DataDefinition("_BAB74DC0-572B-43CC-9012-9FDFA4A02F53_rejectProcessResultInputX", "rejectProcessResult", "org.kie.kogito.hr.RejectProcessResult", null), null, null));
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_BAB74DC0-572B-43CC-9012-9FDFA4A02F53_SkippableInputX", "Skippable", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("bb2919fc-0cef-49c8-9aa8-bb1403baddc5", "EXPRESSION (false)", "java.lang.Object", "false"), new org.jbpm.workflow.core.impl.DataDefinition("_BAB74DC0-572B-43CC-9012-9FDFA4A02F53_SkippableInputX", "Skippable", "Object", null))), null));
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_BAB74DC0-572B-43CC-9012-9FDFA4A02F53_approveOutputX", "approve", "Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("hr_approval", "hr_approval", "java.lang.Boolean", null), null, null));
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_BAB74DC0-572B-43CC-9012-9FDFA4A02F53_rejectProcessResultOutputX", "rejectProcessResult", "org.kie.kogito.hr.RejectProcessResult", null)), new org.jbpm.workflow.core.impl.DataDefinition("rejectProcessResult", "rejectProcessResult", "org.kie.kogito.hr.RejectProcessResult", null), null, null));
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.done();
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.metaData("UniqueId", "_BAB74DC0-572B-43CC-9012-9FDFA4A02F53");
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.metaData("elementname", "5.0\nProcess reject (manual)");
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.metaData("x", 864);
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.metaData("width", 154);
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.metaData("y", 69);
        humanTaskNode_BAB74DC0_572B_43CC_9012_9FDFA4A02F53.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_CA8C2870_9D2A_4F07_8BA5_5653AA659D8F = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CA8C2870-9D2A-4F07-8BA5-5653AA659D8F"));
        actionNode_CA8C2870_9D2A_4F07_8BA5_5653AA659D8F.name("2.0\nRead from Kafka");
        actionNode_CA8C2870_9D2A_4F07_8BA5_5653AA659D8F.metaData("UniqueId", "_CA8C2870-9D2A-4F07-8BA5-5653AA659D8F");
        actionNode_CA8C2870_9D2A_4F07_8BA5_5653AA659D8F.metaData("elementname", "2.0\nRead from Kafka");
        actionNode_CA8C2870_9D2A_4F07_8BA5_5653AA659D8F.metaData("NodeType", "ScriptTask");
        actionNode_CA8C2870_9D2A_4F07_8BA5_5653AA659D8F.metaData("x", 206);
        actionNode_CA8C2870_9D2A_4F07_8BA5_5653AA659D8F.metaData("width", 154);
        actionNode_CA8C2870_9D2A_4F07_8BA5_5653AA659D8F.metaData("y", 224);
        actionNode_CA8C2870_9D2A_4F07_8BA5_5653AA659D8F.metaData("height", 102);
        actionNode_CA8C2870_9D2A_4F07_8BA5_5653AA659D8F.action(kcontext -> {
            System.out.println("===================================");
            System.out.println("2.0 Read from Kafka");
            System.out.println("==================================");
        });
        actionNode_CA8C2870_9D2A_4F07_8BA5_5653AA659D8F.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_E9080118_B32B_40D1_B4EC_7FC78D079949 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E9080118-B32B-40D1-B4EC-7FC78D079949"));
        startNode_E9080118_B32B_40D1_B4EC_7FC78D079949.name("1.0");
        startNode_E9080118_B32B_40D1_B4EC_7FC78D079949.interrupting(true);
        startNode_E9080118_B32B_40D1_B4EC_7FC78D079949.metaData("UniqueId", "_E9080118-B32B-40D1-B4EC-7FC78D079949");
        startNode_E9080118_B32B_40D1_B4EC_7FC78D079949.metaData("elementname", "1.0");
        startNode_E9080118_B32B_40D1_B4EC_7FC78D079949.metaData("EventType", "none");
        startNode_E9080118_B32B_40D1_B4EC_7FC78D079949.metaData("x", 97);
        startNode_E9080118_B32B_40D1_B4EC_7FC78D079949.metaData("width", 56);
        startNode_E9080118_B32B_40D1_B4EC_7FC78D079949.metaData("y", 247);
        startNode_E9080118_B32B_40D1_B4EC_7FC78D079949.metaData("height", 56);
        startNode_E9080118_B32B_40D1_B4EC_7FC78D079949.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1044F271-FBBF-48BE-AF05-78BE64253BBA"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_991B8396-3BB4-46EE-9A77-31A70F35C913"), "_F452726F-4E02-4A0E-80D8-C56520B2B57C");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_595808F1-70F6-4BD5-B849-4CF90AF013B6"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B328A9F5-0DD9-41D2-A90F-830B83EF1540"), "_F44C332C-7778-48C8-98FE-92166F51DBBA");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_32C14C87-E69A-41EB-8483-67FEE19C65F4"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B328A9F5-0DD9-41D2-A90F-830B83EF1540"), "_082745C7-D0C0-4F7F-B95F-9577DDC8662D");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8CFDF682-F9E8-4C08-9EFF-CB6448540216"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_595808F1-70F6-4BD5-B849-4CF90AF013B6"), "_C04F12C4-4118-4540-9801-615571D8365C");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_FE289E51-E8D0-4D8C-8FD0-DF8A90387EB5"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_BA629B06-946D-417C-8B74-2845D5FAD7F2"), "_40F09C05-50A5-43B6-9E5F-AF95DB2C6B5B");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_991B8396-3BB4-46EE-9A77-31A70F35C913"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F0987C25-87DB-454E-BE86-94AAA6EB831A"), "_F7FCD3E6-CE9D-4314-8A5F-5D4BDAED56DD");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_32C14C87-E69A-41EB-8483-67FEE19C65F4"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8CFDF682-F9E8-4C08-9EFF-CB6448540216"), "_C2099B31-4F59-4FB1-8D2B-99983AD69DA3");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B328A9F5-0DD9-41D2-A90F-830B83EF1540"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1044F271-FBBF-48BE-AF05-78BE64253BBA"), "_1AC3ABC7-234D-4256-B0A7-1ED700ED866A");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_BA629B06-946D-417C-8B74-2845D5FAD7F2"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_32C14C87-E69A-41EB-8483-67FEE19C65F4"), "_DC4F7542-3949-408F-A0F4-B848FC3F99DA");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4CED4104-32B1-41FA-8629-CF54E52095F7"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_FE289E51-E8D0-4D8C-8FD0-DF8A90387EB5"), "_58781312-8142-4F5B-97CF-B282F93DFDB5");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_581EA9AE-5DDF-4A4F-8796-BF15633F782A"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4CED4104-32B1-41FA-8629-CF54E52095F7"), "_9FBF9C77-9680-4E1D-8485-4FBC55390BF1");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6E08A068-6D48-45A9-A79B-895CD892641F"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B98D5503-C768-4B81-BDDC-6BED0E572194"), "_3320A59C-0ADE-4B53-8427-CDDBDD05ECFC");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_BAB74DC0-572B-43CC-9012-9FDFA4A02F53"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B98D5503-C768-4B81-BDDC-6BED0E572194"), "_B481ECD4-5E17-46ED-89CC-A76D05F54FEF");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6E08A068-6D48-45A9-A79B-895CD892641F"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_74E7EA41-850E-49CE-BDB2-8E583CE8D243"), "_D2EAD34A-EB67-4CC7-BD80-D8BF65515C67");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_AB930C72-21F4-4AC0-875E-2E84B85C8E44"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6E08A068-6D48-45A9-A79B-895CD892641F"), "_5F663AFA-57E2-46AC-AB06-4CB5E32B9F26");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B98D5503-C768-4B81-BDDC-6BED0E572194"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_581EA9AE-5DDF-4A4F-8796-BF15633F782A"), "_A0F827D3-E42B-4C62-B7B4-0B8952F2FCF7");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CA8C2870-9D2A-4F07-8BA5-5653AA659D8F"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_AB930C72-21F4-4AC0-875E-2E84B85C8E44"), "_93E39334-3533-48C6-BB4F-4369A98D6DB5");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_74E7EA41-850E-49CE-BDB2-8E583CE8D243"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_BAB74DC0-572B-43CC-9012-9FDFA4A02F53"), "_120E9FD7-F372-4B24-A3A3-FBDAEC474B77");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E9080118-B32B-40D1-B4EC-7FC78D079949"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CA8C2870-9D2A-4F07-8BA5-5653AA659D8F"), "_B602CA24-FA6A-4BE5-8001-229EA5F416B9");
        factory.validate();
        return factory.getProcess();
    }
}
