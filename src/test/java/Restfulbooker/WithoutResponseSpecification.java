package Restfulbooker;

import java.net.ResponseCache;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class WithoutResponseSpecification {
	
	ResponseSpecification responseSpecification;
	
	@BeforeClass 
	//created this class so that the below set of code as same set of asserations are used in both create methods 
	//and is used common 
	public void SetUpExpectations() {
		
		ResponseSpecification responseSpecification=RestAssured.expect();
		responseSpecification.statusCode(200);
		responseSpecification.contentType(ContentType.JSON);
		responseSpecification.time(Matchers.lessThan(5000L));
		
		
	}
	
	@Test
	public void createBooking() {
		
	RestAssured
	.given()
	.log()
	.all()
	.baseUri("https://restful-booker.herokuapp.com/")
	.basePath("booking")
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
	.contentType(ContentType.JSON)// this says which format we are sending request payload
//2.Hit Request and get Response- Same as WHEN
	.post()
//3.validate response- Same as THEN
	.then()
	.log()
	.all()
	//.statusCode(200)
	//.contentType(ContentType.JSON)//this verify the reponse body in json
	//.time(Matchers.lessThan(5000L));// used for performance testing , peformance time check and 5000L is given as time takes Long int  
	.spec(responseSpecification);
}
	@Test
	public void createBooking2() {
	
	RestAssured
	.given()
	.log()
	.all()
	.baseUri("https://restful-booker.herokuapp.com/")
	.basePath("booking")
	.body(" {\n"
		+ "        \"firstname\": \"Jimmy\",\n"
		+ "        \"lastname\": \"sanu\",\n"
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
	.contentType(ContentType.JSON)// this says which format we are sending request payload
//2.Hit Request and get Response- Same as WHEN
	.post()
//3.validate response- Same as THEN
	.then()
	.log()
	.all()
	//.statusCode(200)
	//.contentType(ContentType.JSON)//this verify the reponse body in json
	//.time(Matchers.lessThan(5000L));// used for performance testing , peformance time check and 5000L is given as time takes Long int  
	.spec(responseSpecification);
}
}