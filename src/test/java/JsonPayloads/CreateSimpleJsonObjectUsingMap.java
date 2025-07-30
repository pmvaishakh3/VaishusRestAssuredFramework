package JsonPayloads;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateSimpleJsonObjectUsingMap {
	
	public static void main(String[] args) {
		//if we put string it will only give string objects. but to do a generic one we need to 
		//use object which is super class of all
		Map<String,String> jsonObjectPayload = new HashMap< >();
		jsonObjectPayload.put("id","100");
		jsonObjectPayload.put("firstname","Sally");
		jsonObjectPayload.put("lastname","Brown");
		jsonObjectPayload.put("married","false");
		jsonObjectPayload.put("salary","100.899");
		
		RestAssured 
			.given()
			.log()
			.all()
			.body(jsonObjectPayload)
			.get();
		
	}

}
