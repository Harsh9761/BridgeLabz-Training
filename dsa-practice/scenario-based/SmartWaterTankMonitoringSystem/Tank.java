package SmartWaterTankMonitoringSystem;

public class Tank {
	private String tankId;
	private double Capacity;
	private double currentLevel;
	
	public Tank(String tankId,double Capacity, double currentLevel) {
		this.tankId = tankId;
		this.Capacity = Capacity;
		this.currentLevel = currentLevel;
	}
	
	public String getTankId() {
		return tankId;
	}
	
	public double getCapacity() {
		return Capacity;
	}
	
	public double getCurrentLevel() {
		return currentLevel;
	}
}
