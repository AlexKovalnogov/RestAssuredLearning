package com.form.restApi.testAuthController;

import com.form.restApi.appSettings.ApiPath;
import com.form.restApi.testExecutor.MyTestExecutor;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;

public class GetSettingsEndpoint extends MyTestExecutor {


    @Test
    public void testExecuteGetSettings() {

        RequestSpecification requestSpecification = requestSpecificationCreator.createSpecification(
                ApiPath.GET_SETTINGS.getPath(),
                ContentType.JSON,
                "",
                new HashMap<String, String>()
        );

        Response response = requestExecutor.executeGet(requestSpecification);


        System.out.println(response.getStatusCode()+ response.getBody().asString());



    }
}
