package restAssured;



import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import io.restassured.RestAssured;

import io.restassured.http.Method;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

import utility.Constants;



public class POST_CreateUSERS_APITest {

    

    

    

    @Test(dataProvider = "sampleData")

    public void verifyListUserTest(String ibm_emp, String ibm_role) throws Exception {

        

        

        //RestAssured 

        //Enviornment - QA/DEV/Stage/Prod

        //RestAssured.baseURI = Constants.URI_API_sample;

        RestAssured.baseURI = "https://reqres.in";

        

        

        //Request Object

        

        RequestSpecification httprequest  = RestAssured.given();

        //parameter
        
        //header
        httprequest.header("Content-Type", "application/json");        //

        
        //body
        
//        {
//
//            "name": "morpheus",
//
//            "job": "leader"
//
//        }
//        
        
        JSONObject requestParams = new JSONObject();
        
        requestParams.put("name", ibm_emp);
        requestParams.put("job", ibm_role);
        
        
        httprequest.body(requestParams.toJSONString());
        
        
        System.out.println(requestParams.toJSONString());
        
        

        //Response Object 

        Response resp = httprequest.request(Method.POST, "/api/users");    // request sent to serer

        

        

        //Print on Consle output

        

        System.out.println("=================Response body=======================");

        //System.out.println(resp.asString());

        System.out.println(resp.asPrettyString());

        

        

        //validation Step

        

        int actualStatusCode = resp.getStatusCode();

        Assert.assertEquals(actualStatusCode, 201);

        

        

        //Validation Step

        String actualResponseContent = resp.getBody().asPrettyString();

        //System.out.println(actualResponseContent);
        Assert.assertTrue(actualResponseContent.contains(ibm_emp));

        

        Thread.sleep(3000);
        System.out.println("=============================================");
        System.out.println(resp.getContentType());    						//format get the response -------- json
        

    }

    

    @DataProvider
    public Object[][] sampleData() {
    	
    	
    	Object[][] data = {{"Priya", "Sr. Leader"}, {"Priyanka", "Leader"}, {"Unmesha", "Sr. Leader"}};
    	return data;
    }
    



}

