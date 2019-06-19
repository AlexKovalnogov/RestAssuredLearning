package com.form.restApi.requestSpecCreator;

import com.form.restApi.appSettings.ConfigProperties;
import com.form.restApi.testExecutor.Token;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RequestSpecificationCreator {


    public RequestSpecification createSpecification(String basePath, ContentType contentType, String jsonBody, Map<String, String> queryParams) {

        RequestSpecBuilder requestBuilder = new RequestSpecBuilder();
        requestBuilder.setBaseUri(new ConfigProperties().readProperty("BASEURI"))
                .setBasePath(basePath)
                .addHeader("Authorization", Token.getToken())
                .addHeader("Content-Type", contentType.toString());
        if (jsonBody != "") {
            requestBuilder.setBody(jsonBody);
        } else if (queryParams.isEmpty()) {
            return requestBuilder.build();
        } else {
            requestBuilder.addQueryParameters(queryParams);
        }
        return requestBuilder.build();
    }

}



