import java.util.*;
class Palindrome{
	String text;
	
	public Palindrome(String text) {
		this.text = text;
	}
	
	public boolean isPalindrome() {
		int l = 0;
		int r = text.length()-1;
		while(l<r) {
			if(text.charAt(l)!=text.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	
	public void display() {
		if(isPalindrome()) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	}
}

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input text: ");
		String text = sc.next();
		
		Palindrome input = new Palindrome(text);
		input.display();

	}

}
