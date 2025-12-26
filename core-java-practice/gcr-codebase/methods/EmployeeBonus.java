import java.util.*;
public class EmployeeBonus {

	public static void main(String[] args) {
		int employees = 10;

        int[][] empData = generateData(employees);
        double[][] bonusData = calculateBonus(empData);

        displayReport(empData, bonusData);

	}
	
	public static int[][] generateData(int employees) {
        int[][] data = new int[employees][2];

        for (int i = 0; i < employees; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }
	
	public static double[][] calculateBonus(int[][] emp) {
	    double[][] result = new double[emp.length][2];
	    for (int i = 0; i < emp.length; i++) {

	        int salary = emp[i][0];
	        int years = emp[i][1];
	        double bonus;

	        if (years > 5) {
	            bonus = salary * 0.05;
	        } else {
	            bonus = salary * 0.02;
	        }

	        result[i][0] = salary + bonus;
	        result[i][1] = bonus;
	    }
	    return result;
	 }
	 public static void displayReport(int[][] empData, double[][] bonusData) {

	     double totalOldSalary = 0;
	     double totalNewSalary = 0;
	     double totalBonus = 0;

	     System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");
	     System.out.println("-----------------------------------------------------");

	     for (int i = 0; i < empData.length; i++) {

	         int oldSalary = empData[i][0];
	         int years = empData[i][1];
	         double bonus = bonusData[i][1];
	         double newSalary = bonusData[i][0];

	         totalOldSalary += oldSalary;
	         totalBonus += bonus;
	         totalNewSalary += newSalary;

	         System.out.println((i + 1) + "\t" +oldSalary + "\t\t" +years + "\t" +bonus + "\t" +newSalary);
	     }

	     System.out.println("-----------------------------------------------------");
	     System.out.println("TOTAL\t" +totalOldSalary + "\t\t" +totalBonus + "\t" +totalNewSalary);
	 }

}
