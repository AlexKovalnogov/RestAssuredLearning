package com.form.restApi.models.taskDefinitionController;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "assign",
        "assignedViewId",
        "editDueDate",
        "modifyClosedTask",
        "unassign"
})
public class ResponsiblePartiesPermissions {

    @JsonProperty("assign")
    private Boolean assign;
    @JsonProperty("assignedViewId")
    private Integer assignedViewId;
    @JsonProperty("editDueDate")
    private Boolean editDueDate;
    @JsonProperty("modifyClosedTask")
    private Boolean modifyClosedTask;
    @JsonProperty("unassign")
    private Boolean unassign;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("assign")
    public Boolean getAssign() {
        return assign;
    }

    @JsonProperty("assign")
    public void setAssign(Boolean assign) {
        this.assign = assign;
    }

    @JsonProperty("assignedViewId")
    public Integer getAssignedViewId() {
        return assignedViewId;
    }

    @JsonProperty("assignedViewId")
    public void setAssignedViewId(Integer assignedViewId) {
        this.assignedViewId = assignedViewId;
    }

    @JsonProperty("editDueDate")
    public Boolean getEditDueDate() {
        return editDueDate;
    }

    @JsonProperty("editDueDate")
    public void setEditDueDate(Boolean editDueDate) {
        this.editDueDate = editDueDate;
    }

    @JsonProperty("modifyClosedTask")
    public Boolean getModifyClosedTask() {
        return modifyClosedTask;
    }

    @JsonProperty("modifyClosedTask")
    public void setModifyClosedTask(Boolean modifyClosedTask) {
        this.modifyClosedTask = modifyClosedTask;
    }

    @JsonProperty("unassign")
    public Boolean getUnassign() {
        return unassign;
    }

    @JsonProperty("unassign")
    public void setUnassign(Boolean unassign) {
        this.unassign = unassign;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
