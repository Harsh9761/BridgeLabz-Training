import java.util.*;
public class GCDAndLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers to find GCD");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gcd = findGCD(num1,num2);
		int lcm = findLCM(num1,num2,gcd);
		
		System.out.println("GCD of two numbers is: "+gcd);
		System.out.println("LCM of two numbers is: "+lcm);
	}
	public static int findGCD(int num1,int num2) {
		int gcd = 1;
		int len = Math.min(num1, num2);
		for(int i = 1;i<=len;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}
	public static int findLCM(int num1,int num2,int gcd) {
		return (num1*num2)/gcd;
	}

}
