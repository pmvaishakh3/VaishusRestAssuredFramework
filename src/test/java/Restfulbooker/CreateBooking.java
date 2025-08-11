package Restfulbooker;

import Restfulbooker.api.BookingApi;
import Restfulbooker.model.Booking;
import Restfulbooker.model.BookingDates;

public class CreateBooking {

	
	public static void main(String[] args) {
		
		//1.Build Request- Same as GIVEN
		
		//RequestSpecification requestSpecification = RestAssured.given();
		//RequestSpecification requestSpecification =  RestAssured.given().log().all();
		//RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/").basePath("booking");
		
		
        Booking booking = new Booking(
            "Jim",
            "Brown",
            111,
            true,
            new BookingDates("2018-01-01", "2019-01-01"),
            "Breakfast"
        );

        BookingApi
            .createBooking(booking)
            .log().all()
            .statusCode(200);
			
			
		
		
		//2.Hit Request and get Response
		
		//Response response = requestSpecification.post();
		

		//Validate Response

		//ValidatableResponse validateableResponse = response.then().log().all();
		//validateableResponse.statusCode(200);
		
			
		
		
	}

}
