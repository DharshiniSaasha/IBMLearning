package restAssured;
//import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class ExerciseApi {
    
    RequestSpecification httpRequest;
    
    @Test
    public void verifyCreateuserTest() {
        
        JSONObject requestBody = new JSONObject();
        
        requestBody.put("name", "DharshiniIBMGithub1");
      
        
        
        baseURI = "https://api.github.com";
        
        
        given().
            header("Content-Type", "application/json").
            auth().oauth2("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").
            //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
            //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 
            body(requestBody).
        
        when().
            post("/user/repos").
        
        then().
            statusCode(201).
            body("name", equalTo("DharshiniIBMGithub1")).
           
        
            log().all();
        
    }
    
}
