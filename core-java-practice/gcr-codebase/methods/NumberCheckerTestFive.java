import java.util.*;
public class NumberCheckerTestFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	     int number = sc.nextInt();

	     System.out.println("Is Perfect Number: " + NumberCheckerFive.isPerfect(number));
	     System.out.println("Is Abundant Number: " + NumberCheckerFive.isAbundant(number));
	     System.out.println("Is Deficient Number: " + NumberCheckerFive.isDeficient(number));
	     System.out.println("Is Strong Number: " + NumberCheckerFive.isStrong(number));
	}

}
class NumberCheckerFive{
	public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int number) {
        return number > 0 && sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        return number > 0 && sumOfProperDivisors(number) > number;
    }


    public static boolean isDeficient(int number) {
        return number > 0 && sumOfProperDivisors(number) < number;
    }

    public static int factorial(int digit) {
        int f = 1;
        for (int i = 1; i <= digit; i++) {
            f *= i;
        }
        return f;
    }


    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
}
