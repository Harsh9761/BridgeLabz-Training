import java.util.*;
public class NumberCheckerTestTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = NumberCheckerTwo.CountDigits(number);
        int[] digits = NumberCheckerTwo.storeInArray(number, count);

        System.out.println("Count of digits: " + count);

        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Sum of digits: " + NumberCheckerTwo.digitSum(digits));
        System.out.println("Sum of squares of digits: " + NumberCheckerTwo.sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + NumberCheckerTwo.checkHarshad(number, digits));

        int[][] freq = NumberCheckerTwo.frequency(digits);
        System.out.println("Digit  Frequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + "  " + freq[i][1]);
            }
        }

	}

}

class NumberCheckerTwo{
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
	
	
	public static int digitSum(int digits[]) {
		int sum = 0;
		for(int i = 0;i < digits.length;i++) {
			sum += digits[i];
		}
		return sum;
	}
	
	public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int i = 0;i<digits.length;i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }
	public static boolean checkHarshad(int number, int[] digits) {
        int sum = digitSum(digits);
        return number % sum == 0;
    }
	public static int[][] frequency(int digits[]){
		int freq[][] = new int[10][2];
		for(int i = 0;i < 10;i++) {
			freq[i][0] = i;
		}
		for(int i = 0;i < digits.length;i++) {
			freq[digits[i]][1]++;
		}
		return freq;
	}
}
