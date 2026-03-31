import java.util.*;
public class LuckyDraw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Do you want Enter Lucky draw!!(Enter Yes to play and No to exit)...");
			String input = sc.next();
			if(input.equalsIgnoreCase("no")) {
				break;
			}
			System.out.println("Enter your Number: ");
			int number  = sc.nextInt();
			
			if (number <= 0) {
                System.out.println("Invalid number! Try again.");
                continue;
            }
			if(number%3==0  || number%5==0) {
				System.out.println("You won the Lucky Draw!!");
			}else {
				System.out.println("Sorry Better luck next time....");
			}
		}
		System.out.println("Game Over...");

	}

}
