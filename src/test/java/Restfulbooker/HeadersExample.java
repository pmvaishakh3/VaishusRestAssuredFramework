package Restfulbooker;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class HeadersExample {

	
	@Test
	public void PassHeader() {
		
		RestAssured
			.given()
			.log()
			.all()
			.header("header1", "value1")//can use muliple values in same script
			.header("header2", "value1","value2","value3")
		.when()
		.get();

	}
	
	public void PassHeader1() {
		
		RestAssured
			.given()
			.log()
			.all()
			.header("header1", "value1")//can use muliple values in same script
			.header("header1", "value2")
		.when()
		.get();

	}

}
