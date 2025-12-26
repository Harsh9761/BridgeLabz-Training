import java.util.*;

class UnitConverterTest {

	public static double convertKmToMiles(double km){
		double km2miles = 0.621371;
		return km*km2miles;
	}
	public static double convertMilesToKm(double miles){
		double miles2km = 1.60934;
		return miles*miles2km;
	}
	public static double convertMeterToFeet(double meter){
		double meterToFeet =  3.2808;
		return meter*meterToFeet;
	}
	public static double convertFeetToMeter(double feet){
		double feetToMeter =  0.3048;
		return feet*feetToMeter;
	}

}

public class UnitConverter{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Miles: " + UnitConverterTest.convertKmToMiles(km));

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println("Kilometers: " + UnitConverterTest.convertMilesToKm(miles));

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Feet: " + UnitConverterTest.convertMeterToFeet(meters));

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println("Meters: " + UnitConverterTest.convertFeetToMeter(feet));
	}
}
