package org.testing.Utilities;

import org.json.JSONObject;

public class ResponseParsingUsingOrgJson {

	public static String responseParsing(String message,String s, String searchKey) {
		
		JSONObject j = new JSONObject(message);
		return j.getJSONObject(s).get(searchKey).toString();
	}
}
