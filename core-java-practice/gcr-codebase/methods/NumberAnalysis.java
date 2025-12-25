import java.util.*;
public class NumberAnalysis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (PositiveCheck(num)) {
                System.out.print(num + " is Positive and ");
                if (EvenCheck(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparison of first and last elements:");
        if (result == 1) {
            System.out.println("First element is Greater than Last element");
        } else if (result == 0) {
            System.out.println("First element is Equal to Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }

	}
	public static int compare(int num1, int num2) {
        if (num1 > num2)
            return 1;
        else if (num1 == num2)
            return 0;
        else
            return -1;
    }
	public static boolean PositiveCheck(int num) {
        return num >= 0;
    }
	public static boolean EvenCheck(int num) {
        return num % 2 == 0;
    }

}
