package Restfulbooker;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class MeasureResponseTime {
	
	public static void main(String[] args) {
		
		//1.Build Request- Same as GIVEN
		
		//RequestSpecification requestSpecification = RestAssured.given();
		//RequestSpecification requestSpecification =  RestAssured.given().log().all();
		//RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/").basePath("booking");
		
		
			Response response = RestAssured
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
			.contentType(ContentType.JSON)
		//2.Hit Request and get Response- Same as WHEN
			.post();
		//3.validate response- Same as THEN
			//.then();
			long responseTimeInMS = response.time();
			System.out.println("Reponse Time In MS : " + responseTimeInMS);
			
			
			long reponseTimeInSecconds = response.timeIn(TimeUnit.SECONDS);
			System.out.println("Reponse Time In MS : " + reponseTimeInSecconds);
			
			long responseTimeInMS1 = response.getTime();
			System.out.println("Reponse Time In MS 1 : " + responseTimeInMS1);
			
			
			long reponseTimeInSecconds1 = response.getTimeIn(TimeUnit.SECONDS);
			System.out.println("Reponse Time In seconds 1 : " + reponseTimeInSecconds1);
		
				
//			response.then().time(Matchers.lessThan(5000L)); //response time check less than 5 sec
//			
//			response.then().time(Matchers.greaterThan(1000L));
//			response.then().time(Matchers.both(Matchers.greaterThan(1000L)).
//					and(Matchers.greaterThan(5000L)));
			
			response.then().time(Matchers.lessThan(3L),TimeUnit.SECONDS);
			
			
			
		
		
		//2.Hit Request and get Response
		
		//Response response = requestSpecification.post();
		

		//Validate Response

		//ValidatableResponse validateableResponse = response.then().log().all();
		//validateableResponse.statusCode(200);
		
			
		
		
	}


}
