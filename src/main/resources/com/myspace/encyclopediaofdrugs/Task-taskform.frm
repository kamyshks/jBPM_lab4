{"id":"432b23a1-0063-44c6-a185-37ecd084a3de","name":"Task-taskform.frm","model":{"taskName":"Task","processId":"Encyclopediaofdrugs.SimpleMed","properties":[{"name":"isApproved","typeInfo":{"type":"BASE","className":"java.lang.Boolean","multiple":false},"metaData":{"entries":[]}},{"name":"medicament","typeInfo":{"type":"OBJECT","className":"com.myspace.encyclopediaofdrugs.Medicament","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.task.TaskFormModel"},"fields":[{"nestedForm":"bdee6fac-f989-4780-9ab3-86244b67e4d6","container":"FIELD_SET","id":"field_2060601733188E12","name":"medicament","label":"Medicament","required":false,"readOnly":false,"validateOnChange":true,"binding":"medicament","standaloneClassName":"com.myspace.encyclopediaofdrugs.Medicament","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"id":"field_0953273557130924E12","name":"isApproved","label":"IsApproved","required":false,"readOnly":false,"validateOnChange":true,"binding":"isApproved","standaloneClassName":"java.lang.Boolean","code":"CheckBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.checkBox.definition.CheckBoxFieldDefinition"}],"layoutTemplate":{"version":3,"style":"FLUID","layoutProperties":{},"rows":[{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_2060601733188E12","form_id":"432b23a1-0063-44c6-a185-37ecd084a3de"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_0953273557130924E12","form_id":"432b23a1-0063-44c6-a185-37ecd084a3de"},"parts":[]}]}]}]}}