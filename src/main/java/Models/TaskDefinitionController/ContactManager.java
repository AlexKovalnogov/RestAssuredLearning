package Models.TaskDefinitionController;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "amount",
        "modelId",
        "nameFormula",
        "snapshot",
        "viewId"
})
public class ContactManager {

    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("modelId")
    private Integer modelId;
    @JsonProperty("nameFormula")
    private String nameFormula;
    @JsonProperty("snapshot")
    private Integer snapshot;
    @JsonProperty("viewId")
    private Integer viewId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("modelId")
    public Integer getModelId() {
        return modelId;
    }

    @JsonProperty("modelId")
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    @JsonProperty("nameFormula")
    public String getNameFormula() {
        return nameFormula;
    }

    @JsonProperty("nameFormula")
    public void setNameFormula(String nameFormula) {
        this.nameFormula = nameFormula;
    }

    @JsonProperty("snapshot")
    public Integer getSnapshot() {
        return snapshot;
    }

    @JsonProperty("snapshot")
    public void setSnapshot(Integer snapshot) {
        this.snapshot = snapshot;
    }

    @JsonProperty("viewId")
    public Integer getViewId() {
        return viewId;
    }

    @JsonProperty("viewId")
    public void setViewId(Integer viewId) {
        this.viewId = viewId;
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
