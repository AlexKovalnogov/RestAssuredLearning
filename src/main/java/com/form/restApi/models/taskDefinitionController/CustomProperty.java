package com.form.restApi.models.taskDefinitionController;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "mappedFormItem",
        "title",
        "usage"
})
public class CustomProperty {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("mappedFormItem")
    private MappedFormItem mappedFormItem;
    @JsonProperty("title")
    private String title;
    @JsonProperty("usage")
    private Usage usage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("mappedFormItem")
    public MappedFormItem getMappedFormItem() {
        return mappedFormItem;
    }

    @JsonProperty("mappedFormItem")
    public void setMappedFormItem(MappedFormItem mappedFormItem) {
        this.mappedFormItem = mappedFormItem;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("usage")
    public Usage getUsage() {
        return usage;
    }

    @JsonProperty("usage")
    public void setUsage(Usage usage) {
        this.usage = usage;
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
