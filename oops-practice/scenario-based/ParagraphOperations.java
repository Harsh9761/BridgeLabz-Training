import java.util.*;
public class ParagraphOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Paragraph");
		String input = sc.nextLine();
		System.out.println("Enter word to be replaced: ");
		String word = sc.next();
		System.out.println("Enter New Word: ");
		String newWord = sc.next();
		
		String newParagraph = input.replaceAll("(?i)\\b"+word+"\\b", newWord);
		
		int count = countAndLongest(input.trim());
		System.out.println("Number of words: "+count);
		System.out.println("New Paragraph is: "+newParagraph);

	}
	
	public static int countAndLongest(String input) {
		int count = 0;
		String words[] = input.split("\\s+");
		count = words.length;
		String longestWord = words[0];
		for(int i = 1;i<words.length;i++) {
			if(words[i].length() > longestWord.length()) {
				longestWord = words[i];
			}
		}
		
		System.out.println("Longest Word is: "+longestWord);
		
		return count;
	}
	

}
