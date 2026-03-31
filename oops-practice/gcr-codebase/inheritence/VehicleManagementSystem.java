class VehicleDemo{
	double maxSpeed;
	String model;
	public VehicleDemo(double maxSpeed,String model){
		this.maxSpeed = maxSpeed;
		this.model = model;
	}
	
	public void displayDetails() {
		System.out.println();
		System.out.println("Vehicle Details ");
		System.out.println("Max Speed is: "+maxSpeed);
		System.out.println("Model is: "+model);
	}
	
}

interface Refuelable{
	public void refuel();
}

class PetrolVehicle extends VehicleDemo implements Refuelable{
	public PetrolVehicle(double maxSpeed,String model) {
		super(maxSpeed,model);
		
	}
	
	public void refuel() {
		System.out.println("Refueling the petrol vehicle.");
	}
}

class ElectricVehicle extends VehicleDemo{
	public ElectricVehicle(double maxSpeed,String model) {
		super(maxSpeed,model);
	}
	
	public void charge() {
		System.out.println("Charging the electric vehicle.");
	}
}

public class VehicleManagementSystem {

	public static void main(String[] args) {
		PetrolVehicle vehicle1 = new PetrolVehicle(500,"Glamour");
		ElectricVehicle vehicle2 = new ElectricVehicle(450,"Activa");
		
		vehicle1.displayDetails();
		vehicle1.refuel();
		
		vehicle2.displayDetails();
		vehicle2.charge();

	}

}
