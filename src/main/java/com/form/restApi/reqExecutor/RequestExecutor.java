package com.form.restApi.reqExecutor;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RequestExecutor {

    /**
     * GET methods
     */
    public Response executeGet(RequestSpecification requestSpecification) {

        Response response = given().
                spec(requestSpecification)
                .when()
                .get();
        return response;
    }

    /**
     * POST methods
     */

    public Response executePost(RequestSpecification requestSpecification) {
        Response response = given()
                .spec(requestSpecification)
                .when()
                .post();
        return response;
    }

}
