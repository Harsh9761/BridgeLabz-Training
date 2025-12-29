import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class LibraryReminderApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fine = 5;
		for(int i = 0;i<5;i++) {
			System.out.println("Book "+(i+1));
			System.out.println("Enter due date (YYYY-MM-DD): ");
			LocalDate dueDate = LocalDate.parse(sc.next());
			
			System.out.println("Enter return date (YYYY-MM-DD): ");
			LocalDate returnDate = LocalDate.parse(sc.next());
			
			if(returnDate.isAfter(dueDate)) {
				long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);
				long totalFine = lateDays*fine;
				System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine to be paid: " + totalFine);
			}else {
				System.out.println("Book is returned on time!No Fine..");
			}
		}

	}

}
