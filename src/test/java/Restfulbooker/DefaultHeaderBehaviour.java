package Restfulbooker;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;

public class DefaultHeaderBehaviour {

	
	
	@Test
	
	public void defaultBehaviour() {

		
		RestAssured
			.given()
			.header("header1","value1","value2")
			//.header("header1","Value1")
			//.header("header1","Value2")
			.log()
			.all()
		.when()
			.get();
		
	}
	
	@Test
	
	public void overwriteheaderValue() {

		
		RestAssured
			.given()
			.config(RestAssuredConfig.config().
					headerConfig(HeaderConfig.headerConfig().overwriteHeadersWithName("header1")))
			.header("header1","value1")
			.header("header1","value2")
			.header("header3","value3")
			.header("header3","value4")
			.header("header2","value5")
			.header("header2","value6")
			.log()
			.all()
		.when()
			.get();
		
		
	}
	
	
}