package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC5 {

	@Test
	
	public void testCase5() throws IOException {
		
		Properties pr = PropertiesFileLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
		HttpMethods http = new HttpMethods(pr);
		Response res = http.getRequest("QA_URI");
		
		System.out.println("Fifth Test Case");
		ResponseValidation.responseStatusCodeValidate(200, res);
		System.out.println(res.asString());
	}
}
