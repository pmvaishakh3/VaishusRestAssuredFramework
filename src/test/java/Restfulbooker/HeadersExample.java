package Restfulbooker;

//import java.awt.List;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;

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
	@Test
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
	@Test
	public void PassHeader2() {
		
		Header header = new Header("Header1", "value1");
		RestAssured
			.given()
			.log()
			.all()
			.header(header)	
		.when()
		.get();

	}
	@Test
	public void PassHeader3() {
	
	//Map<String,String>  headerMap = new HashMap<>()
	RestAssured
		.given()
		.log()
		.all()
		.headers("h1","v1","h2","v2","h3","v3","h2","8")
	.when()
	.get();

}
	@Test
	public void PassHeader4() {
		
		List <Header>  allHeaders = new ArrayList< >();
		Header header = new Header("Header1", "value1");
		Header header1 = new Header("Header2", "value2");
		allHeaders.add(header);
		allHeaders.add(header1);

		
		Headers headers = new Headers(allHeaders);
		
	
//		Map<String,String>  headerMap = new HashMap< >();
//		headerMap.put("h1", "v1");
//		headerMap.put("h2", "v2");
//		headerMap.put("h3", "v3");
//		headerMap.put("h2", "v4");
		
		
		
		RestAssured
			.given()
			.log()
			.all()
			.headers(headers)
		.when()
		.get();

	}
}
