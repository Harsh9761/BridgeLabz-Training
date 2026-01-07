import java.util.*;
interface FareCalculator{
	public double calculateFare(double distance);
}

//User class 
class User{
	private int userId;
	private String userName;
	public User(int userId,String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public int getuserId() {
		return userId;
	}
	
	public String getuserName() {
		return userName;
	}
}

//Driver class
class Driver{
	private int driverId;
	private String driverName;
	private boolean available;
	public Driver(int driverId,String driverName) {
		this.driverId = driverId;
		this.driverName = driverName;
		this.available = true;;
	}
	
	public String getName() {
		return driverName;
	}
	
	public void assignRide() {
		available = false;
	}
	
	public void completeRide() {
		available = true;
	}
	public boolean isAvailable() {
		return available;
	}
}

//Ride class
class Ride{
	private User user;
	private Driver driver;
	private double distance;
	private double fare;
	public Ride(User user,Driver driver,double distance,double fare) {
		this.user = user;
		this.driver = driver;
		this.distance = distance;
		this.fare = fare;
	}
	
	public void displayDetails(){
		System.out.println("Ride Details: ");
		System.out.println("User Name: "+user.getuserName());
		System.out.println("Driver Name: "+driver.getName());
		System.out.println("Distance: "+distance);
		System.out.println("Fare: "+fare);
		
	}
}

class PeakFare implements FareCalculator{
	public double calculateFare(double distance) {
		return distance*20;
	}
}

class NormalFare implements FareCalculator{
	public double calculateFare(double distance) {
		return distance*100;
	}
}

class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}

class RideBooking{
	private ArrayList<Ride> rideHistory = new ArrayList<>();
	private ArrayList<Driver> drivers = new ArrayList<>();
	
	public RideBooking(ArrayList<Driver> drivers) {
		this.drivers = drivers;
	}
	
	public Ride bookRide(User user,double distance,FareCalculator calculator) throws NoDriverAvailableException {
		Driver availableDriver = null;
		for(Driver d: drivers) {
			if (d.isAvailable()) {
                availableDriver = d;
                break;
            }
		}
		if(availableDriver == null) {
			throw new NoDriverAvailableException("No drivers available at the moment!");
		}
		
		availableDriver.assignRide();
		double fare = calculator.calculateFare(distance);
		Ride ride = new Ride(user,availableDriver,distance,fare);
		rideHistory.add(ride);
		
		return ride;
	}
	
	public void displayRideHistory() {
        for (Ride ride : rideHistory) {
            ride.displayDetails();
        }
    }
}


public class RideManagementSystem {

	public static void main(String[] args) {
		
		User user = new User(101,"Harshdeep Singh");
		
		ArrayList<Driver> drivers = new ArrayList<>();
		drivers.add(new Driver(555, "Ankit"));
        drivers.add(new Driver(556, "Krishna"));
        
        RideBooking booking = new RideBooking(drivers);
        
        FareCalculator calculator;
        try {
        	calculator = new PeakFare();
        	Ride ride = booking.bookRide(user, 15, calculator);
        	ride.displayDetails();
        	
        	Ride ride2 = booking.bookRide(user, 10, calculator);
        	ride2.displayDetails();
        	
        	Ride ride3 = booking.bookRide(user, 10, calculator);
        	ride3.displayDetails(); //Driver not available
        	
        	System.out.println("Ride History");
        	booking.displayRideHistory();
        }catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }

	}

}
