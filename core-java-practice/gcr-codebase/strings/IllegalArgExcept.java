import java.util.*;
public class IllegalArgExcept {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String text = sc.next();
		System.out.println("Generating Exception");
		try {
			generateException(text);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception occurred in generateException() method.");
		}
		System.out.println("\nIllegalArgumentException:");
        HandleException(text);
	}
	public static void generateException(String ans) {
		System.out.println(ans.substring(6,1));
	}
	public static void HandleException(String ans) {
		try {
			System.out.println(ans.substring(6,1));
		}
		catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException caught!");
            System.out.println("Start index cannot be greater than end index.");
		}
		catch(RuntimeException e) {
			System.out.println("Runtime error occured");
		}
	}

}
