package JsonPathEgs;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathNonExistence {
	
	@Test
	private void jsonPathDemo() {
		
		String json = "{\r\n" +
		        " \"firstname\": \"Amod\",\r\n " +
		        " \"lastname\": \"Brown\",\r\n" +
		        "}";
		
		//get Json Path instance of given Json doc
		JsonPath JsonPath = new JsonPath(json);
		//String firstName = JsonPath.getString("firstname");
		//int firstName = JsonPath.getInt("firstname1");

		
		//System.out.println(firstName);
		
	
		System.out.println((Object)JsonPath.get("$"));
		System.out.println((Object)JsonPath.getString("$"));
		System.out.println((Object)JsonPath.get());
		System.out.println(JsonPath.getString(""));
	}
	
}
