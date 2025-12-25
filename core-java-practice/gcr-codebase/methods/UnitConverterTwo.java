import java.util.*;
public class UnitConverterTwo {
	public static double YardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
	public static double FeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
	public static double MetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
	public static double InchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
	public static double InchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}
class UnitConvertDemo{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Yards: ");
		double yards = sc.nextDouble();
        System.out.println("Feet: " + UnitConverterTwo.YardsToFeet(yards));
        
        System.out.println("Enter feets: ");
        double feets = sc.nextDouble();
        System.out.println("Yard: "+UnitConverterTwo.FeetToYards(feets));
        
        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Inches: " + UnitConverterTwo.MetersToInches(meters));

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        System.out.println("Meters: " + UnitConverterTwo.InchesToMeters(inches));
        System.out.println("Centimeters: " + UnitConverterTwo.InchesToCentimeters(inches));
	}
}
