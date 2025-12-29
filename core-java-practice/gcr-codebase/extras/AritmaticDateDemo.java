import java.time.LocalDate;
import java.util.Scanner;
public class AritmaticDateDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date in (YYYY-MM-DD)format: ");
		String input = sc.nextLine();
		
		LocalDate date = LocalDate.parse(input);
		LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
		updatedDate = updatedDate.minusWeeks(3);
		
		System.out.println("Old Date: "+date);
		System.out.println("Updated Date: "+updatedDate);
	}

}
