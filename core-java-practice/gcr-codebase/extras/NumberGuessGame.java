import java.util.*;
public class NumberGuessGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess number between 1 to 100");
		boolean guess = false;
		int high = 100;
		int low = 1;
		while(!guess) {
			int generatedNum = generateGuess(low,high);
			System.out.println("Computer Guess: "+generatedNum);
			System.out.println("If guessed number greater than your number enter high");
			System.out.println("If guessed number lesser than your number enter less");
			System.out.println("If guessed number equal than your number enter correct");
			String input = sc.next().toLowerCase();
			if(input.equals("high")) {
				high = generatedNum-1;
				
			}
			else if(input.equals("low")) {
				low = generatedNum+1;
			}else if(input.equals("correct")){
				System.out.println("Computer Guessed your Number!!");
				guess = true;
			}else {
				System.out.println("Invalid Input.");
			}
		}
	}
	public static int generateGuess(int low,int high) {
		return (low+high)/2;
	}

}
