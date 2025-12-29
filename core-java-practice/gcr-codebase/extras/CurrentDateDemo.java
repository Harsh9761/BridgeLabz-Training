import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class CurrentDateDemo {

	public static void main(String[] args) {
		LocalDate currDate = LocalDate.now();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		
		System.out.println("Format1: "+currDate.format(format1));
		System.out.println("Format2: "+currDate.format(format2));
		System.out.println("Format3: "+currDate.format(format3));

	}

}
