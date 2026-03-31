import java.util.Scanner;
public class Remarks2D{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double marks[][] = new double[n][3];
		double[] percentage = new double[n];
        char[] grade = new char[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Enter Physics Marks: ");
			marks[i][0] = sc.nextDouble();
			if (marks[i][0] < 0) {
				i--;
				continue;
			}
			
			System.out.println("Enter Chemistry Marks: ");
			marks[i][1] = sc.nextDouble();
			if (marks[i][1] < 0) {
				i--;
				continue;
			}
			
			System.out.println("Enter Maths Marks: ");
			marks[i][2] = sc.nextDouble();
			if (marks[i][2] < 0) {
				i--;
				continue;
			}
			
			percentage[i] = (marks[i][0]+marks[i][1]+marks[i][2])/3;
			
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
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.print(percentage[i] + "\t");
            System.out.println(grade[i]);
        }
	}
}