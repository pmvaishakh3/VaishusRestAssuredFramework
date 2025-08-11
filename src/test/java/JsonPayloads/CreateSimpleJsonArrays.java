package JsonPayloads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateSimpleJsonArrays {
    
    public static void main(String[] args) {

        Map<String, Object> empDetails = new HashMap<>();
        empDetails.put("id", 1);
        empDetails.put("first_name", "Fortnam");
        empDetails.put("email", "mfortnam0@:.co");
        empDetails.put("gender", "Female");
        empDetails.put("city", "Libofshë");
        
        List<Map<String, Object>> allEmp = new ArrayList<>();
        allEmp.add(empDetails);

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
