import java.util.*;
public class StringCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String string = sc.next();
		int len = string.length();
		char arr1[] = charArr(string);
		char arr2[] = string.toCharArray();
		boolean ans = checkArr(arr1,arr2);
		System.out.println("Are both character arrays equal? " + ans);
			
	}
	public static char[] charArr(String string) {
		char arr[] = new char[string.length()];
		for(int i = 0;i<string.length();i++) {
			arr[i] = string.charAt(i);
		}
		return arr;
	}
	public static boolean checkArr(char arr1[],char arr2[]) {
		for(int i = 0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
