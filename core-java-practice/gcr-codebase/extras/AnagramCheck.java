import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String input1 = sc.next();
		System.out.println("Enter String 2: ");
		String input2 = sc.next();
		if(checkAnagram(input1,input2)) {
			System.out.println("Both Strings are Anagram");
		}else {
			System.out.println("Both Strings are not Anagram");
		}
		
	}
	public static boolean checkAnagram(String string1,String string2) {
		if(string1.length()!=string2.length()) {
			return false;
		}
		int len = string1.length();
		char arr1[] = string1.toCharArray();
		char arr2[] = string2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String ans1 = new String(arr1);
        String ans2 = new String(arr2);

        return ans1.equals(ans2);
	}

	

}
