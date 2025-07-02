package Restfulbooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBooking {

	public static void main(String[] args) {
		
		
		//Given-build request
		//RequestSpecification requestSpecification = RestAssured.given().log().all();
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("booking/{id}")
				.pathParam("id", 90)
			.when()
				.get()
			.then()
				.log()
				.all()
				.statusCode(200);
		
		//when-hit request and get response
		
		
		
		//then-validate the response
		
		//ValidatableResponse  validatableResponse = response.then().log().all();
		//validatableResponse.statusCode(200);
		

	}

}
