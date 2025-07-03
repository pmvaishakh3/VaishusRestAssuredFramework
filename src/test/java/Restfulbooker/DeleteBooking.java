package Restfulbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteBooking {

	public static void main(String[] args) {
		
	//Construct Request
		
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com")
			//.basePath("booking/1")
			.basePath("{booking/bookingID}")
			.pathParam("bookingID", "6")
			.contentType(ContentType.JSON)
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		
	//Hit request
			
		.when()
			.delete()
		
	//Validate request
		
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(201);

	}

}
