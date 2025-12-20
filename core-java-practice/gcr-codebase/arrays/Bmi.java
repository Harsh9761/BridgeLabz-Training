import java.util.Scanner;
public class Bmi{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		double[] height = new double[size];
	    double[] weight = new double[size];
	    double[] bmi = new double[size];
	    String[] status = new String[size];
		
	    for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Enter Height (in meters): ");
            height[i] = sc.nextDouble();
            System.out.print("Enter Weight (in kg): ");
            weight[i] = sc.nextDouble();
        }
        for (int i = 0; i < size; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        System.out.println(" BMI Report ");
        for (int i = 0; i < size; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.printf("BMI: %.2f%n", bmi[i]);
            System.out.println("Status: " + status[i]);
            System.out.println("-------------------------");
        }
		
	}
}
	