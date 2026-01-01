class Vehicle{
	static double registerationFee = 5000.0;
	
	String ownerName;
	String vehicleType;
	final int registerationNumber;
	
	public Vehicle(String ownerName,String vehicleType,int registerationNumber) {
		 this.ownerName = ownerName;
		 this.vehicleType = vehicleType;
		 this.registerationNumber = registerationNumber;
	}
	
	public void DisplayDetails() {
		 if(this instanceof Vehicle) {
			 System.out.println("Vehicle Details: ");
			 System.out.println("Owner Name: "+ownerName);
			 System.out.println("Vehicle Type: "+vehicleType);
			 System.out.println("Registration Number: " + registerationNumber);
			 System.out.println("Registration Fee: " + registerationFee);
			 System.out.println();
		 }else {
			 System.out.println("Invalid Instance!!");
		 }
	 }
	public static void updateRegistrationFee(double newFee) {
        registerationFee = newFee;
    }
	 
	
}
public class VehicleRegisteration {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Harshdeep Singh", "Car",111555);
        Vehicle vehicle2 = new Vehicle("Amit Kumar", "Bike",555566);

        vehicle1.DisplayDetails();
        vehicle2.DisplayDetails();

        
        Vehicle.updateRegistrationFee(6500.0);

        vehicle1.DisplayDetails();
        vehicle2.DisplayDetails();

	}

}
