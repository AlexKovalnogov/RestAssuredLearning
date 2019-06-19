package com.form.restApi.models.taskDefinitionController;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "answerId",
        "questionId",
        "valueFormat",
        "valueType"
})
public class MappedFormItem {

    @JsonProperty("answerId")
    private Integer answerId;
    @JsonProperty("questionId")
    private Integer questionId;
    @JsonProperty("valueFormat")
    private String valueFormat;
    @JsonProperty("valueType")
    private String valueType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("answerId")
    public Integer getAnswerId() {
        return answerId;
    }

    @JsonProperty("answerId")
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    @JsonProperty("questionId")
    public Integer getQuestionId() {
        return questionId;
    }

    @JsonProperty("questionId")
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    @JsonProperty("valueFormat")
    public String getValueFormat() {
        return valueFormat;
    }

    @JsonProperty("valueFormat")
    public void setValueFormat(String valueFormat) {
        this.valueFormat = valueFormat;
    }

    @JsonProperty("valueType")
    public String getValueType() {
        return valueType;
    }

    @JsonProperty("valueType")
    public void setValueType(String valueType) {
        this.valueType = valueType;
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
