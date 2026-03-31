import java.util.*;
public class MovieTicketBookingDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean nextCustomer = true;

        while (nextCustomer) {

            int ticketPrice = 0;
            int snackPrice = 0;

            System.out.println("/n/n--- Movie Ticket Booking ---");

            System.out.println("Select Movie Type:");
            System.out.println("choose 1. for Regular");
            System.out.println("choose 2. for 7D");
            int movieType = sc.nextInt();

            switch (movieType) {
                case 1:
                    ticketPrice = 250;
                    break;
                case 2:
                    ticketPrice = 350;
                    break;
                default:
                    System.out.println("Invalid movie type");
                    continue;
            }

            System.out.println("Select Seat Type:");
            System.out.println("1. Gold");
            System.out.println("2. Silver");
            int seatType = sc.nextInt();

            if (seatType == 1) {
                ticketPrice += 150;
            } else if (seatType == 2) {
                ticketPrice += 100;
            } else {
                System.out.println("Invalid seat type");
                continue;
            }

            System.out.println("Do you want snacks? (yes/no)");
            String snacksChoice = sc.next().toLowerCase();

            if (snacksChoice.equals("yes")) {
                snackPrice = 100;
            }

            int totalAmount = ticketPrice + snackPrice;

            System.out.println("Total Amount to Pay: " + totalAmount);

            System.out.println("Process next customer? (yes/no)");
            String choice = sc.next().toLowerCase();
            nextCustomer = choice.equals("yes");
        }

        System.out.println("Booking completed. Thank you!");

	}

}
