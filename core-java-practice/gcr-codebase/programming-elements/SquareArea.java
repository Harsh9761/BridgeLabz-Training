import java.util.*;
public class SquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        int area = (b*h)/2;
        double areaInInches = area*0.155;
        System.out.println("Your Height in cm is "+h);
        System.out.println("Area in square centimeter "+area);
        System.out.println("Area in square centimeter "+areaInInches);
    }
}
