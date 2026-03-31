import java.util.*;
public class UppercaseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String string = sc.nextLine();
		String ans1 = string.toUpperCase();
		String ans2 = toUpper(string);
		if(ans1.equals(ans2)) {
			System.out.println("Both results are same.");
		}
		else {
			System.out.println("Both results are not same");
		}
	}
	public static String toUpper(String string) {
		String ans = "";
		for(int i = 0;i<string.length();i++) {
			char ch = string.charAt(i);
			if(ch>='a' && ch<='z') {
				ch = (char)(ch-32);
			}
			ans += ch;
		}
		return ans;
	}

}
