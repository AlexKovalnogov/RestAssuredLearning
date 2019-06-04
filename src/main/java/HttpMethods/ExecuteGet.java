package HttpMethods;

import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class ExecuteGet {

    public Response executeGet(String token, String contentType, String url) {
        Response response = given()
                .auth()
                .oauth2(token)
                .contentType(contentType)
                .when()
                .get(url);
        return response;
    }
    public Response executeGet(String token, String contentType, String url, Map<String,String> queryParams) {
        Response response = given()
                .auth()
                .oauth2(token)
                .contentType(contentType)
                .when()
                .get(url);
        return response;
    }

}
