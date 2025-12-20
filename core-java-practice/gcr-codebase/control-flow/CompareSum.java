
import java.util.Scanner;

public class CompareSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);
        if (sumWhile == sumFormula) {
            System.out.println("Both computations are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }
    }
}
