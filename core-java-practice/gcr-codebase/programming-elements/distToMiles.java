import java.util.Scanner;

public class distToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = 0.621371*km;
        System.out.print(miles);
    }
}
