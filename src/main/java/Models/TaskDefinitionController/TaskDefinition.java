package Models.TaskDefinitionController;
import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "appliedContactFilterColumns",
        "contactManager",
        "customProperties",
        "form",
        "icon",
        "id",
        "requireDueDate",
        "requireFormSubmissionToCloseTask",
        "responsiblePartiesPermissions",
        "statusQuestionId",
        "statuses",
        "title"
})
public class TaskDefinition {

    @JsonProperty("appliedContactFilterColumns")
    private List<Integer> appliedContactFilterColumns = null;
    @JsonProperty("contactManager")
    private ContactManager contactManager;
    @JsonProperty("customProperties")
    private List<CustomProperty> customProperties = null;
    @JsonProperty("form")
    private Form form;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("requireDueDate")
    private Boolean requireDueDate;
    @JsonProperty("requireFormSubmissionToCloseTask")
    private Boolean requireFormSubmissionToCloseTask;
    @JsonProperty("responsiblePartiesPermissions")
    private ResponsiblePartiesPermissions responsiblePartiesPermissions;
    @JsonProperty("statusQuestionId")
    private Integer statusQuestionId;
    @JsonProperty("statuses")
    private List<Status> statuses = null;
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("appliedContactFilterColumns")
    public List<Integer> getAppliedContactFilterColumns() {
        return appliedContactFilterColumns;
    }

    @JsonProperty("appliedContactFilterColumns")
    public void setAppliedContactFilterColumns(List<Integer> appliedContactFilterColumns) {
        this.appliedContactFilterColumns = appliedContactFilterColumns;
    }

    @JsonProperty("contactManager")
    public ContactManager getContactManager() {
        return contactManager;
    }

    @JsonProperty("contactManager")
    public void setContactManager(ContactManager contactManager) {
        this.contactManager = contactManager;
    }

    @JsonProperty("customProperties")
    public List<CustomProperty> getCustomProperties() {
        return customProperties;
    }

    @JsonProperty("customProperties")
    public void setCustomProperties(List<CustomProperty> customProperties) {
        this.customProperties = customProperties;
    }

    @JsonProperty("form")
    public Form getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(Form form) {
        this.form = form;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("requireDueDate")
    public Boolean getRequireDueDate() {
        return requireDueDate;
    }

    @JsonProperty("requireDueDate")
    public void setRequireDueDate(Boolean requireDueDate) {
        this.requireDueDate = requireDueDate;
    }

    @JsonProperty("requireFormSubmissionToCloseTask")
    public Boolean getRequireFormSubmissionToCloseTask() {
        return requireFormSubmissionToCloseTask;
    }

    @JsonProperty("requireFormSubmissionToCloseTask")
    public void setRequireFormSubmissionToCloseTask(Boolean requireFormSubmissionToCloseTask) {
        this.requireFormSubmissionToCloseTask = requireFormSubmissionToCloseTask;
    }

    @JsonProperty("responsiblePartiesPermissions")
    public ResponsiblePartiesPermissions getResponsiblePartiesPermissions() {
        return responsiblePartiesPermissions;
    }

    @JsonProperty("responsiblePartiesPermissions")
    public void setResponsiblePartiesPermissions(ResponsiblePartiesPermissions responsiblePartiesPermissions) {
        this.responsiblePartiesPermissions = responsiblePartiesPermissions;
    }

    @JsonProperty("statusQuestionId")
    public Integer getStatusQuestionId() {
        return statusQuestionId;
    }

    @JsonProperty("statusQuestionId")
    public void setStatusQuestionId(Integer statusQuestionId) {
        this.statusQuestionId = statusQuestionId;
    }

    @JsonProperty("statuses")
    public List<Status> getStatuses() {
        return statuses;
    }

    @JsonProperty("statuses")
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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
