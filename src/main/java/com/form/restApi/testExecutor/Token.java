package com.form.restApi.testExecutor;

import com.form.restApi.appSettings.ApiPath;
import com.form.restApi.appSettings.ConfigProperties;
import com.google.gson.Gson;
import io.restassured.response.Response;
import com.form.restApi.models.authController.PostTokenRequest;

import static io.restassured.RestAssured.given;

public class Token {

    public static String getToken() {
        Gson g = new Gson();
        ConfigProperties configProperties = new ConfigProperties();
        Response res = given()
                .contentType("application/json")
                .baseUri(configProperties.readProperty("BASEURI"))
                .body(g.toJson(
                        new PostTokenRequest()
                                .setPortalId(Integer.valueOf(configProperties.readProperty("PORTALID")))
                                .setUsername(configProperties.readProperty("LOGIN"))
                                .setPassword(configProperties.readProperty("PASSWORD"))))
                .when()
                .post(ApiPath.AUTH_TOKEN.getPath());
        if (res.getStatusCode() == 200) {
            return res.getBody().path("token");
        } else try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(res.getBody().asString());
        }
        return null;
    }
}
