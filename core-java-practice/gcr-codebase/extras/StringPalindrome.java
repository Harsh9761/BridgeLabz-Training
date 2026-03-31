import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.next();
		int f = 0;
		int l = 0;
		int r = input.length()-1;
		while(l < r) {
			if(input.charAt(l)!=input.charAt(r)) {
				f = 1;
				System.out.println("Not Palindrome");
				break;
			}
			l++;
			r--;
		}
		if(f != 1) {
			System.out.println("Palindrome");
		}
	}

}
