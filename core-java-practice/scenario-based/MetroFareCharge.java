import java.util.*;
public class MetroFareCharge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Smart Balance: ");
		int balance = sc.nextInt();
		while(balance > 0) {
			System.out.println("Enter the distance to be travelled (Enter -1 to exit)");
			int distance = sc.nextInt();
			if(distance == -1) {
				break;
			}
			int fare = (distance <= 5) ? 10 :(distance <= 15) ? 20 : 30;
			if(balance >= fare) {
				balance -= fare;
				System.out.println("Fare Charged: "+fare);
				System.out.println("Balance left: "+balance);
			}
			else {
				System.out.println("Not Enough Balance!");
			}
		}
		System.out.println("Transactions Completed...Balance Left: "+balance);

	}

}
