package Restfulbooker;

import Restfulbooker.api.BookingApi;
import Restfulbooker.model.Booking;
import Restfulbooker.model.BookingDates;
import io.restassured.response.ValidatableResponse;

import java.util.HashMap;
import java.util.Map;

public class DemoCrudFlow {
    public static void main(String[] args) {
        // Create
        Booking booking = new Booking(
            "Jim","Brown",111,true,
            new BookingDates("2018-01-01","2019-01-01"),
            "Breakfast"
        );
        ValidatableResponse create = BookingApi.createBooking(booking).statusCode(200);
        int id = create.extract().path("bookingid");

        // Auth token (restful-booker test creds)
        String token = BookingApi.createToken("admin", "password123");

        // GET
        BookingApi.getBooking(id).statusCode(200);

        // PUT
        Booking updated = new Booking(
            "Jane","Doe",222,false,
            new BookingDates("2019-02-02","2019-03-03"),
            "Lunch"
        );
        BookingApi.updateBookingPut(id, updated, token).statusCode(200);

        // PATCH
        Map<String, Object> partial = new HashMap<>();
        partial.put("firstname", "Patched");
        BookingApi.updateBookingPatch(id, partial, token).statusCode(200);

        // DELETE
        BookingApi.deleteBooking(id, token).statusCode(201);
    }
}


