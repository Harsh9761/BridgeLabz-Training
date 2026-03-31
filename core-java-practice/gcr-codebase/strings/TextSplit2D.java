import java.util.Scanner;

public class TextSplit2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		String text = sc.nextLine();
		String manualWords[][] = textSplit(text);
		
		for(int i = 0;i < manualWords.length;i++) {
			System.out.print(manualWords[i][0]+" ");
			System.out.println(manualWords[i][1]+" ");
		}
		
	}
	public static String[][] textSplit(String text) {
		int count = 1;
		for(int i = 0;i < text.length();i++) {
			if(text.charAt(i)==' ') {
				count++;
			}
		}
		String words[][] = new String[count][2];
		String word = "";
		int index = 0;
		int len = 0;
		for(int i = 0;i < text.length();i++) {
			if(text.charAt(i)!=' ') {
				word += text.charAt(i);
				len++;
			}
			else {
				words[index][0] = word;
				words[index][1] = String.valueOf(len) ;
				index++;
				word = "";
				len = 0;
			}
		}
		words[index][0] = word;
		words[index][1] = String.valueOf(len);
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
