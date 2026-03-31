interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
abstract class VehicleTwo {
    private int vehicleId;
    private String driverName;
    protected double ratePerKm;

    public VehicleTwo(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
}
class CarTwo extends VehicleTwo implements GPS {

    private String location = "Unknown";

    public CarTwo(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 50;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}
class BikeTwo extends VehicleTwo implements GPS {

    private String location = "Unknown";

    public BikeTwo(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}
class Auto extends VehicleTwo implements GPS {

    private String location = "Unknown";

    public Auto(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 20;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

public class Ride_hailing {

	public static void main(String[] args) {
		
		
		VehicleTwo v1 = new CarTwo(1, "Harshdeep", 15);
        VehicleTwo v2 = new BikeTwo(2, "Singh", 8);
        VehicleTwo v3 = new Auto(3, "Aman", 10);

        VehicleTwo[] rides = { v1, v2, v3 };

        double distance = 10;

        for (VehicleTwo v : rides) {
            v.getVehicleDetails();
            System.out.println("Distance: " + distance + " km");
            System.out.println("Total Fare: ₹" + v.calculateFare(distance));

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                gps.updateLocation("Sector 62, Noida");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }

            System.out.println("-----------------------------");
        }

	}

}
