package com.form.restApi.models.taskDefinitionController;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "taskDefinitions",
            "total"
    })

    public class TaskDefinitionsResponse {

        @JsonProperty("taskDefinitions")
        private List<TaskDefinition> taskDefinitions = null;
        @JsonProperty("total")
        private Integer total;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("taskDefinitions")
        public List<TaskDefinition> getTaskDefinitions() {
            return taskDefinitions;
        }

        @JsonProperty("taskDefinitions")
        public void setTaskDefinitions(List<TaskDefinition> taskDefinitions) {
            this.taskDefinitions = taskDefinitions;
        }

        @JsonProperty("total")
        public Integer getTotal() {
            return total;
        }

        @JsonProperty("total")
        public void setTotal(Integer total) {
            this.total = total;
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

