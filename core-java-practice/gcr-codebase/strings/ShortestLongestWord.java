import java.util.*;
public class ShortestLongestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		String text = sc.nextLine();
		String manualWords[] = textSplit(text);
		String shortest = manualWords[0];		
		String longest = manualWords[0];
		for(int i = 0;i<manualWords.length;i++) {
			int wordLength = findLength(manualWords[i]);
			if(wordLength>findLength(longest)) {
				longest = manualWords[i];
			}
			if(wordLength<findLength(shortest)) {
				shortest = manualWords[i];
			}
			
		}
		System.out.println("\nShortest word: " + shortest + " (Length: " + findLength(shortest) + ")");
        System.out.println("Longest word: " + longest + " (Length: " + findLength(longest) + ")");
		
	}
	public static String[] textSplit(String text) {
		int count = 1;
		for(int i = 0;i < text.length();i++) {
			if(text.charAt(i)==' ') {
				count++;
			}
		}
		String words[] = new String[count];
		String word = "";
		int index = 0;
		for(int i = 0;i < text.length();i++) {
			if(text.charAt(i)!=' ') {
				word += text.charAt(i);
			}
			else {
				words[index++] = word;
				word = "";
			}
		}
		words[index] = word;
		return words;
	}
	public static int findLength(String word) {
		int count = 0;
		try {
			while(true) {
				word.charAt(count);
				count++;
			}
		}
		catch(StringIndexOutOfBoundsException e) {
			
		}
		return count;
	}
}
