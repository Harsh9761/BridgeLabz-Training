import java.util.*;
public class InvoiceGenerator {

	public static void main(String[] args) {
		String input = "Logo Design - 3000 INR, Web Page - 4500 INR";
		String tasks[] = parseInvoice(input);
		int totalAmount = getAmount(tasks);
		System.out.println("Invoice Details:");
        for (String task : tasks) {
            System.out.println(task);
        }

        System.out.println("Total Invoice Amount: " + totalAmount + " INR");

	}
	public static String[] parseInvoice(String input) {
		return input.split(",");
	}
	
	public static int getAmount(String input[]) {
		int total = 0;
		for(String task : input) {
			String parts[] = task.split("-");
			String amountPart = parts[1];
            String amountStr = amountPart.replaceAll("[^0-9]", "");

            int amount = Integer.parseInt(amountStr);
            total += amount;
		}
		return total;
	}

}
