package JsonPathEgs;

import io.restassured.path.json.JsonPath;

public class JsonPathForJsonArrays {

	public static void main(String[] args) {
		
//		String JsonArray = "[\n"
//				+ "  {\n"
//				+ "    \"firstname\": \"Jim\",\n"
//				+ "    \"lastname\": \"Brown\",\n"
//				+ "    \"age\": 30,\n"
//				+ "    \"address\": [\n"
//				+ "      {\n"
//				+ "        \"city\": \"kannur\",\n"
//				+ "        \"country\": \"india\"\n"
//				+ "      },\n"
//				+ "      {\n"
//				+ "        \"city\": \"Banglore\",\n"
//				+ "        \"country\": \"india\"\n"
//				+ "      }\n"
//				+ "    ]\n"
//				+ "  },\n"
//				+ "  {\n"
//				+ "    \"firstname\": \"Dileep\",\n"
//				+ "    \"lastname\": \"Jain\",\n"
//				+ "    \"age\": 36,\n"
//				+ "    \"address\": [\n"
//				+ "      {\n"
//				+ "        \"city\": \"Kozhikode\",\n"
//				+ "        \"country\": \"srilanka\"\n"
//				+ "      },\n"
//				+ "      {\n"
//				+ "        \"city\": \"Kanpur\",\n"
//				+ "        \"country\": \"srilanka\"\n"
//				+ "      }\n"
//				+ "    ]\n"
//				+ "  }\n"
//				+ "]";
		
		//the below code will give null, which is the default value, in some parts as the system is not
		// not able to find datas there
		String JsonArray = "[\n"    
				+ "  {\n"
				+ "    \"firstname\": \"Jim\",\n"
				+ "    \"lastname\": \"Brown\",\n"
				+ "    \"age\": 30,\n"
				+ "    \"address\": [\n"
				+ "      {\n"
				+ "        \"city\": \"kannur\",\n"
				+ "        \"country\": \"india\"\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"city\": \"Payyanur\"\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"city1\": \"Banglore1\",\n"
				+ "        \"country1\": \"india1\"\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"firstname\": \"Dileep\",\n"
				+ "    \"lastname\": \"Jain\",\n"
				+ "    \"age\": 36,\n"
				+ "    \"address\": [\n"
				+ "      {\n"
				+ "        \"city\": \"Kozhikode\",\n"
				+ "        \"country\": \"india\"\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"city\": \"Kanpur\",\n"
				+ "        \"country\": \"india\"\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  }\n"
				+ "]";
		JsonPath jsonPath = new JsonPath(JsonArray);
		
		String city1 = jsonPath.getString("[0].address[0].city");
		System.out.println(city1);
		
		String city2 = jsonPath.getString("[1].address[1].city");
		System.out.println(city2);

		System.out.println(jsonPath.getList("[0].address.city"));
		System.out.println(jsonPath.getList("address.city"));
		System.out.println(jsonPath.getList("address.country"));
		
	}

}
