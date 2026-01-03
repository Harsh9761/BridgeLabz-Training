class Device{
	int DeviceId;
	boolean status;
	public Device(int DeviceId,boolean status) {
		this.DeviceId = DeviceId;
		this.status = status;
		
	}
	
	public void displayDetails() {
		System.out.println();
		System.out.println("Device Details: ");
		System.out.println("DeviceId is: "+DeviceId);
		System.out.println("status is: "+(status ? "ON" : "OFF"));
	}
}

class Thermostat extends Device{
	int temperatureSetting;
	public Thermostat(int DeviceId,boolean status,int temperatureSetting) {
		super(DeviceId,status);
		this.temperatureSetting = temperatureSetting;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Temperature Setting: " + temperatureSetting);
	}
}

public class SmartHomeDevices {

	public static void main(String[] args) {
		
		Thermostat thermostat = new Thermostat(101, true, 24);
        thermostat.displayDetails();

	}

}
