import java.util.*;
public class FactorialUsingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to calculate Factorial: ");
		int num = sc.nextInt();
		System.out.println(findFactorial(num));
	}
	public static int findFactorial(int num) {
		if(num==0) {
			return 1;
		}
		return num * findFactorial(num-1);
	}

}
