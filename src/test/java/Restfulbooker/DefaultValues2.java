package Restfulbooker;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DefaultValues2 {
	
	
	
	@Test

	public void createBookin1()
	{
		RestAssured 
		.given()
		.log()
		.all()
		.basePath("auth")
		//.baseUri("https://restful-booker.herokuapp.com/")
		//.basePath("booking")
		.body(" {\r\n"
			+ "    \"username\" : \"admin\",\n"
			+ "    \"password\" : \"password123\"\n"
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
		.statusCode(200);
		

	}
	
	@Test
	public void createBooking2()
	{
		RestAssured 
		.given()
		.log()
		.all()
		//.baseUri("https://restful-booker.herokuapp.com/")
		//.basePath("booking")
		.body(" {\n"
			+ "        \"firstname\": \"Kumar\",\n"
			+ "        \"lastname\": \"Sanu\",\n"
			+ "        \"totalprice\": 131,\n"
			+ "        \"depositpaid\": false,\n"
			+ "        \"bookingdates\": {\n"
			+ "            \"checkin\": \"2018-01-01\",\n"
			+ "            \"checkout\": \"2019-01-01\"\n"
			+ "        },\n"
			+ "        \"additionalneeds\": \"Lunch\"\n"
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
		.statusCode(200);
		

	}
}
