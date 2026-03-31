import java.util.*;
public class FibonnacciPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Fibonacci number to be Printed: ");
		int num = sc.nextInt();
		printFibonacci(num);

	}
	public static void printFibonacci(int num) {
		int a = 0;
		int b = 1;
		for(int i = 0;i<num;i++) {
			System.out.println(a+" ");
			int c = a+b;
			a = b;
			b = c;
		}
	}

}
