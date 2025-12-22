import java.util.*;
public class VoteAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students");
		int num = sc.nextInt();
		String student[][] = new String[num][2];
		System.out.println("Enter Student Details: ");
		for(int i = 0;i<num;i++) {
			System.out.println("Enter name: ");
			student[i][0] = sc.next();
			System.out.println("Enter Age: ");
			int age  = sc.nextInt();
			if(age >= 18) {
				student[i][1] = "Yes";
			} else {
				student[i][1] = "No";
			}
		}
		for(int i = 0;i < num;i++) {
			System.out.println("Name: "+student[i][0]+" Can he/she Vote? "+student[i][1]);
		}
	}

}
