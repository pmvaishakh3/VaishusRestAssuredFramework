package Restfulbooker;

import io.restassured.RestAssured;

public class PathParameterExample2 {

	public static void main(String[] args) {
		
		//inline paramaters
		
		
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("{basepath}/{bookingId}")
			//.pathParam("basepath", "booking")
			//.pathParam("bookingId", 2)
		.when()
			.get("https://restful-booker.herokuapp.com/{basepath}/{bookingId}","booking",2)
		.then()
			.log()
			.all();
			
			
		
	} 
		// TODO Auto-generated method stub

	
	
}
