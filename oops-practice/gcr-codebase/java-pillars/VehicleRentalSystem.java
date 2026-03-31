import java.util.*;
interface Insurable{
	public double calculateInsurance();
	public String getInsuranceDetails();
}

abstract class Vehicle{
	private int vehicleNumber;
	private String type;
	protected double rentalRate;
	private String insurancePolicyNumber;
	public Vehicle(int vehicleNumber,String type,double rentalRate,String insurancePolicyNumber) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
		this.insurancePolicyNumber = insurancePolicyNumber;
	}
	
	public abstract double calculateRentalCost(int days);
	
	public void displayDetails(int days) {
		System.out.println("Vehicle Details: ");
		System.out.println("Vehicle number: "+vehicleNumber);
		System.out.println("Vehicle type: "+type);
		System.out.println("Vehicle rental cost: "+calculateRentalCost(days));
	}
	
	protected String getMaskedPolicyNumber() {
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
	
}

class Car extends Vehicle implements Insurable{
	public Car(int vehicleNumber,double rentalRate,String insurancePolicyNumber) {
		super(vehicleNumber,"Car",rentalRate,insurancePolicyNumber);
	}
	
	@Override
	public double calculateRentalCost(int days) {
		return days*rentalRate;
	}
	
	@Override
	public double calculateInsurance() {
		return 500;
	}
	
	@Override
	public String getInsuranceDetails() {
		return "Car Insurance (Flat 500)";
	}
	
}

class Bike extends Vehicle implements Insurable{
	public Bike(int vehicleNumber,double rentalRate,String insurancePolicyNumber) {
		super(vehicleNumber,"Bike",rentalRate,insurancePolicyNumber);
	}
	
	@Override
	public double calculateRentalCost(int days) {
		return days*rentalRate;
	}
	
	@Override
	public double calculateInsurance() {
		return 200;
	}
	
	@Override
	public String getInsuranceDetails() {
		return "Bike Insurance (Flat 200)";
	}
	
}

class Truck extends Vehicle implements Insurable{
	public Truck(int vehicleNumber,double rentalRate,String insurancePolicyNumber) {
		super(vehicleNumber,"Truck",rentalRate,insurancePolicyNumber);
	}
	
	@Override
	public double calculateRentalCost(int days) {
		return days*rentalRate;
	}
	
	@Override
	public double calculateInsurance() {
		return 2000;
	}
	
	@Override
	public String getInsuranceDetails() {
		return "Truck Insurance (Flat 2000)";
	}
	
}

public class VehicleRentalSystem {

	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Car(1234, 2000, "CAR987654"));
        vehicles.add(new Bike(5678, 500, "BIKE123456"));
        vehicles.add(new Truck(9999, 4000, "TRUCK456789"));
        
        int days = 3;

        for (Vehicle v : vehicles) {
            v.displayDetails(days);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance Cost : " + ins.calculateInsurance());
                System.out.println("Insurance Info : " + ins.getInsuranceDetails());
            }

            System.out.println("-----------------------------");
        }
		
		

	}

}
