import java.util.*;

class Flight{
	int flightId;
	String source;
	String destination;
	int availableSeats;
	double price;
	
	public Flight(int flightId,String source,String destination,int availableSeats,double price) {
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
		this.availableSeats = availableSeats;
		this.price = price;
	}
	
	public void displayFlightDetails() {
		System.out.println("Flight details: ");
		System.out.println("Flight Id: "+flightId);
		System.out.println("Flight source: "+source);
		System.out.println("Flight destination: "+destination);
		System.out.println("Flight price: "+price);
		System.out.println("Flight availableSeats: "+availableSeats);
		System.out.println();
	}
}

class Bookings{
	String customerName;
	Flight flight;
	public Bookings(String customerName,Flight flight) {
		this.customerName = customerName;
		this.flight = flight;
	}
	
	public void displayBooking() {
		System.out.println("Customer Name : "+customerName);
		flight.displayFlightDetails();
	}
}

class FlightOperations{
	private Flight flights[] = new Flight[3];
	
	private ArrayList<Bookings> bookings = new ArrayList<>();
	
	public FlightOperations() {
        flights[0] = new Flight(101, "Delhi", "Mumbai", 5, 4500);
        flights[1] = new Flight(102, "Chennai", "Bangalore", 3, 3000);
        flights[2] = new Flight(103, "Delhi", "Goa", 4, 5500);
    }
	
	//create
	public void bookFlight(int flightId,String customerName) {
		
		for(int i = 0;i<3;i++) {
			if(flights[i].flightId == flightId && flights[i].availableSeats>0) {
				flights[i].availableSeats--;
				bookings.add(new Bookings(customerName,flights[i]));
				System.out.println("Flight booked successfully");
				return;
			}
		}
		System.out.println("Flight not available or invalid ID.");
	}
	
	//search
	public void searchFlight(String source,String destination) {
		boolean found = false;
		for(Flight f: flights) {
			if(f.source.equalsIgnoreCase(source) && f.destination.equalsIgnoreCase(destination)) {
				f.displayFlightDetails();
				found = true;
			}
		}
		if(!found) {
			System.out.println("Flight not available");
		}
	}
	
	//display
    public void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }
        for (Bookings b : bookings) {
            b.displayBooking();
            System.out.println();
        }
    }
    
    //delete
    public void cancelBooking(String customerName) {
    	for(int i = 0;i<bookings.size();i++) {
			if(bookings.get(i).customerName.equalsIgnoreCase(customerName)) {
				bookings.get(i).flight.availableSeats++;
				bookings.remove(i);
				System.out.println("Booking cancelled successfully");
				return;
			}
		}
    	System.out.println("Booking not found for customer: " + customerName);
    }
	
}

public class FlightBookingSystem {

	public static void main(String[] args) {
		
		FlightOperations operations = new FlightOperations();

        System.out.println("Search Flights:");
        operations.searchFlight("delhi", "goa");

        System.out.println("\nBooking Flight:");
        operations.bookFlight(103, "Harshdeep");

        System.out.println("\nBooking Details:");
        operations.displayBookings();

        System.out.println("\nCancelling Booking:");
        operations.cancelBooking("Harshdeep");

        System.out.println("\nBooking Details After Cancellation:");
        operations.displayBookings();

	}

}
