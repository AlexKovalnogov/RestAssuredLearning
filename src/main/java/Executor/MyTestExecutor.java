package Executor;

import HttpMethods.ExecuteGet;
import HttpMethods.ExecutePost;
import Models.AuthController.PostTokenRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import org.testng.annotations.*;

import static io.restassured.RestAssured.given;

public class MyTestExecutor {
    protected static final String BASEURL = "http://app-ksmobile.ssstest.com";
    private String json;
    protected String tokenValue;
    protected static String contentType = "application/json";
    protected ExecuteGet executeGet;
    protected ExecutePost executePost;



    @BeforeClass
    public String getToken() {
        RestAssured.baseURI = BASEURL;
        String jsonBoby = getJsonBodyForPostTokensRequest(768560, "2", "2");
        tokenValue = given().
                contentType("application/json").
                body(jsonBoby).
                when().
                post("gw/v1/auth/tokens").
                then().
                extract().
                path("token");

        return tokenValue;
    }

    @BeforeClass
    public void Initilization()
    {
        executeGet = new ExecuteGet();
        executePost = new ExecutePost();
    }

    @AfterClass
    public void deleteToken() {

        given()
                .baseUri(BASEURL)
                .header("Authorization", tokenValue)
                .when()
                .delete("gw/v1/auth/tokens")
                .then().
                statusCode(200);
    }


    private String getJsonBodyForPostTokensRequest(int PortalID, String userName, String userPassword) {
        PostTokenRequest tokenRequestBobyJson = new PostTokenRequest(PortalID, userName, userPassword);
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            json = objectMapper.writeValueAsString(tokenRequestBobyJson);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.out.println("Error " + e + " happened during creating JSON");
        }
        return json;

    }


}
