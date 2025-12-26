import java.util.*;
public class EucledeanDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = Distance(x1, y1, x2, y2);
        double[] equation = Equation(x1, y1, x2, y2);

        System.out.println("Euclidean Distance = " + distance);
        System.out.println("Slope (m) = " + equation[0]);
        System.out.println("Y-Intercept (b) = " + equation[1]);
        System.out.println("Equation of line: y = " + equation[0] + "x + " + equation[1]);

	}
	
	public static double Distance(double x1,double y1,double x2,double y2) {
		double d1 = x2-x1;
		double d2 = y2-y1;
		return Math.sqrt(Math.pow(d1, 2)+Math.pow(d2,2));
	}
	
	public static double[] Equation(double x1,double y1,double x2,double y2) {
		double[] ans = new double[2];

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        ans[0] = m;
        ans[1] = b;

        return ans;
	}

}
