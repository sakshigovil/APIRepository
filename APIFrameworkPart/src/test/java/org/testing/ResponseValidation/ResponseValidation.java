package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseValidation 
{

	public static void responseStatusCodeValidate(int expectedStatusCode, Response res)
	{
		if (expectedStatusCode == res.statusCode())
		{
			System.out.println("Status code " + res.getStatusCode() + " is correct");
		}
	}
}
