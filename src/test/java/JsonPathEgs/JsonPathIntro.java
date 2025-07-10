package JsonPathEgs;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathIntro {
	
	@Test
	private void jsonPathDemo() {
		
		String json = "{\r\n" +
		        " \"firstname\": \"123\",\r\n " +
		        " \"lastname\": \"Brown\",\r\n" +
		        "}";
		
		//get Json Path instance of given Json doc
		JsonPath JsonPath = new JsonPath(json);
		String firstName = JsonPath.getString("firstname");
		
		System.out.println(firstName);
		
		Object fname = JsonPath.get("firstname");
		System.out.println(fname);
		

		//int i = JsonPath.get("firstname");
		//System.out.println(i);
		
		String s = "amod";
		System.out.println(Integer.parseInt(s));
	}
	
}
