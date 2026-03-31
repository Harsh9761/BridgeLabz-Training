import java.util.Scanner;
public class Bmi2D{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		double data[][] = new double[size][3];
		String[] status = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Enter Height (in meters): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter Weight (in kg): ");
            data[i][1] = sc.nextDouble();
            data[i][2] = data[i][1] / (data[i][0] * data[i][0]);
            if (data[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (data[i][2] < 25) {
                status[i] = "Normal";
            } else if (data[i][2] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        System.out.println("BMI Report");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(data[i][0] + "\t");
            System.out.print(data[i][1] + "\t");
            System.out.print(data[i][2] + "\t");
            System.out.println(status[i]);
        }
	}
}