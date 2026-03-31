import java.util.*;
public class GreatestOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter Number 3: ");
		int num3 = sc.nextInt();
		System.out.println("Greatest Number: "+greatest(num1,num2,num3));
		System.out.println("Smallest Number: "+smallest(num1,num2,num3));
		
	}
	public static int greatest(int num1,int num2,int num3) {
		int max = num1;
		if(num2>max) {
			max = num2;
		}
		if(num3>max) {
			max = num3;
		}
		return max;
	}
	public static int smallest(int num1,int num2,int num3) {
		int min = num1;
		if(num2<min) {
			min = num2;
		}
		if(num3<min) {
			min = num3;
		}
		return min;
	}

}
