package org.testing.TestScripts;

import java.io.IOException;

import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseDataParsingUsingJsonPath;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

//TC -------------- Post Request

public class TC1 {
	
	static String idValue;

	@Test 
	
	public void testCase1() throws IOException {
		
		Random r = new Random();
		Integer i  = r.nextInt();
		System.out.println(i);
		
		
		JSONObject data = new JSONObject();
		data.put("firstname", "Bhuvanendra");
		data.put("lastname", "Shukla");
		data.put("id", i.toString());
		data.put("designation", "QA Lead");
		
		Properties pr = PropertiesFileLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
		HttpMethods http = new HttpMethods(pr);
		Response res = http.postRequest("QA_URI", data.toString());
		
		idValue = ResponseDataParsingUsingJsonPath.response_parsing(res, "id");
		
		System.out.println("First Test Case");
		//System.out.println("Status code is " +res.statusCode());
		System.out.println("Data is ");
		System.out.println(res.asString());
		ResponseValidation.responseStatusCodeValidate(201, res);

	}
}
