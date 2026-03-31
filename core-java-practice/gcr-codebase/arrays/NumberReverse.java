import java.util.Scanner;
public class NumberReverse{
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
		for (int i = 0; i < count; i++) {
            digits[i] = digit % 10;
            digit /= 10;
        }
		System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
	}
}