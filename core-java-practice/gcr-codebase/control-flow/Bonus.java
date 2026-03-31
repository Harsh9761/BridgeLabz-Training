
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int years = sc.nextInt();
        double bonus = 0.05;
        System.out.println("Bonus is: ");
        if(years>5){
            System.out.println(salary*bonus);
        }
        else{
            System.out.println(0);
        }
    }
}
