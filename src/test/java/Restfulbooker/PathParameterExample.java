package Restfulbooker;

import io.restassured.RestAssured;

public class PathParameterExample {

	public static void main(String[] args) {
		
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("{basepath}/{bookingId}")
			.pathParam("basepath", "booking")
			.pathParam("bookingId", 2)
		.when()
			.get()
		.then()
			.log()
			.all();
			
			
		
	} 
		// TODO Auto-generated method stub

	
	
}
