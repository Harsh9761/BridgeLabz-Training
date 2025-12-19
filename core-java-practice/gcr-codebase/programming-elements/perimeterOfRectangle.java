
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double len = sc.nextDouble();
        double bre = sc.nextDouble();
        double perimeter = 2*(len+bre);
        System.out.print(perimeter);
    }
}
