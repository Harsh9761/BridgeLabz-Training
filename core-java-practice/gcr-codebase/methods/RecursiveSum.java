import java.util.*;
public class RecursiveSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int sum1 = (num*(num+1))/2;
		int sum2 = recurSum(num);
		System.out.println("Sum is "+sum2);
		if(sum1 == sum2) {
			System.out.println("Both Results are Equal");
		}
		else {
			System.out.println("Both Results are not Equal");
		}
		
	}
	public static int recurSum(int num) {
		if(num == 1) {
			return 1;
		}
		return num+recurSum(num-1);
	}

}
