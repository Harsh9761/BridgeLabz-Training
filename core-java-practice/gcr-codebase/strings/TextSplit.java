import java.util.*;
public class TextSplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		String text = sc.nextLine();
		String manualWords[] = textSplit(text);
		String inBuiltWords[] = text.split(" ");
		boolean ans = compareArr(manualWords,inBuiltWords);
		System.out.println("\nDo both methods give the same result? " + ans);
		
		
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
	public static boolean compareArr(String arr1[],String arr2[]) {
		if(arr1.length!=arr2.length) {
			return false;
			
		}
		for(int i = 0;i<arr1.length;i++) {
			if(!arr1[i].equals(arr2[i])) {
				return false;
			}
		}
		return true;
	}

}
