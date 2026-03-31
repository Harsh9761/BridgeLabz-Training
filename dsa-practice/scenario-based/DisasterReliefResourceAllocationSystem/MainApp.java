package DisasterReliefResourceAllocationSystem;

public class MainApp {

	public static void main(String[] args) {
		try {
            DisasterUtil system = new DisasterUtil();

            ReliefCenter c1 = new ReliefCenter("RC101");
            c1.addResource("Food", 100);
            c1.addResource("Water", 200);

            ReliefCenter c2 = new ReliefCenter("RC102");
            c2.addResource("Medical", 50);

            system.addCenter(c1);
            system.addCenter(c2);

            system.resourceRequest(new AreaRequest("Area1", "Food", 30));
            system.resourceRequest(new AreaRequest("Area2", "Water", 50));
            system.resourceRequest(new AreaRequest("Area3", "Medical", 60));

            system.allocateResources();

            system.generateReport();

        } catch (InsufficientResourceException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
