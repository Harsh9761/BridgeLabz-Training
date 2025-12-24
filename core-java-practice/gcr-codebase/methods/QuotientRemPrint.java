import java.util.*;
public class QuotientRemPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = sc.nextInt();
		System.out.println("Enter Divisor: ");
		int divisor = sc.nextInt();
		int ans[] = findQuotientRemainder(number,divisor);
		System.out.println("Quotient is: "+ans[0]);
		System.out.println("Remainder is: "+ans[1]);
		
	}
	public static int[] findQuotientRemainder(int number,int divisor) {
		int quotient = number / divisor;
		int remainder = number%divisor;
		return new int[] {quotient,remainder};
	}

}
