import java.util.*;
public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		numCheck(num);
	}
	public static void numCheck(int num) {
		if(num>0) {
			System.out.println("Positive Number");
		}
		else if(num<0) {
			System.out.println("Negative Number");
		}else {
			System.out.println("Number is zero");
		}
	}
}
