import java.util.*;
public class kiloToMiles2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = 0.621371*km;
        System.out.print("The total miles is "+miles+" mile for the given "+km);
    }
}
