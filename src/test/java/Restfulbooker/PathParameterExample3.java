package Restfulbooker;

import io.restassured.RestAssured;

public class PathParameterExample3 {

	public static void main(String[] args) {
		
		//inline paramaters
		
		//https://token.herokuapp.com/2/3
		//https%3A/token/herokuapp/com/2/3

		RestAssured
		.given()
			.log()
			.all()
			//.baseUri("https://restful-booker.herokuapp.com/")
			//.basePath("{basepath}/{bookingId}")
			//.pathParam("basepath", "booking")
			.pathParam("baseAddress", "token")
		.when()
				//https://restful-booker.herokuapp.com/booking/token
			//.get("https://restful-booker.herokuapp.com/{basepath}/{bookingId}","token",2)
			//.get("https://{baseAddress}.herokuapp.com/{basepath}/{bookingId}",2,3)
			.get("https:/{baseAddress}/herokuapp/com/{basepath}/{bookingId}",2,3)


		.then()
			.log()
			.all();
			
			
		
	} 
		// TODO Auto-generated method stub

	
	
}
