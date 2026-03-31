import java.util.*;
public class MaxOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Number 2");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Number 3");
		int num3 = sc.nextInt();
		
		int maxOfThree = findMaximum(num1,num2,num3);
		System.out.println("Maximum of Three Numbers is: "+maxOfThree);
	}
	public static int findMaximum(int num1,int num2,int num3) {
		int max = num1;
		if(num2 > max)
			max = num2;
		if(num3 > max)
			max = num3;
		
		return max;
	}
}
