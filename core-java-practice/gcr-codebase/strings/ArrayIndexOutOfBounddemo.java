import java.util.*;
public class ArrayIndexOutOfBounddemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		String names[] = new String[size];
		for(int i = 0;i<size;i++) {
			names[i] = sc.next();
		}
		System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
		try {
			generateException(names);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occurred in generateException() method.");
		}
		System.out.println("ArrayIndexOutOfBoundsException:");
        handleException(names);
	}
	public static void generateException(String names[]) {
		System.out.println(names[names.length]);
	}
	public static void handleException(String names[]) {
		try {
			System.out.println(names[names.length]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Invalid index accessed in the array.");
		}
		catch(RuntimeException e) {
			System.out.println("Runtime error occured");
		}
	}

}
