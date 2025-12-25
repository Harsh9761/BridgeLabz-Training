import java.util.*;
public class VoteAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int persons[] = new int[10];
		System.out.println("Enter 10 person age");
		for(int i = 0;i<10;i++) {
			persons[i] = sc.nextInt();
			if(checkAge(persons[i])) {
				System.out.println("Student " + (i + 1) + " is eligible to vote.");
			}else {
				System.out.println("Student " + (i + 1) + " is not eligible to vote.");
			}
		}
	}
	public static boolean checkAge(int age) {
		if(age>=18) {
			return true;
		}
		return false;
	}

}
