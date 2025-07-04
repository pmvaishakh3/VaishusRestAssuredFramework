package Restfulbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;
//import io.restassured.specification.RequestSpecification;

public class ExtractResponseAsString {

	
	public static void main(String[] args) {
		
		String responseBody = RestAssured
			.given()
			//.log()
			//.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking")
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
		
		
		
			.contentType(ContentType.JSON)
		
			.post()
		
			.then()
			//.log()
			//.all()
			.extract() // used for extract anything and mention what to extract
			//.body()
			//.asString() // print output in single line
			.asPrettyString(); //to print output as jSON file or formatted string
		
		System.out.println(responseBody);
	
		
			
		
		
	}

}
