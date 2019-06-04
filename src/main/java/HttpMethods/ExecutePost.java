package HttpMethods;

import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ExecutePost {

    public Response executePost(String token, String contentType,String jsonBody,String url) {
        io.restassured.response.Response response = given()
                .auth()
                .oauth2(token)
                .contentType(contentType)
                .body(jsonBody)
                .when()
                .post(url);
        return response;
    }


}
