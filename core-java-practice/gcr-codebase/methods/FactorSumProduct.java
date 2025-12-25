import java.util.*;
public class FactorSumProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int ans[] = findFactor(num);
		int sum = Sum(ans);
		int sumOfSquares = sumOfSquare(ans);
		int product = Product(ans);
		System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

	}
	public static int[] findFactor(int num) {
		int c = 0;
		
		for(int i = 1;i<num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		int factor[] = new int[c];
		int index = 0;
		for(int i = 1;i < num;i++) {
			if(num%i==0) {
				factor[index++] = i;
			}
		}
		return factor;
	}
	public static int Sum(int factor[]) {
		int sum = 0;
		for(int i = 0;i<factor.length;i++) {
			sum += factor[i];
		}
		return sum;
	}
	public static int sumOfSquare(int factor[]) {
		int sum = 0;
		for(int i = 0;i<factor.length;i++) {
			int square = (int)Math.pow(factor[i], 2);
			sum += square;
		}
		return sum;
	}
	public static int Product(int factor[]) {
		int product = 1;
		for(int i = 0;i<factor.length;i++) {
			product *= factor[i];
		}
		return product;
	}

}
