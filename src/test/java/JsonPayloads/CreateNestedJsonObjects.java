package JsonPayloads;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateNestedJsonObjects {
	
	private static void main(String[] args) {
		Map<Object,Object> jsonObjectPayload = new LinkedHashMap< >();
		jsonObjectPayload.put("id",100);
		jsonObjectPayload.put("firstname","Sally");
		jsonObjectPayload.put("lastname","Brown");
		jsonObjectPayload.put("married",false);
		jsonObjectPayload.put("salary",100.899);
		
		Map<String,Object> addressMap = new LinkedHashMap<String, Object>();
		addressMap.put("no","31#");
		addressMap.put("area","kannur");
		addressMap.put("district","payanyr");
		addressMap.put("phone","8979999");
		addressMap.put("state","KA");
		
		jsonObjectPayload.put("address","addressMap");
		
		RestAssured 
		.given()
		.log()
		.all()
		.body(jsonObjectPayload)
		.get();


}
}
