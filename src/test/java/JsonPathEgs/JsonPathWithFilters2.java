package JsonPathEgs;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathWithFilters2 {
	
	public static void main(String[] args) {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/JsonPathEgs/people1.json";
		File jsonArrayFile = new File(filePath);
		
		JsonPath jsonPath = new JsonPath(jsonArrayFile);
		
		System.out.println(jsonPath.getString("data[0].firstname"));
		
//		List<String> allIds = jsonPath.getList("id");
//		System.out.println(allIds);
//		
		List<String> allfirstnames=jsonPath.getList("data.findAll{it.gender == 'female'}.firstname");
		System.out.println(allfirstnames);
		
		
	}
	
			

}
