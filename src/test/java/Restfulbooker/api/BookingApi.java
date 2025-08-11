package Restfulbooker.api;

import Restfulbooker.model.Booking;
import Restfulbooker.support.Routes;
import Restfulbooker.support.Specs;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import java.util.Map;

public class BookingApi {
    public static ValidatableResponse createBooking(Booking booking) {
        return RestAssured
            .given(Specs.jsonRequest())
            .log().all()
            .basePath(Routes.BOOKING)
            .body(booking)
            .post()
            .then();
    }

    public static ValidatableResponse getBooking(int id) {
        return RestAssured
            .given(Specs.jsonRequest())
            .log().all()
            .basePath(Routes.BOOKING_ID)
            .pathParam("id", id)
            .get()
            .then();
    }

    public static ValidatableResponse updateBookingPut(int id, Booking booking, String token) {
        return RestAssured
            .given(Specs.jsonRequest())
            .log().all()
            .header("Cookie", "token=" + token)
            .basePath(Routes.BOOKING_ID)
            .pathParam("id", id)
            .body(booking)
            .put()
            .then();
    }

    public static ValidatableResponse updateBookingPatch(int id, Map<String, Object> partial,
                                                         String token) {
        return RestAssured
            .given(Specs.jsonRequest())
            .log().all()
            .header("Cookie", "token=" + token)
            .basePath(Routes.BOOKING_ID)
            .pathParam("id", id)
            .body(partial)
            .patch()
            .then();
    }

    public static ValidatableResponse deleteBooking(int id, String token) {
        return RestAssured
            .given(Specs.jsonRequest())
            .log().all()
            .header("Cookie", "token=" + token)
            .basePath(Routes.BOOKING_ID)
            .pathParam("id", id)
            .delete()
            .then();
    }

    public static String createToken(String username, String password) {
        return RestAssured
            .given(Specs.jsonRequest())
            .log().all()
            .basePath(Routes.AUTH)
            .contentType(ContentType.JSON)
            .body(Map.of("username", username, "password", password))
            .post()
            .then()
            .statusCode(200)
            .extract()
            .path("token");
    }
}


