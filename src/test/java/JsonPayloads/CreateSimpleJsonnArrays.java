package JsonPayloads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateSimpleJsonnArrays {
    
    public static void main(String[] args) {

        Map<String, Object> empDetails = new LinkedHashMap<>();
        empDetails.put("id", 1);
        empDetails.put("first_name", "Fortnam");
        empDetails.put("email", "mfortnam0@:.co");
        empDetails.put("gender", "Female");
        empDetails.put("city", "Libofshë");
        
        Map<String, Object> empDetails2 = new LinkedHashMap<>();
        empDetails2.put("id", 2);
        empDetails2.put("first_name", "dil");
        empDetails2.put("email", "fortnam0@:.co");
        empDetails2.put("gender", "male");
        empDetails2.put("city", "kochi");
        
        Map<String, Object> empDetails3 = new LinkedHashMap<>();
        empDetails3.put("id", 3);
        empDetails3.put("first_name", "dil");
        empDetails3.put("email", "fortnam0@:.co");
        empDetails3.put("gender", "male");
        empDetails3.put("city", "kochi");
        
        List<Map<String, Object>> allEmp = new ArrayList<>();
        allEmp.add(empDetails);
        allEmp.add(empDetails2);
        allEmp.add(empDetails3);

        RestAssured
            .given()
            .log()
            .all()
            .contentType(ContentType.JSON)
            .body(allEmp)
            .get();
            //.post("https://httpbin.org/post");
    }




}
