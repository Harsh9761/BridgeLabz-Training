import java.util.*;
public class PrimeNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to be checked for Prime: ");
		int num = sc.nextInt();
		if(checkPrime(num)) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is not Prime");
		}

	}
	public static boolean checkPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i = 2;i*i <= num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
