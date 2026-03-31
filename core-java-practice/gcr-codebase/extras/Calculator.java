import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		
		int choice = sc.nextInt();
		
		System.out.println("Enter number 1");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter number 2");
		double num2 = sc.nextDouble();
		
		switch(choice) {
			case 1:
				System.out.println("Result is: "+add(num1,num2));
				break;
			case 2:
				System.out.println("Result is: "+subtract(num1,num2));
				break;
			case 3:
				System.out.println("Result is: "+multiply(num1,num2));
				break;
			case 4:
				if(num2!=0)
					System.out.println("Result is: "+divide(num1,num2));
				else
					System.out.println("Enter valid number 2");
				break;
			default:
				System.out.println("Invalid Choice");
		}
	}
	public static double add(double num1,double num2) {
		return num1+num2;
	}
	
	public static double subtract(double num1,double num2) {
		return num1-num2;
	}
	
	public static double multiply(double num1,double num2) {
		return num1*num2;
	}
	
	public static double divide(double num1,double num2) {
		return num1/num2;
	}

}
