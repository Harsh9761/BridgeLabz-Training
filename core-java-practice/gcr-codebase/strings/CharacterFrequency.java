import java.util.*;
public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		char ans[][] = Frequency(input);
		System.out.println("Character Frequency");
		for(int i = 0;i<ans.length;i++) {
			if (ans[i][0] != '\0') {
		        System.out.println(ans[i][0] + "\t" + (int) ans[i][1]);
		    }
		}
		
	}
	public static char[][] Frequency(String input) {
		int ascArr[] = new int[256];
		char ans[][] = new char[input.length()][2];
		for(int i = 0; i < input.length();i++) {
			char ch = input.charAt(i);
			ascArr[ch]++;
		}
		int index = 0;
		for(int i = 0;i < input.length();i++) {
			char ch = input.charAt(i);
			if(ascArr[ch]>0) {
				ans[index][0] = ch;
				ans[index][1] = (char)ascArr[ch];
				ascArr[ch] = 0;
				index++;
			}
		}
		return ans;
		

	}

}
