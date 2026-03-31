import java.util.*;
public class StudentTestScores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		double marks[] = new double[n];
		double sum = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		for(int i = 0;i < n;i++) {
			System.out.println("Enter "+(i+1)+" student marks.");
			marks[i] = sc.nextDouble();
			if(marks[i]<0) {
				System.out.println("Invalid marks! Enter again.");
				i--;
				continue;
			}
			sum += marks[i];
			if(marks[i]>max) {
				max = marks[i];
			}
			
			if(marks[i]<min) {
				min = marks[i];
			}
			
		}
		double average = (sum)/n;
		System.out.println("Average marks is: "+average);
		System.out.println("Maximum marks is: "+max);
		System.out.println("Minimum marks is: "+min);
		
		System.out.println("Above average marks: ");
		for(int i = 0;i<n;i++) {
			if(marks[i]>average) {
				System.out.println("Student "+(i+1)+" marks"+marks[i]);
			}
		}
	}

}
