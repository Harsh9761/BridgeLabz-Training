import java.util.*;
public class FindWindTempSpeed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter WindSpeed: ");
		double windSpeed = sc.nextDouble();
		System.out.println("Enter Temperature");
		double temp = sc.nextDouble();
		System.out.println("Wind Chill is: "+windChill(windSpeed,temp));
	}
	public static double windChill(double windSpeed,double temp) {
		 double windChill = 35.74+ (0.6215 * temp) + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
	     return windChill;
	}

}
