package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

//TC2 ---------- Get Request
//We take id value from TC1 --- API Chaining

public class TC2 
{

	@Test
 public void testCase2() throws IOException
 {
	Properties pr = PropertiesFileLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
	HttpMethods http = new HttpMethods(pr);
	
	Response res = http.getRequest("QA_URI", TC1.idValue);
	
	System.out.println("Second Test Case");

	ResponseValidation.responseStatusCodeValidate(200, res);
	
	System.out.println(res.asString());
 }
	
	
}
