package JsonPathEgs;

import io.restassured.path.json.JsonPath;

public class JsonPathForSimpleJsonObject {
	
	private static void main(String[] args) {
		String jsonObject = "{\r\n	" +
				 " \"firstname\": \"Amod\",\r\n " +
				 "	\"lastname\": \"Brown\",\r\n" +
				 "	\"age\": 28,\r\n" +
				 " 	\"address\": \"Bengalru\",\r\n" +
				 "}";

		JsonPath jp = new JsonPath(jsonObject);
		String firstName = jp.getString("firstName");
		System.out.println(firstName);
		
		

	}

	
	}

}
