package org.testing.TestSteps;

import java.util.Properties;


import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;


public class HttpMethods {
     
	Properties pr;
	
	public HttpMethods(Properties pr) 
	{
		this.pr = pr;
	}
	
	
	public Response postRequest(String uriKey, String body)
	{
		Response res =
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post(pr.getProperty(uriKey));
		
		return res;		
	}
	
	public Response getRequest(String uriKey, String idValue)
	{
		String uri = pr.getProperty(uriKey) + "/" + idValue;
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
				
				return res;
	}
	
	public Response getRequest(String uriKey)
	{
		
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(uriKey));
				
				return res;
	}
	
	public Response putRequest(String uriKey, String idValue, String body)
	{
		String uri = pr.getProperty(uriKey) + "/" + idValue;
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.put(uri);
		
		return res;
	}
	
	public Response deleteRequest (String uriKey, String idValue)
	{
		String uri = pr.getProperty(uriKey) + "/" + idValue;
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uri);
		
		return res;
	}
}
