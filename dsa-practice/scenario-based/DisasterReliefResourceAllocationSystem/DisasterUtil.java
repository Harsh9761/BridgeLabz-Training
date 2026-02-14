package DisasterReliefResourceAllocationSystem;

import java.util.*;

public class DisasterUtil {
	
	Map<String, ReliefCenter> centers = new HashMap<>();
	Queue<AreaRequest> requests = new LinkedList<>();
	
	public void addCenter(ReliefCenter center) {
        centers.put(center.getCenterId(), center);
    }
	
	
	public void resourceRequest(AreaRequest area) {
		requests.offer(area);
		
	}
	
	public void allocateResources() throws InsufficientResourceException{
		while(!requests.isEmpty()) {
			int flag = 0;
			AreaRequest request = requests.poll();
			
			for(ReliefCenter center : centers.values()) {
				Map<String, Integer> resources = center.getResources();
				
				if(resources.containsKey(request.getResourceType())) {
					int available = resources.get(request.getResourceType());
					
					if(available >= request.getQuantity()) {
						resources.put(request.getResourceType(), available-request.getQuantity());
						
						System.out.println("Allocated " +
                                request.getQuantity() + " " +
                                request.getResourceType() +
                                " to " + request.getAreaName() +
                                " from Center " + center.getCenterId());

                        flag = 1;
                        break;
					}
				}
			}
			if(flag == 0) {
				throw new InsufficientResourceException(
                        "Insufficient " + request.getResourceType() +
                        " for area: " + request.getAreaName());
			}
		}
		
	}
	
	
	public void generateReport() {

        System.out.println("\n---- Allocation Report ----");

        for (ReliefCenter center : centers.values()) {
            System.out.println("Center ID: " + center.getCenterId());
            for (Map.Entry<String, Integer> entry :
                    center.getResources().entrySet()) {

                System.out.println("Resource: " + entry.getKey() +
                        ", Remaining: " + entry.getValue());
            }
        }
    }

}
