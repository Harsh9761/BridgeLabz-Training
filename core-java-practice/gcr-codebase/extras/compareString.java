import java.util.*;
public class compareString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String input1 = sc.nextLine();
		
		System.out.println("Enter String2: ");
		String input2 = sc.nextLine();
		int ans = compareString(input1,input2);
		if(ans == 0) {
			System.out.println("Both String are Equal");
		}else if(ans < 0) {
			System.out.println("String 1 comes before String 2");
		} else {
			System.out.println("String 2 comes before String 1");
		}

	}
	public static int compareString(String string1,String string2) {
		int min = string1.length()>string2.length()?string2.length():string1.length();
		for(int i = 0;i<min;i++) {
			char c1 = string1.charAt(i);
			char c2 = string2.charAt(i);
			if(c1!=c2) {
				return c1-c2;
			}
		}
		return string1.length()-string2.length();
	}

}
