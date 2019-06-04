package Rest_assured;

import Executor.MyTestExecutor;
import HttpMethods.ExecuteGet;
import Models.TaskDefinitionController.TaskDefinition;
import Models.TaskDefinitionController.TaskDefinitionsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class MethodsGet extends MyTestExecutor {


    @Test
    public void testGetTaskDefinitions() {


        Response res = given().
                auth().
                oauth2(tokenValue).
                contentType("applicatin/json").
                when().
                get("gw/v1/task-definitions");
        getListOfTaskDefinitions();
        getTaskIdFronList(85839);

        ObjectMapper objectMapper = new ObjectMapper();
      //objectMapper.readValue(res.getBody().toString(), TaskDefinition.class);
       System.out.println(res.getBody().asString());
        //System.out.println( getListOfTaskDefinitions().toString());
    }

    @Test
    public void testGetTaskForTaskDefinition() {
        given().
                auth().
                oauth2(tokenValue).
        contentType("application /json").
                when().get().then().statusCode(200).and().extract().path("total").equals("2");
    }

    private List<Integer> getListOfTaskDefinitions() {
        Response response = given().
                auth().
                oauth2(tokenValue).
                contentType("applicatin/json").
                when().
                get("gw/v1/task-definitions");
        JsonPath jsonPathEvaluator = response.jsonPath();
        List<Integer> tdList = jsonPathEvaluator.getList("taskDefinitions.id");
        return tdList;
    }

    private int getTaskIdFronList(int tdId) {
        List<Integer> list = getListOfTaskDefinitions();
        for (Integer currentTdId : list)
            if (currentTdId.equals(tdId)) {
                return currentTdId;
            }
        throw new NullPointerException("Value is absent in array");
    }

    @Test
    public void testName() {
        executeGet.executeGet(tokenValue,contentType,"gw/v1/task-definitions").then().statusCode(200).and().extract().path("total").equals("2");

    }
}


