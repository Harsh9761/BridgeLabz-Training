import java.util.*;
public class MultiplyStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings: ");
		String number1 = sc.next();
		String number2 = sc.next();
		int convertNumber1 = Integer.parseInt(number1);
		int convertNumber2 = Integer.parseInt(number2);
		int ans = convertNumber1*convertNumber2;
		System.out.println("Product is: "+ans);
	}

}
