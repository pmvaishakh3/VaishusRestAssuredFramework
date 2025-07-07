package Restfulbooker;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DefaultValues1 {
	
	@BeforeTest
	
	
	public void setup() 
	{
		RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
		RestAssured.basePath = "booking";
		System.out.println("In Setup");
	}
	
	@Test

	public void createBookin1()
	{
		RestAssured 
		.given()
		.log()
		.all()
		//.baseUri("https://restful-booker.herokuapp.com/")
		//.basePath("booking")
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
