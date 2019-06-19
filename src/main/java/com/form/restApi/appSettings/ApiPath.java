package com.form.restApi.appSettings;

public enum ApiPath {
    /**
     * auth-controller
     */
    AUTH_TOKEN("gw/v1/auth/tokens"),
    GET_SETTINGS("gw/v1/auth/settings");

    String path;

    ApiPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
