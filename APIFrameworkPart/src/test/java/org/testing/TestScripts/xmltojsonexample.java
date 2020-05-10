package org.testing.TestScripts;

import org.testing.Utilities.xmltojson;

public class xmltojsonexample {

	public static void main(String[] args) {
		
		String message = xmltojson.xmltoJsonObject("<student><name>Dheeraj Priya</name><age>35</age></student>");
		System.out.println("after conversion to json message is");
		System.out.println(message);
	}
}
