import java.util.*;
public class NumberCheckerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = NumberChecker.CountDigits(number);
        int[] digits = NumberChecker.storeInArray(number, count);

        System.out.println("Count of digits: " + count);

        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number: " + NumberChecker.checkDuck(digits));
        System.out.println("Is Armstrong Number: " + NumberChecker.checkArmStrong(number, digits));

        NumberChecker.findLargest(digits);
        NumberChecker.findSmallest(digits);
	}
	

}
class NumberChecker{
	public static int CountDigits(int number) {
		int count = 0;
		while(number > 0) {
			count++;
			number /= 10;
		}
		return count;
	}
	public static int[] storeInArray(int number,int count) {
		int digits[] = new int[count];
		for(int i = count-1;i >= 0;i--) {
			digits[i] = number%10;
			number /= 10;
		}
		return digits;
	}
	public static boolean checkDuck(int digits[]) {
		for(int i = 0;i < digits.length;i++) {
			if(digits[i]!=0) {
				return true;
			}
		}
		return false;
	}
	public static boolean checkArmStrong(int number,int digits[]) {
		int sum = 0;
		int power = digits.length;
		for(int i = 0;i<digits.length;i++) {
			sum += Math.pow(digits[i], power);
		}
		if(sum == number)
			return true;
		else
			return false;
	}
	public static void findLargest(int digits[]) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i = 0;i < digits.length;i++) {
			if(digits[i]>largest) {
				secondLargest = largest;
				largest = digits[i];
			}
			else if(digits[i] > secondLargest && digits[i]!=largest) {
				secondLargest = digits[i];
			}
		}
		System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
	}
	
	public static void findSmallest(int digits[]) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i = 0;i < digits.length;i++) {
			if(digits[i]<smallest) {
				secondSmallest = smallest;
				smallest = digits[i];
			}
			else if(digits[i] < secondSmallest && digits[i]!=smallest) {
				secondSmallest = digits[i];
			}
		}
		System.out.println("Largest digit: " + smallest);
        System.out.println("Second Largest digit: " + secondSmallest);
	}
	
	
	
}
