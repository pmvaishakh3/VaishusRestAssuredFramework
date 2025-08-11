package Restfulbooker.support;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public final class Specs {
    private Specs() {}

    public static RequestSpecification jsonRequest() {
        return new RequestSpecBuilder()
            .setBaseUri(Routes.BASE_URI)
            .setContentType(ContentType.JSON)
            .build();
    }

    public static ResponseSpecification successJson() {
        return new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectContentType(ContentType.JSON)
            .build();
    }
}


