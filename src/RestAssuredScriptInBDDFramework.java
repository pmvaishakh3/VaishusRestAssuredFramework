package Restfulbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAssuredScriptInBDDFramework {
	
	public static void main(String[] args) {
		
		//Given- Build request
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
				.body(" {\r\n"
					+ "        \"firstname\": \"Jim\",\n"
					+ "        \"lastname\": \"Brown\",\n"
					+ "        \"totalprice\": 111,\n"
					+ "        \"depositpaid\": true,\n"
					+ "        \"bookingdates\": {\n"
					+ "            \"checkin\": \"2018-01-01\",\n"
					+ "            \"checkout\": \"2019-01-01\"\n"
					+ "        },\n"
					+ "        \"additionalneeds\": \"Breakfast\"\n"
					+ "    }")
			
		
		//requestSpecification.contentType("application/json");
		//requestSpecification
				.contentType(ContentType.JSON)
			.when()
				.post()
			.then()
				.statusCode(200);
		
		///when
		
		//then
		
		
	}
}
