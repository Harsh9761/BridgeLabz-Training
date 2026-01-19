
public class FibonacciComparison {

	public static void main(String[] args) {
		int n = 40;
		long start = System.nanoTime();
		fibonacciRecursive(n);
		long end = System.nanoTime();
		System.out.println("fibonacciRecursive Time: " + (end - start) / 1_000_000.0 + " ms");
		
		start = System.nanoTime();
		fibonacciIterative(n);
		end = System.nanoTime();
		System.out.println("fibonacciIterative Time: " + (end - start) / 1_000_000.0 + " ms");

	}
	
	public static int fibonacciRecursive(int n) {
	    if (n <= 1) 
	        return n;
	    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
	
	public static int fibonacciIterative(int n) {
	    int a = 0, b = 1, sum;
	    for (int i = 2; i <= n; i++) {
	        sum = a + b;
	        a = b;
	        b = sum;
	    }
	    return b;
	}


}
