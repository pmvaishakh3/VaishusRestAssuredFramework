package JsonPayloads;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateSimpleJsonObjectUsingMapDataTypes {
	
	public static void main(String[] args) {
		//if we put string it will only give string objects. but to do a generic one we need to 
		//use object which is super class of all
		
		//since we are using Hashmap we are getting the output as unordered.
		//for manking it ordered we need to use LinkedHashMap
		
		//Map<Object,Object> jsonObjectPayload = new HashMap< >();
		Map<Object,Object> jsonObjectPayload = new LinkedHashMap< >();
		jsonObjectPayload.put("id",100);
		jsonObjectPayload.put("firstname","Sally");
		jsonObjectPayload.put("lastname","Brown");
		jsonObjectPayload.put("married",false);
		jsonObjectPayload.put("salary",100.899);
		
		RestAssured 
			.given()
			.log()
			.all()
			.body(jsonObjectPayload)
			.get();
		
	}

}
