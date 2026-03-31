import java.util.*;
public class VowelConsonantSymbolCount {

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
					System.out.println("Vowel "+ch);
				}
				else {
					System.out.println("Consonant "+ch);
				}
			}
			else {
				System.out.println("Not a Letter "+ ch);
			}
		}

	}

}
