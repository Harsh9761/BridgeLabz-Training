import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.next();
		if(Check(input)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}

	}
	public static boolean Check(String input) {
		int startIndex = 0;
		int endIndex = input.length()-1;
		while(startIndex < endIndex) {
			if(input.charAt(startIndex)!=input.charAt(endIndex)) {
				return false;
			}
			startIndex++;
			endIndex--;
		}
		return true;
	}

}
