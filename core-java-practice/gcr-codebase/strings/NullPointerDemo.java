
public class NullPointerDemo {

	public static void main(String[] args) {
		System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException() method.");
        }
        System.out.println("\nHandling NullPointerException:");
        handleException();
	}
	public static void generateException() {
		String text = null;
		System.out.println(text.length());
	}
	public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Cannot call methods on a null object.");
        }
        
    }

}
