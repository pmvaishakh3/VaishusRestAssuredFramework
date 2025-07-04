package Restfulbooker;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MultipleBooking {
	
	RequestSpecification requestSpecification;
	
	
	@BeforeClass
	public void setupRequestSpec()
	{
		
		requestSpecification = RestAssured.given();
		requestSpecification
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.contentType(ContentType.JSON);
			
		
	}

	@Test
	 public void Createbooking1()
	 {
		RestAssured
		.given()
		.spec(requestSpecification)
		.basePath("booking")
		//.log()
		//.all()
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
		//.contentType(ContentType.JSON)
	//2.Hit Request and get Response- Same as WHEN
		.post()
	//3.validate response- Same as THEN
		.then()
		.log()
		.all()
		.statusCode(200);	

}
	
	@Test
	public void updateBooking()
	{
		RestAssured
		.given()
			//.log()
			//.all()
			//.baseUri("https://restful-booker.herokuapp.com/")
			//.basePath("booking/20")
			//.header("Content-Type","application/json")
		
			.spec(requestSpecification)
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=]")
			.basePath("booking/1")
			.body("'{\n"
				+ "    \"firstname\" : \"Dileep\",\n"
				+ "    \"lastname\" : \"Kumar\",\n"
				+ "    \"totalprice\" : 909,\n"
				+ "    \"depositpaid\" : true,\n"
				+ "    \"bookingdates\" : {\n"
				+ "        \"checkin\" : \"2018-01-01\",\n"
				+ "        \"checkout\" : \"2019-01-01\"\n"
				+ "    },\n"
				+ "    \"additionalneeds\" : \"Dinner\"\n"
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
