import java.util.*;
public class NumberCheckerTestFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is Prime Number: " + NumberCheckerFour.isPrime(number));
        System.out.println("Is Neon Number: " + NumberCheckerFour.isNeon(number));
        System.out.println("Is Spy Number: " + NumberCheckerFour.isSpy(number));
        System.out.println("Is Automorphic Number: " + NumberCheckerFour.isAutomorphic(number));
        System.out.println("Is Buzz Number: " + NumberCheckerFour.isBuzz(number));

	}

}
class NumberCheckerFour{
	public static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		for(int i = 2;i*i<number;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isNeon(int number) {
        int sum = 0;
        int square = number*number;
        while(square!=0) {
        	sum += square%10;
        	square /= 10;
        }
        if(sum == number)
        	return true;
        return false;
    }
	public static boolean isSpy(int number) {
		int sum = 0;
		int product = 1;
		while(number!=0) {
			int num = number%10;
			sum += num;
			product *= num;
			number /= 10;
		}
		return sum == product;
	}
	public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (square % 10 != temp % 10)
                return false;

            square /= 10;
            temp /= 10;
        }
        return true;
    }
	public static boolean isBuzz(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }
}
