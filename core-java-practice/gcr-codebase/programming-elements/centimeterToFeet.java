
import java.util.Scanner;

public class centimeterToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double totalInch = h/2.54;
        int feet = (int)totalInch/12;
        double inch = totalInch%12;
        System.out.print("Your Height in cm is "+h+" while in feet is "+feet+" and inches is "+inch);
    }
}
