import java.util.*;
public class BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Person");
		int num = sc.nextInt();
		String report[][] = new String[num][2];
		for(int i = 0;i < num;i++) {
			System.out.println("Enter person "+(i + 1)+" Height in cm: ");
			double height = sc.nextDouble()/100.0;
			System.out.println("Enter person "+(i + 1)+" Weight in kgs: ");
			double weight = sc.nextDouble();
			double bmi = (weight)/(height*height);
			bmi = Math.round(bmi*100.0)/100.0;
			report[i][0] = String.valueOf(bmi);
			if (bmi < 18.5) {
                report[i][1] = "Underweight";
            } else if (bmi < 25) {
            	report[i][1] = "Normal";
            } else if (bmi < 30) {
            	report[i][1] = "Overweight";
            } else {
            	report[i][1] = "Obese";
            }
		}
		System.out.println("BMI report of "+num+" Persons");
		for(int i = 0 ; i < num ; i++) {
			System.out.println((i + 1)+"\t"+report[i][0]+"\t"+report[i][1]);
		}
	}

}
