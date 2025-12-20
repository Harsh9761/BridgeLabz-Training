import java.util.*;
public class MaxDigit{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		int digitCopy = digit;
		int count = 0;
		while(digitCopy>0) {
			count++;
			digitCopy = digitCopy/10;
		}
		int digits[] = new int[count];
		for (int i = count - 1; i >= 0; i--) {
            digits[i] = digit % 10;
            digit /= 10;
        }
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i = 0;i<count;i++) {
			if(digits[i]>max) {
				secondMax = max;
				max = digits[i];
				
			}
			else if (digits[i] > secondMax && digits[i] != max) {
                secondMax = digits[i];
            }
		}
		System.out.println("Largest digit: " + max);
        System.out.println("Second largest digit: " + secondMax);
		
	}
}