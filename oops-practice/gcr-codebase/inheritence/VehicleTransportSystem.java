class Vehicle{
	double speed;
	String fuelType;
	public Vehicle(double speed,String fuelType) {
		this.speed = speed;
		this.fuelType = fuelType;
	}
	
	public void displayDetails(){
		System.out.println("Vehicle Details: ");
		System.out.println("Speed is: "+speed);
		System.out.println("fuelType is: "+fuelType);
		
	}
}
class Car extends Vehicle{
	int seatCapacity;
	public Car(double speed,String fuelType,int seatCapacity) {
		super(speed,fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("SeatCapacity is: "+seatCapacity);
	}
	
}

class Truck extends Vehicle{
	double loadCapacity;
	public Truck(double speed,String fuelType,double loadCapacity) {
		super(speed,fuelType);
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("loadCapacity is: "+loadCapacity);
	}
	
}

class Bike extends Vehicle{
	int cubicCapacity;
	public Bike(double speed,String fuelType,int cubicCapacity) {
		super(speed,fuelType);
		this.cubicCapacity = cubicCapacity;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("cubicCapacity is: "+cubicCapacity);
	}
	
}

public class VehicleTransportSystem {

	public static void main(String[] args) {
		Vehicle car = new Car(180, "Petrol", 5);
		Vehicle truck = new Truck(120, "Diesel", 10.5);
		Vehicle bike = new Bike(160, "Petrol", 125);
		
		car.displayDetails();
		truck.displayDetails();
		bike.displayDetails();

	}

}
