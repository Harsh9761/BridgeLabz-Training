import java.util.*;
public class UniqueCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input  = sc.nextLine();
		for(int i = 0;i < input.length();i++) {
			int count  = 0;
			char ch = input.charAt(i);
			if(input.charAt(i)==' ') {
				continue;
			}
			for(int j = 0;j < input.length();j++) {
				if(input.charAt(j)==ch) {
					count++;
				}
				
			}
			if(count == 1) {
				System.out.println("Unique element: "+ch);
			}
		}
	}

}
