import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Priciple: ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter Rate: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter Time: ");
		double time = sc.nextDouble();
		
		double SI = findInterest(principal,rate,time);
		System.out.println("Simple Interest is: "+SI);
	}
	public static double findInterest(double principal,double rate,double time) {
		return (principal*rate*time)/100;
	}

}
