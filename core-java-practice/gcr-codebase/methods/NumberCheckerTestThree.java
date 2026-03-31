import java.util.*;
public class NumberCheckerTestThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = NumberCheckerThree.CountDigits(number);
        int[] digits = NumberCheckerThree.storeInArray(number, count);

        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int[] reversed = NumberCheckerThree.reverseArray(digits);
        System.out.print("Reversed Array: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Arrays are equal: " +NumberCheckerThree.compareArrays(digits, reversed));

        System.out.println("Is Palindrome Number: " +NumberCheckerThree.isPalindrome(digits));

        System.out.println("Is Duck Number: " + NumberCheckerThree.checkDuck(digits));

	}

}
class NumberCheckerThree{
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
	public static int[] reverseArray(int digits[]) {
		int len = digits.length;
		int reverseArr[] = new int[len];
		int index = 0;
		for(int i = len-1;i>=0;i--) {
			reverseArr[index++] = digits[i];
		}
		return reverseArr;
	}
	public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
	
	public static boolean isPalindrome(int[] digits) {
        int[] reverseArr = reverseArray(digits);
        return compareArrays(digits, reverseArr);
    }
	
	public static boolean checkDuck(int digits[]) {
		for(int i = 0;i < digits.length;i++) {
			if(digits[i]!=0) {
				return true;
			}
		}
		return false;
	}
}
