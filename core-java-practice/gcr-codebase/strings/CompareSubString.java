import java.util.*;
public class CompareSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String string = sc.next();
		System.out.println("Enter start index");
		int startIndex = sc.nextInt();
		System.out.println("Enter end index");
		int endIndex = sc.nextInt();
		String ans1 = string.substring(startIndex,endIndex);
		String ans2 = findSubString(string,startIndex,endIndex);
		if(ans1.equals(ans2)) {
			System.out.println("Both substrings are SAME.");
		}
		else {
			System.out.println("Both substrings are DIFFERENT.");
		}
		
	}
	public static String findSubString(String string,int startIndex,int endIndex) {
		String ans  = "";
		for(int i = startIndex;i<endIndex;i++) {
			ans += string.charAt(i);
		}
		return ans;
	}
	
}
