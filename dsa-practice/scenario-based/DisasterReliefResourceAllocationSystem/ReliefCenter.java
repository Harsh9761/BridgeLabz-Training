package DisasterReliefResourceAllocationSystem;


import java.util.HashMap;
import java.util.Map;

public class ReliefCenter {
	private String centerId;
	private Map<String, Integer> resources = new HashMap<>();
	
	public ReliefCenter(String centerId) {
		this.centerId = centerId;
	}
	
	public void addResource(String item, int quantity) {
        resources.put(item, resources.getOrDefault(item, 0) + quantity);
    }
	
	public String getCenterId() {
		return centerId;
	}
	
	public Map<String, Integer> getResources() {
        return resources;
    }
}
