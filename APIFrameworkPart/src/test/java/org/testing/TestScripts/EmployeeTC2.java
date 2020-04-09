package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testing.TestSteps.HttpMethods;
import org.testing.Utilities.PropertiesFileLoad;

import com.jayway.restassured.response.Response;

//----------Post Request-----------------

public class EmployeeTC2 {
    
	static String Array;
	
	public void empTestCase2() throws IOException
	{
		JSONObject jobject = new JSONObject(EmployeeTC1.Result); 
		
		JSONArray jarray = jobject.getJSONArray("data");
		
		// Only to test the steps till here
		Array = jarray.toString();
		System.out.println("******");
		System.out.println(Array);
		// Done testing
		
		
			JSONObject insert = new JSONObject();	
			insert.put("id", "444");
			insert.put("employee_name", "Vikas Niranjan");
			insert.put("employee_salary", "78000");
			insert.put("employee_age", "35");
			
			jarray.put(insert);
		
			
		Properties pr = PropertiesFileLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
		HttpMethods http = new HttpMethods(pr);
		Response res = http.postRequest("Employee_PostURI", jarray.toString());
		
		System.out.println("Employee Second Test Case");
		System.out.println("Status code is "+ res.getStatusCode());
		System.out.println(res.asString());
		System.out.println(Array);
		
		
		
	}
}
