package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

//TC3------ Update Request

public class TC3 {
	
	@Test
	
	public void testCase3() throws IOException {
		
		JSONObject data = new JSONObject();
		data.put("firstName", "Bhuvan");
		data.put("lastname", "Nath");
		data.put("id", TC1.idValue);
		data.put("designation", "QA Manager");

	Properties pr = PropertiesFileLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
	HttpMethods http = new HttpMethods(pr);
	Response res = http.putRequest("QA_URI", TC1.idValue, data.toString());
	
	System.out.println("Third Test Case");
	System.out.println(res.asString());
	ResponseValidation.responseStatusCodeValidate(200, res);
	}
	
}
