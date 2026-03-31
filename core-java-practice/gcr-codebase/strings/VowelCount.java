import java.util.*;
public class VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		input = input.toLowerCase();
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i = 0;i < input.length();i++) {
			char ch = input.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u') {
					vowelCount++;
				}
				else {
					consonantCount++;
				}
			}
		}
		System.out.println("Vowel Count: "+vowelCount);
		System.out.println("Consonant Count: "+consonantCount);
	}

}
