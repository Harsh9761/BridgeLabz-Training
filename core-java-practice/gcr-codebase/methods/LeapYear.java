import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		boolean ans = checkLeap(year);
		if(ans) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}
	public static boolean checkLeap(int year) {
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		return false;
	}

}
