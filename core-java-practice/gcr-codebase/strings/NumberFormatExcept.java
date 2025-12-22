import java.util.*;
public class NumberFormatExcept {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String text = sc.next();
		try {
			generateException(text);
		}
		catch(NumberFormatException e) {
			System.out.println("Exception occurred in generateException() method.");
		}
		System.out.println("\nNumberFormatException:");
        handleException(text);
	}
	public static void generateException(String text) {
		int num = Integer.parseInt(text);
		System.out.println(num);
	}
	public static void handleException(String ans) {
		try {
			int num = Integer.parseInt(ans);
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException caught!");
            System.out.println("Input text is not a valid integer.");
		}
		catch(RuntimeException e) {
			System.out.println("Runtime error occured");
		}
	}

}
