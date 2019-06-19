package com.form.restApi.models.authController;

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
        "password",
        "portalId",
        "refreshToken",
        "username"
})
public class PostTokenRequest {

    @JsonProperty("password")
    private String password;
    @JsonProperty("portalId")
    private Integer portalId;
    @JsonProperty("refreshToken")
    private String refreshToken;
    @JsonProperty("username")
    private String username;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public PostTokenRequest(){

    }

    public PostTokenRequest( Integer portalId, String username,String password) {
        this.password = password;
        this.portalId = portalId;
        this.username = username;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public PostTokenRequest setPassword(String password) {
        this.password = password;
        return this;
    }

    @JsonProperty("portalId")
    public Integer getPortalId() {
        return portalId;
    }

    @JsonProperty("portalId")
    public PostTokenRequest setPortalId(Integer portalId) {
        this.portalId = portalId;
        return this;
    }

    @JsonProperty("refreshToken")
    public String getRefreshToken() {
        return refreshToken;
    }

    @JsonProperty("refreshToken")
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public PostTokenRequest setUsername(String username) {
        this.username = username;
        return this;
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