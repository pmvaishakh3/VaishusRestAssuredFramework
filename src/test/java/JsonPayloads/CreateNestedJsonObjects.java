package JsonPayloads;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateNestedJsonObjects {
	
	public static void main(String[] args) {
		Map<String, Object> jsonObjectPayload = new LinkedHashMap<>();
		jsonObjectPayload.put("id",100);
		jsonObjectPayload.put("firstname","Sally");
		jsonObjectPayload.put("lastname","Brown");
		jsonObjectPayload.put("married",false);
		jsonObjectPayload.put("salary",100.899);
		//jsonObjectPayload.put("address","");
		
		Map<String,Object> addressMap = new LinkedHashMap<String, Object>();
		addressMap.put("no","31#");
		addressMap.put("area","kannur");
		addressMap.put("district","payanyr");
		addressMap.put("phone","8979999");
		addressMap.put("state","KA");
		
		jsonObjectPayload.put("address",addressMap);
		
		RestAssured
			.given()
			.log()
			.all()
			.contentType(ContentType.JSON)
			.body(jsonObjectPayload)
			.post("https://httpbin.org/post");


}
}
