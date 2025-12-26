import java.util.*;
public class ToggleCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		String ans = "";
		for(int i = 0;i < input.length();i++) {
			char ch = input.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				ans += (char)(ch-32);
			} else if(ch >= 'A' && ch<='Z') {
				ans += (char)(ch+32);
			} else {
				ans += ch;
			}
		}
		System.out.println("Toggled String is: "+ans);
	}

}
