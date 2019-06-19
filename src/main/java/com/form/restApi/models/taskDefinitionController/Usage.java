package com.form.restApi.models.taskDefinitionController;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "filter",
        "manager",
        "myTasks",
        "taskDetail"
})
public class Usage {

        @JsonProperty("filter")
        private Boolean filter;
        @JsonProperty("manager")
        private Boolean manager;
        @JsonProperty("myTasks")
        private Boolean myTasks;
        @JsonProperty("taskDetail")
        private Boolean taskDetail;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("filter")
        public Boolean getFilter() {
            return filter;
        }

        @JsonProperty("filter")
        public void setFilter(Boolean filter) {
            this.filter = filter;
        }

        @JsonProperty("manager")
        public Boolean getManager() {
            return manager;
        }

        @JsonProperty("manager")
        public void setManager(Boolean manager) {
            this.manager = manager;
        }

        @JsonProperty("myTasks")
        public Boolean getMyTasks() {
            return myTasks;
        }

        @JsonProperty("myTasks")
        public void setMyTasks(Boolean myTasks) {
            this.myTasks = myTasks;
        }

        @JsonProperty("taskDetail")
        public Boolean getTaskDetail() {
            return taskDetail;
        }

        @JsonProperty("taskDetail")
        public void setTaskDetail(Boolean taskDetail) {
            this.taskDetail = taskDetail;
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
