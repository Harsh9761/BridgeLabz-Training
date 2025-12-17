// package core-java-practice.gcr-codebase.programming-elements;
import java.util.*;
public class volumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double volume = (22*r*r*h)/7;
        System.out.print(volume);
    }
}
