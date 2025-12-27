import java.util.*;
public class DistanceTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalDistance = 0;
		String choice = "no";
		int stopNumber = 1;
		while(!choice.equalsIgnoreCase("yes")) {
			System.out.println("Stop " + stopNumber);
			System.out.println("Enter Distance: ");
			int distance = sc.nextInt();
			totalDistance += distance;
			System.out.println("Total distance covered: " + totalDistance + " km");	
			
			System.out.println("Do you want to get Off from the Bus. (Enter no to travel more): ");
			choice = sc.next();
			
			stopNumber++;
		}
		System.out.println("Total Distance Travelled: "+totalDistance);
	}

}
