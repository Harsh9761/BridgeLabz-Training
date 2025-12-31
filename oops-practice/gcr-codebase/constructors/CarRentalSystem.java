class CarRental{
	String customerName;
	String carModel;
	int rentalDays;
	double costPerDay;
	
	public CarRental(String customerName,String carModel,int rentalDays) {
		this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = 1000.0;
	}
	public double calculateCost() {
		return costPerDay * rentalDays;
	}
	
	public void display() {
		System.out.println("Booking Details: ");
		System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
        System.out.println();
	}
}
public class CarRentalSystem {

	public static void main(String[] args) {
		CarRental rental2 = new CarRental("Harshdeep Singh", "Toyota Fortuner", 5);
        rental2.display();

	}

}
