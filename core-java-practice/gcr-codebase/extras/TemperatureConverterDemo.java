import java.util.*;
public class TemperatureConverterDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter Temperature in Celcius: ");
			double celcius = sc.nextDouble();
			double fahrenheit = celciusToFahrenheit(celcius);
			System.out.println("Temperature in Fahrenheit: "+ fahrenheit);
		}else if(choice == 2) {
			System.out.println("Enter Temperature in Fahrenheit: ");
			double fahrenheit = sc.nextDouble();
			double celcius = fahrenheitToCelcius(fahrenheit);
			System.out.println("Temperature in Celcius: "+ celcius);
		}else {
			System.out.println("Invalid Choice...");
		}
		
	}
	public static double celciusToFahrenheit(double celcius) {
		return (celcius * 9 / 5) + 32;
	}
	
	public static double fahrenheitToCelcius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

}
