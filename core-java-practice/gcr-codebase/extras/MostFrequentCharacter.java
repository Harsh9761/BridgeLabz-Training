import java.util.*;
public class MostFrequentCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		int freq[] = new int[256];
		for(int i = 0;i<input.length();i++) {
			char ch =  input.charAt(i);
			freq[ch]++;
		}
		int max = 0;
		char ans = ' ';
		for(int i = 0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(freq[ch]>max) {
				max = freq[ch];
				ans = ch;
			}
		}
		System.out.println("Most Frequent Character: "+ans);
	}

}
