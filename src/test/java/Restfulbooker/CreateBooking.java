package Restfulbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBooking {

	
	public static void main(String[] args) {
		
		//1.Build Request- Same as GIVEN
		
		//RequestSpecification requestSpecification = RestAssured.given();
		//RequestSpecification requestSpecification =  RestAssured.given().log().all();
		//RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/").basePath("booking");
		
		
		RestAssured
			.given()
			.log()
			.all()
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
		
		
		//requestSpecification.contentType("application/json");
		//requestSpecification
			.contentType(ContentType.JSON)
		//2.Hit Request and get Response- Same as WHEN
			.post()
		//3.validate response- Same as THEN
			.then()
			.log()
			.all()
			.statusCode(400);
			
			
		
		
		//2.Hit Request and get Response
		
		//Response response = requestSpecification.post();
		

		//Validate Response

		//ValidatableResponse validateableResponse = response.then().log().all();
		//validateableResponse.statusCode(200);
		
			
		
		
	}

}
