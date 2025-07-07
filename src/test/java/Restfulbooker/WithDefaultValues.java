package Restfulbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class WithDefaultValues {

	
	public static void main(String[] args) {
		
		RestAssured 
			.given()
			.log()
			.all()
			//.baseUri("https://restful-booker.herokuapp.com/")
			//.basePath("booking")
			.body(" {\n"
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
		//2.Hit Request and get Response- Same as WHEN
			.post()
		//3.validate response- Same as THEN
			.then()
			.log()
			.all()
			.statusCode(200);
			

	}

}
