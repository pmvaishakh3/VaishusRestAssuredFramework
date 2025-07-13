package JsonPathEgs;

import io.restassured.path.json.JsonPath;

public class JsonPathForNestedJsonArray {
	
	
	public static void main(String[] args) {
		
		
		String jsonArray = "[\n"
				+ "  \"10\",\n"
				+ "  \"20\",\n"
				+ "  \"30\",\n"
				+ "  \"40\"\n"
				+ "]" ;
		
		JsonPath jsonPath = new JsonPath(jsonArray);
		System.out.println(jsonPath.getString("[0]"));
		System.out.println(jsonPath.getString("[5]"));
		System.out.println(jsonPath.getList("$").size());
		
			
	}

}
