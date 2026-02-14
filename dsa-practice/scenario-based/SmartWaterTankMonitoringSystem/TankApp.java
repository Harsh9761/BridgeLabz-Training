package SmartWaterTankMonitoringSystem;

public class TankApp {

	public static void main(String[] args){
		
		try {
			TankUtil tank = new TankUtil();
			
			tank.addTank(new Tank("101",50.0,20.0));
			tank.addTank(new Tank("102",40.0,35.0));
			tank.addTank(new Tank("103",30.0,1.0));
			
			tank.printUsagePercentage("101");
			
			tank.checkTankLevels();
			
			tank.printSortedTanks();
			
		}catch(InvalidWaterLevelException e) {
			System.out.println(e.getMessage());
		}

	}

}
