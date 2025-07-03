package Restfulbooker;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class PathParameterHashMap {

	public static void main(String[] args) {
		 
		Map<String,Object> pathParameters = new HashMap< >();
		pathParameters.put("basepath", "booking");
		pathParameters.put("bookingId", 2);
		
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("{basepath}/{bookingId}")
			//.pathParam("basepath", "booking")
			//.pathParam("bookingId", 2)
			.pathParams(pathParameters)
			
		.when()
			.get("https://restful-booker.herokuapp.com/{basepath}/{bookingId}","booking",2)
		.then()
			.log()
			.all();
			
			
		
	} 

	
	
}
