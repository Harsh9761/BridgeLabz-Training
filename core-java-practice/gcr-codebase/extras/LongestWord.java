import java.util.*;
public class LongestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		String ans = findLongest(input);
		System.out.println("Longest Word is: "+ans);

	}
	public static String findLongest(String input) {
		String ans = "";
		String words[] = input.split(" ");
		for(int i = 0;i < words.length;i++) {
			if(words[i].length()>ans.length()) {
				ans = words[i];
			}
		}
		return ans;
	}

}
