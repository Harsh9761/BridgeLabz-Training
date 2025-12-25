import java.util.*;
public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double num3 = sc.nextDouble();

        double[] roots = findRoots(num1,num2,num3);
        if (roots.length == 0) {
            System.out.println("No real roots exist for the given quadratic equation.");
        } else if (roots.length == 1) {
            System.out.println("The quadratic equation has one root: x = " + roots[0]);
        } else {
            System.out.println("The quadratic equation has two roots:");
            System.out.println("x1 = " + roots[0]);
            System.out.println("x2 = " + roots[1]);
        }

	}
	public static double[] findRoots(double num1, double num2, double num3) {
        double ans = Math.pow(num2, 2) - 4 * num1 * num3;
        if (ans < 0) {
            return new double[0];
        }

        else if (ans == 0) {
            double root = -num2 / (2 * num1);
            return new double[]{root};
        }
 
        else {
            double sqrtDelta = Math.sqrt(ans);
            double root1 = (-num2 + sqrtDelta) / (2 * num1);
            double root2 = (-num2 - sqrtDelta) / (2 * num1);
            return new double[]{root1, root2};
        }
    }

}
