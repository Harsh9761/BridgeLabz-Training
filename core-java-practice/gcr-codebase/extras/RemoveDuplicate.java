import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.next();
		String ans = "";
		for(int i = 0;i < input.length();i++) {
			char ch = input.charAt(i);
			if(ans.indexOf(ch) == -1) {
				ans += ch;
			}
		}
		System.out.println("Removed duplicates String: "+ans);
	}

}
