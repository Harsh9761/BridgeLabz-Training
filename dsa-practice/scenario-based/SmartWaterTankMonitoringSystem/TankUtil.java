package SmartWaterTankMonitoringSystem;

import java.util.*;

public class TankUtil {
	
	List<Tank> tanks = new ArrayList<>();
	
	public void addTank(Tank tank) throws InvalidWaterLevelException{
		if(tank.getCurrentLevel()>tank.getCapacity()) {
			throw new InvalidWaterLevelException("Water Amount exceeded capacity!!");
		}
		tanks.add(tank);
	}
	
	public void printUsagePercentage(String tankId) {
		for(Tank tank : tanks) {
			if(tank.getTankId().equalsIgnoreCase(tankId)) {
				double usage = tank.getCapacity()-tank.getCurrentLevel();
				double percent = (usage*100)/tank.getCapacity();
				System.out.println("Usage percentage is: "+percent);
			}
		}
	}
	
	public void checkTankLevels() {
		for(Tank tank : tanks) {
			double threshold = 0.2*tank.getCapacity();
			if(tank.getCurrentLevel()<threshold) {
				System.out.println("Alert: Tank "+tank.getTankId()+" level is below 20%");
			}
		}
	}
	
	public void printSortedTanks() {
		tanks.stream().sorted(Comparator.comparing(Tank::getCurrentLevel)).forEach(t -> System.out.println(
				"Tank: "+t.getTankId()+" currentLevel "+t.getCurrentLevel()));
	}
}
