import java.util.*;
public class TrignometryCalculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angle in degrees");
		double angle = sc.nextDouble();
		double ans[] = calculateTrignometry(angle);
		System.out.println("Sine value: " + ans[0]);
		System.out.println("Cosine value: " + ans[1]);
		System.out.println("tangent value: " + ans[2]);
		
	}
	public static double[] calculateTrignometry(double angle) {
		double radian = Math.toRadians(angle);
		
		double sine = Math.sin(radian);
		double cose = Math.cos(radian);
		double tangent = Math.tan(radian);
		return new double[] {sine,cose,tangent};
	}

}
