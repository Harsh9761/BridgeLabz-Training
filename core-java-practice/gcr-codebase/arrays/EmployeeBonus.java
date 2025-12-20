import java.util.*;
public class EmployeeBonus{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        for (int i = 0; i < 10; i++) {
        	System.out.print("Enter Salary: ");
        	salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = sc.nextDouble();
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            }
            else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\n------ Zara Salary & Bonus Report ------");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Years of Service: " + yearsOfService[i]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
            System.out.println("-----------------------------------");
        }

        System.out.println("Total Old Salary of All Employees: " + totalOldSalary);
        System.out.println("Total Bonus Payout by Zara: " + totalBonus);
        System.out.println("Total New Salary of All Employees: " + totalNewSalary);
	}
}