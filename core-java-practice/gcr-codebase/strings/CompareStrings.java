import java.util.*;
public class CompareStrings{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String string1 = sc.next();
		System.out.println("Enter String 2");
		String string2 = sc.next();
		boolean ans1 = string1.equals(string2);
		boolean ans2 = charCheck(string1,string2);
		if(ans1 == ans2) {
			System.out.println("Both comparison methods give the SAME result.");
		}
		else {
			System.out.println("Comparison methods give DIFFERENT results.");
		}
		
	}
	public static boolean charCheck(String string1,String string2) {
		if(string1.length()!=string2.length()) {
			return false;
		}
		for(int i = 0;i<string1.length();i++) {
			if(string1.charAt(i)!=string2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}