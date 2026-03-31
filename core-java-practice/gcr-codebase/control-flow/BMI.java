import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.print("Enter weight (in kg): ");
        Scanner sc = new Scanner(System.in);
        double weig = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();
        double heightMeter = heightCm / 100;
        double bmi = weig / (heightMeter * heightMeter);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}
