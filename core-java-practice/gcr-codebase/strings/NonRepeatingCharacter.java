import java.util.*;
public class NonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		char ans = findNonRepeatingCharacter(input);
		if(ans != ' ')
			System.out.println("First NonRepeating Character: "+ans);
		else 
			System.out.println(" No First NonRepeating Character Exists ");
	}
	public static char findNonRepeatingCharacter(String input) {
		int ascArr[] = new int[256];
		for(int i = 0; i < input.length();i++) {
			char ch = input.charAt(i);
			ascArr[ch]++;
		}
		for(int i = 0;i < input.length();i++) {
			char ch = input.charAt(i);
			if(ascArr[ch] == 1) {
				return ch;
			}
		}
		return ' ';
	}

}
