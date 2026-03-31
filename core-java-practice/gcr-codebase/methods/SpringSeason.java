import java.util.*;
public class SpringSeason {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month: ");
		int month = sc.nextInt();
		System.out.println("Enter Day: ");
		int day = sc.nextInt();
		boolean ans = check(month,day);
		if(ans) {
			System.out.println("Its a Spring Season");
		} else {
			System.out.println("Its not a Spring Season");
		}
	}
	public static boolean check(int month,int day) {
		if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
	            return true;
	        }
	    return false;
	}

}
