import java.util.*;
public class RemoveElementOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		System.out.println("Enter Removal Character: ");
		char ch = sc.next().charAt(0);
		String ans = "";
		for(int i = 0;i<input.length();i++) {
			if(input.charAt(i)!=ch) {
				ans += input.charAt(i);
			}
		}
		System.out.println("Updated String is: "+ans);
	}

}
