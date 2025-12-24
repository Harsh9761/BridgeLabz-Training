import java.util.*;
public class ChocolateDistribution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Chocolates: ");
		int chocolates = sc.nextInt();
		System.out.println("Enter Children: ");
		int children = sc.nextInt();
		int ans[] = findQuotientRemainder(chocolates,children);
		System.out.println("Chocolate to each child is: "+ans[0]);
		System.out.println("Remaining Chocolates is: "+ans[1]);
		
	}
	public static int[] findQuotientRemainder(int number,int divisor) {
		int quotient = number / divisor;
		int remainder = number%divisor;
		return new int[] {quotient,remainder};
	}

}
