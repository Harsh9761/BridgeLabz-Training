import java.util.*;
public class distYardMiles{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		double dInYard = d/3;
		double dInMile = d/5280;
		System.out.println("Distance in yard "+dInYard);
		System.out.print("Distance in miles "+dInMile);
	}
}