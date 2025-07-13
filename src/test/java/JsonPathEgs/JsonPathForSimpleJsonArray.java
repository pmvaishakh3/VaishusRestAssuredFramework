package JsonPathEgs;

import io.restassured.path.json.JsonPath;

public class JsonPathForSimpleJsonArray {
	
	
	public static void main(String[] args) {
		
		
		String jsonArray = "[\r\n" +
				 " [\r\n" +
				 "  \"10\",\r\n"
				+ "  \"20\",\r\n"
				+ "  \"30\",\r\n"
				+ "  \"40\"\r\n"
				+ "],\r\n"
				+ "[\r\n"
				+ 	"100\",\r\n"
				+ "200\",\r\n"
				+ "300\",\r\n"
				+ "400\",\r\n"
				+ "100\",\r\n" 
				+ "]\r\n" +
				"]";
					
		
		
		
		JsonPath jsonPath = new JsonPath(jsonArray);
		System.out.println(jsonPath.getString("[0][2]"));
		//System.out.println(jsonPath.getString("[5][0]"));
		//System.out.println(jsonPath.getList("$").size());
		
			
	}

}
