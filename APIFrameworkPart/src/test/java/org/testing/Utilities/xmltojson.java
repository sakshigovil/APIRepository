package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class xmltojson {

	public static String xmltoJsonObject(String xml) {
	
		JSONObject responsemessage = XML.toJSONObject(xml);
		return responsemessage.toString();
		
	}
	
	public static String xmltoJsonArray(String xml) {
		
		JSONArray responsemessage = new JSONArray(xml);
		return responsemessage.toString();
		
	}
}
