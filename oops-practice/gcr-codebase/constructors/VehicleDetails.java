class Vehicle{
	 String ownerName;
	 String vehicleType;
	 
	 static double registerationFee = 5000.0;
	 
	 public Vehicle(String ownerName,String vehicleType) {
		 this.ownerName = ownerName;
		 this.vehicleType = vehicleType;
	 }
	 
	 public void DisplayDetails() {
		 System.out.println("Vehicle Details: ");
		 System.out.println("Owner Name: "+ownerName);
		 System.out.println("Vehicle Type: "+vehicleType);
		 System.out.println("Registration Fee: " + registerationFee);
		 System.out.println();
	 }
	 
	 public static void updateRegistrationFee(double newFee) {
	        registerationFee = newFee;
	    }
	 
}
public class VehicleDetails {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Harshdeep Singh", "Car");
        Vehicle vehicle2 = new Vehicle("Amit Kumar", "Bike");

        vehicle1.DisplayDetails();
        vehicle2.DisplayDetails();

        
        Vehicle.updateRegistrationFee(6500.0);

        vehicle1.DisplayDetails();
        vehicle2.DisplayDetails();

	}

}
