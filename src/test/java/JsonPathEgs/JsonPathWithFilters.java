package JsonPathEgs;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathWithFilters {
	
	public static void main(String[] args) {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/JsonPathEgs/People.json";
		File jsonArrayFile = new File(filePath);
		
		JsonPath jsonPath = new JsonPath(jsonArrayFile);
		System.out.println(jsonPath.getString("[0].id"));
		
		List<String> allIds = jsonPath.getList("id");
		System.out.println(allIds);
		
		List<String> allfirstnames=jsonPath.getList("findAll{it.gender == 'female'}.firstname");
		System.out.println(allfirstnames);
		
		List<String> emailId = 
				jsonPath.getList("findAll{it.firstname == 'tim' | it.lastname == 'Browne'}.email");
		System.out.println(emailId);
		
		String emailId1 = 
				jsonPath.getString("find{it.firstname == 'Jim' & it.lastname == 'Brown'}.email");
		System.out.println(emailId1);
		
		List<String> allEmailId = 
				jsonPath.getList("findAll{it.firstname == 'Jim' | it.lastname == 'Jain'}.email");
		System.out.println(allEmailId);
		
		System.out.println(jsonPath.getList("findAll{it.id <= 5}.firstname"));
		
		System.out.println(jsonPath.getInt("size()"));
		
		
		//System.out.println(jsonPath.getInt("size()"));
		
		
	}
	
			

}
