package JsonPathEgs;

import io.restassured.path.json.JsonPath;

public class JsonPathForSimpleJsonObject {
	
	public static void main(String[] args) {
//		String jsonObject = "{\r\n	" +
//				 " \"firstname\": \"Amod\",\r\n " +
//				 "	\"lastname\": \"Brown\",\r\n" +
//				 "	\"age\": 28,\r\n" +
//				 " 	\"address\": \"Bengalru\",\r\n" +
//				 "   \"married\" : false,\r\n" +
//				 "  \"salary\" : 10.50\r\n" +
//				 "}";
//
//		JsonPath jp = new JsonPath(jsonObject);
		 
			/* code for Json */
//		String firstname = jp.getString("firstname");
//		System.out.println("first Name : " + firstname);
//		
//		int age = jp.getInt("age");
//		System.out.println("age : " + age);
//		
//		float salary = jp.getFloat("salary");
//		System.out.println("Salary : " + salary);
//		
//		boolean married = jp.getBoolean("married");
//		System.out.println("Married : " + married);
//		
//		double salaryd = jp.getDouble("salary");
//		System.out.println("Salary : " + salaryd);

		
			/* code for nested Json */
		
		String jsonObject = "{\r\n	" +
				 " \"firstname\": \"Amod\",\r\n " +
				 "	\"lastname\": \"Brown\",\r\n" +
				 "	\"age\": 28,\r\n" +
				 " 	\"address\": {\r\n"
				 + "\"flatNo\" :401,\r\n"
				 + "\"building Name\" : \"mahaveer konark\",\r\n"
				 + "\"pin\":560078\r\n"
				 + "},\r\n" +
				 "   \"married\" : false,\r\n" +
				 "  \"salary\" : 10.50\r\n" +
				 "}";

		JsonPath jp = new JsonPath(jsonObject);
		int fn = jp.getInt("address.flatNo");
		System.out.println("flat no : " +fn);
		int pin = jp.getInt("address.pin");
		System.out.println("pin : "  +pin);
		
	}

	
	}


