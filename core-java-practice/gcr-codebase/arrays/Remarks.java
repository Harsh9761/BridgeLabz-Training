import java.util.*;
public class Remarks{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            if (physics[i] < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
                i--;
                continue;
            }
            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
                i--;
                continue;
            }
            System.out.print("Maths: ");
            maths[i] = sc.nextInt();
            if (maths[i] < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
                i--;
                continue;
            }
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else {
                grade[i] = 'D';
            }
        }

        System.out.println("\n------ Student Report ------");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(physics[i] + "\t");
            System.out.print(chemistry[i] + "\t");
            System.out.print(maths[i] + "\t");
            System.out.print(String.format("%.2f", percentage[i]) + "\t\t");
            System.out.println(grade[i]);
        }
	}
}