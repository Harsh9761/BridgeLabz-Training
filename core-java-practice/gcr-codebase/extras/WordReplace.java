import java.util.*;
public class WordReplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		System.out.println("Enter Word to be replaced");
		String word = sc.next();
		System.out.println("Enter New word: ");
		String newWord = sc.next();
		
		String words[] = input.split(" ");
		for(int i = 0;i < words.length;i++) {
			if(words[i].equals(word)) {
				words[i] = newWord;
			}
		}
		
		String ans = String.join(" ", words);
		System.out.println("Updated String: "+ans);
		
	}

}
