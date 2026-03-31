import java.util.*;
public class NaturalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int ans = Sum(num);
		System.out.println("Natural Sum using loop is: "+ans);

	}
	public static int Sum(int num) {
		int sum = 0;
		for(int i = 1;i<=num;i++) {
			sum += i;
		}
		return sum;
	}

}
