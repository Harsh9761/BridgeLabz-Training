import java.time.LocalDate;
import java.util.Scanner;
public class CompareDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date 1 in (yyyy-mm-dd) format");
		LocalDate date1 = LocalDate.parse(sc.nextLine());
		
		System.out.println("Enter Date 2 in (yyyy-mm-dd) format");
		LocalDate date2 = LocalDate.parse(sc.nextLine());
		
		if(date1.isBefore(date2)) {
			System.out.println("Date 1 is Before Date 2");
		}else if(date1.isAfter(date2)) {
			System.out.println("Date 1 is After Date 2");
		}else if(date1.isEqual(date2)) {
			System.out.println("Date 1 is Equal to Date 2");
		}
	}

}
