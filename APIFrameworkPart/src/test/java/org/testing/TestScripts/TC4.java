package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

// TC4 ----------- Delete Request

public class TC4 {
	
	@Test
	
	public void testCase4() throws IOException {

	Properties pr = PropertiesFileLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
	HttpMethods http = new HttpMethods(pr);
	Response res = http.deleteRequest("QA_URI","KJD");
	
	System.out.println("Fourth Test Case");
	System.out.println("Status code is "+ res.getStatusCode());
	ResponseValidation.responseStatusCodeValidate(202, res);
	
	}
	
}
