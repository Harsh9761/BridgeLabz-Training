import java.util.*;
public class StringTrim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =  sc.nextLine();
		int startIndex = 0;
		int endIndex = input.length()-1;
		while(startIndex <= endIndex && input.charAt(startIndex)==' ') {
			startIndex++;
		}
		while(startIndex <= endIndex && input.charAt(endIndex)==' ') {
			endIndex--;
		}
		String ans = "";
		for(int i = startIndex;i <= endIndex;i++) {
			ans += input.charAt(i);
		}
		System.out.println("Trimmed String: "+ ans);
	}

}
