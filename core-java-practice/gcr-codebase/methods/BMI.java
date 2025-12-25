import java.util.*;
public class BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }
        String[] bmiStatus = calculateBMIAndStatus(persons);
        for (int i = 0; i < 10; i++) {
            double bmiRounded = Math.round(persons[i][2] * 100.0) / 100.0;
            System.out.println((i + 1) + "\t" +persons[i][0] + "\t" +persons[i][1] + "\t" +bmiRounded + "\t" +bmiStatus[i]);
        }
	}
	public static String[] calculateBMIAndStatus(double[][] data) {
        String[] record = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;

            if (bmi < 18.5) {
                record[i] = "Underweight";
            } else if (bmi < 25) {
                record[i] = "Normal";
            } else if (bmi < 30) {
                record[i] = "Overweight";
            } else {
                record[i] = "Obese";
            }
        }

        return record;
    }

}
