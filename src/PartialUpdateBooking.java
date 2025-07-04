package Restfulbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PartialUpdateBooking {

	public static void main(String[] args) {
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("booking/1")
				.body("'{\n"
						+ "    \"firstname\" : \"vijay\",\n"
						+ "    \"lastname\" : \"Kumar\"\n"
						+ "}'")
				.contentType(ContentType.JSON)
				.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=] ")
			.when()
				.patch()
			.then()
				.log()
				.all()
				.assertThat()
				.statusCode(201);
				
			
	}

}
