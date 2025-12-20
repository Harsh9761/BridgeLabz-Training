import java.util.*;
public class CompareSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumFor = 0;
        for (int i = 1;i <= n;i++) {
            sumFor += i;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using while loop: " + sumFor);
        System.out.println("Sum using formula: " + sumFormula);
        if (sumFor == sumFormula) {
            System.out.println("Both computations are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }
    }
}
