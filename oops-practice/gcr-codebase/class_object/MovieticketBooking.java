import java.util.*;

class MovieTicket{
	String movieName;
	int seatNumber;
	double price;
	boolean isBooked;
	
	public MovieTicket() {
		isBooked = false;
	}
	
	public void bookTicket(String movieName,int seatNumber,double price) {
		if(!isBooked) {
			this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            isBooked = true;
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
		} else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
	}
	
	public void displayTicket() {
        if (!isBooked) {
            System.out.println("Ticket have not booked yet....");
        } else {
            System.out.println("\nPrice: $" + price);
        }
    }
}

public class MovieticketBooking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Movie Booking System..");
		System.out.println("Enter Movie name: ");
		String movieName = sc.nextLine();
		System.out.println("Enter SeatNumber: ");
		int seat = sc.nextInt();
		System.out.println("Enter Price: ");
		double price = sc.nextDouble();
		
		
		
		MovieTicket ticket = new MovieTicket();
		ticket.displayTicket();
		ticket.bookTicket(movieName, seat, price);
		
//		ticket.bookTicket(movieName, seat, price);
		ticket.displayTicket();
	}

}
