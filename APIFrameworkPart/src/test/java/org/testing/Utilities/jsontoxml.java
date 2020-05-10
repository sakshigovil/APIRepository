package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class jsontoxml {

	public static String jsonObjecttoxmlConversion(String jsonData) {
		
		JSONObject obj = new JSONObject(jsonData);
		return XML.toString(obj);
	}
	
	public static String jsonArraytoxmlConversion(String jsonData) {
		
		JSONArray arr = new JSONArray(jsonData);
		return XML.toString(arr);
	}
}
