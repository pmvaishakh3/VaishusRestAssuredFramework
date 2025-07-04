package Restfulbooker;

import io.restassured.RestAssured;

public class UpdateBookingPut {

	public static void main(String[] args) {
		
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/4749")
			.header("Content-Type","application/json")
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
			//.header("Authorization","token=abc123xyz456")
			//.cookie("token", token)
			.body("'{\n"
				+ "    \"firstname\" : \"Dileep\",\n"
				+ "    \"lastname\" : \"Kuar\",\n"
				+ "    \"totalprice\" : 909,\n"
				+ "    \"depositpaid\" : true,\n"
				+ "    \"bookingdates\" : {\n"
				+ "        \"checkin\" : \"2018-01-01\",\n"
				+ "        \"checkout\" : \"2019-01-01\"\n"
				+ "    },\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\n"
				+ "}")
		.when()
			.put()
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);

	}

}
