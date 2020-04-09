package org.testing.TestScripts;

import java.io.IOException;

import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.Utilities.PropertiesFileLoad;

import com.jayway.restassured.response.Response;

//TC -------------------- GetAll Request----------------------------------

public class EmployeeTC1 {
    
	static String Result;
	
	public void empTestCase1() throws IOException {
		
//		JSONObject data = new JSONObject();
//		data.put("id", "26");
//		data.put("employee_name", "Vikas Niranjan");
//		data.put("employee_salary", "78000");
//		data.put("employee_age", "35");
//		data.put("profile_image", "London");
		
		Properties pr = PropertiesFileLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
		HttpMethods http = new HttpMethods(pr);
		Response res = http.getRequest("Employee_GetAllURI");
		Result = res.asString();
		
		System.out.println("Employee Test Case 1");
		System.out.println("Status code is " + res.getStatusCode());
		System.out.println(Result);
		
		ResponseValidation.responseStatusCodeValidate(200, res);
	}
}
