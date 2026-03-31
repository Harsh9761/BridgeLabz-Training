import java.util.*;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number 1");
			int num1 = sc.nextInt();
			
			System.out.println("Enter number 2");
			int num2 = sc.nextInt();
			
			int ans = num1/num2;
			System.out.println("Answer is: "+ans);
		}catch(ArithmeticException e) {
			System.out.println("Can not divide by zero.");
		}catch(InputMismatchException e) {
			System.out.println("Please enter valid numeric values");
		}

	}

}
