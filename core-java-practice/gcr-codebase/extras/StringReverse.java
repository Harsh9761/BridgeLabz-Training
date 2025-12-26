import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.next();
		String ans = "";
		for(int i = input.length()-1;i >= 0;i--) {
			ans += input.charAt(i);
		}
		System.out.println("Reversed String is: "+ans);
	}

}
