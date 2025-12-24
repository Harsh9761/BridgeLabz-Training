import java.util.*;
public class ParkRounds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side 1: ");
		double side1 = sc.nextDouble();
		System.out.print("Enter side 2: ");
		double side2 = sc.nextDouble();
		System.out.print("Enter side 3: ");
		double side3 = sc.nextDouble();
		double ans = findRounds(side1,side2,side3);
		System.out.println("Number of Rounds: "+ans);

	}
	public static double findRounds(double side1,double side2,double side3) {
		double perimeter = side1+side2+side3;
		double totalDistance = 5000;
		return totalDistance/perimeter;
	}

}
