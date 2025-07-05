package Restfulbooker;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreateBookingWithRequestandResponseSpec {

	
	public static void main(String[] args) {
		
		
			
			RequestSpecification requestSpecification = RestAssured.given();
			requestSpecification
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
				
				.contentType(ContentType.JSON);
			
			ResponseSpecification responseSpecification=RestAssured.expect();
			responseSpecification.statusCode(200);
			responseSpecification.contentType(ContentType.JSON);
			responseSpecification.time(Matchers.lessThan(5000L));
			
			RestAssured
			.given(requestSpecification,responseSpecification)
//			.log()
//			.all()
//			.baseUri("https://restful-booker.herokuapp.com/")
//			.basePath("booking")
			//.spec(requestSpecification)
			
		
		//requestSpecification.contentType("application/json");
		//requestSpecification
		//	.contentType(ContentType.JSON)
		//2.Hit Request and get Response- Same as WHEN
			.post()
		//3.validate response- Same as THEN
			.then()
			.log()
			.all();
		//	.statusCode(200);
			//.spec(responseSpecification);ß
			
			
		
			
		
		
	}

}
