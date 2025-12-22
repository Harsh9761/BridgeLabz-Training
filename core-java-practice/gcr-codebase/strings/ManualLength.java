import java.util.*;
public class ManualLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int Manualcount = findLength(word);
		int builtCount = word.length();
		System.out.println("\nLength using user-defined method: " + Manualcount);
        System.out.println("Length using built-in length(): " + builtCount);

	}
	public static int findLength(String word) {
		int count = 0;
		try {
			while(true) {
				word.charAt(count);
				count++;
			}
		}catch(StringIndexOutOfBoundsException e) {
			
		}
		return count;
	}

}
