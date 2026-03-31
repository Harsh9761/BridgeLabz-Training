class HotelBooking{
	String guestName;
	String roomType;
	int nights;
	
	//Default Constructor
	public HotelBooking() {
		this.guestName = "Unknown";
		this.roomType = "Unknown";
		this.nights = 0;
	}
	
	//parameterized Constructor
	public HotelBooking(String guestName,String roomType,int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	//Copy constructor
	public HotelBooking(HotelBooking other) {
		this.guestName = other.guestName;
		this.roomType = other.roomType;
		this.nights = other.nights;
	}
	
	public void display() {
		System.out.println("Booking Details");
		System.out.println("Guest Name: "+guestName);
		System.out.println("RoomType: "+roomType);
		System.out.println("Number of nights: "+nights);
	}
}


public class HotelBookingSystem {

	public static void main(String[] args) {
		HotelBooking booking1 = new HotelBooking();
		booking1.display();
		
		HotelBooking booking2 = new HotelBooking("Ram","Premium",5);
		booking2.display();
		
		HotelBooking booking3 = new HotelBooking(booking2);
		booking3.display();
	}

}
