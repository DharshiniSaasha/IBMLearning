package restAssured;
//import org.json.simple.JSONObject;


import org.json.simple.JSONObject;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.Matchers.*;







import io.restassured.http.Method;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;



public class ExerciseApi2 {

	

	RequestSpecification httpRequest;

	

	@Test

	public void verifyCreateuserTest() {



		

		//https://api.github.com/user/repos

		

		JSONObject requestBody = new JSONObject();

		

		requestBody.put("name", "RepoName");

		//requestBody.put("job", "leader");

		

		

		baseURI = "https://api.github.com";

		

		

		given().

			header("Content-Type", "application/json").

			body(requestBody).

			auth().

			oauth2("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").

		

		when().

			post("/user/repos").

		

		then().

			statusCode(201).

			body("", equalTo("RepoName")).

			//body("job", equalTo("leader")).

			log().all();

		

	}

	



}