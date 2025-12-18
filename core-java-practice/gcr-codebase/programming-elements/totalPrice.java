
import java.util.Scanner;

public class totalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int qty = sc.nextInt();
        int tprice = price*qty;
        System.out.println("The total price is "+tprice+" If quantity is "+qty+" unit price is INR "+price);
        
    }
}
