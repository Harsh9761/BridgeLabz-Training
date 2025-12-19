
import java.util.Scanner;

public class StudentFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discountpercent = sc.nextInt();
        int discount = (fee*discountpercent)/100;
        int discountedPrice = fee-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted price is INR "+discountedPrice);
    }
}
