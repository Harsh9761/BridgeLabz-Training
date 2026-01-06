
public class IntegerDivision {

	public static void main(String[] args) {
		int dividend = 25;
		int divisor = 5;
		int f = 0;
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			f = 1;
            System.out.println(Integer.MAX_VALUE); // Overflow case
        }
		if(f==0) {
			int a = (int)dividend/divisor;
	        System.out.println(a);
		}
        

	}

}
