import java.util.*;
public class subStringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		System.out.println("Enter substring: ");
		String sub = sc.next();
		int count = countSubstring(input,sub);
		System.out.println("Count is: "+count);
	}
	public static int countSubstring(String input,String sub) {
		int count = 0;
		for(int i = 0;i <= input.length()- sub.length();i++) {
			if(input.substring(i, i+sub.length()).equals(sub)) {
				count++;
			}
		}
		return count;
	}

}
