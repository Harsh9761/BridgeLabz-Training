import java.util.Scanner;
public class DigitFreq{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int digit  = sc.nextInt();
		int freq[] = new int[10];
		while(digit>0) {
			freq[digit%10]++;
			digit /= 10;
		}
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }
	}
}