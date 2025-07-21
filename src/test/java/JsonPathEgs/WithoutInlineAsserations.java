package JsonPathEgs;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class WithoutInlineAsserations {
	
	
	public static void main(String[] args) {
		
		
		String jsonResponse = " ";
	
		
		jsonResponse = RestAssured 
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/auth")
				.body("{\"username\": \"admin\",\n"
						+ "					  \"password\": \"password123\"\n"
						+ "					}")
					  
				.contentType(ContentType.JSON)
			.when()
				.post()
			.then()
				.log()
				.all()
				.extract()
				.asString();
		
		JsonPath jsonPath = new JsonPath(jsonResponse);
		Assert.assertNull(jsonPath.get("token"));		
		Assert.assertNotNull(jsonPath.get("token"));	

	}
}