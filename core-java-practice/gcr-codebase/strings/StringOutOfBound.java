
public class StringOutOfBound {

	public static void main(String[] args) {
		System.out.println("Generating StringIndexOutOfBoundsException: ");
		try {
			generateException();
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Exception occurred in generateException() method.");
		}
		System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException();
	}
	public static void generateException() {
		String text = "harsh";
		System.out.println(text.charAt(7));
	}
	public static void handleException() {
		String text = "harsh";
		try {
			System.out.println(text.charAt(7));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Invalid index used while accessing string characters.");
		}
	}

}
