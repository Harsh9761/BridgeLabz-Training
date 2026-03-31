import java.util.*;
public class StonePaperScissor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userWins = 0;
        int computerWins = 0;
        int draws = 0;
		System.out.println("Enter Number of Games: ");
		int games = sc.nextInt();
		for(int i = 0;i< games;i++) {
			System.out.println("Game " + (i + 1) + " - Enter rock/paper/scissors: ");
			String userChoice = sc.next().toLowerCase();
			String computerChoice = ComputerCH();
			String winner = decideWinner(userChoice,computerChoice);
			
			if (winner.equals("Player")) 
			    userWins++;
            else if (winner.equals("Computer")) 
            	computerWins++;
            else 
            	draws++;

            System.out.println(i+1 + "\t" + userChoice + "\t\t" + computerChoice + "\t\t" + winner);
            
            
			
		}
		double winPercent = (userWins * 100.0)/games;
        double winPercentComp = (computerWins * 100.0)/games;
        
        System.out.println("Total Games: "+games);
        System.out.println("User Win percentage: "+ winPercent);
        System.out.println("Computer Win percentage: "+ winPercentComp);
	}
	public static String decideWinner(String userChoice,String computerChoice) {
		if (userChoice.equals(computerChoice))
            return "Draw";

        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")))
            return "Player";

        return "Computer";
	}
	public static String ComputerCH() {
		Random r = new Random();
		int choice = r.nextInt(3);
		if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
	}

}
