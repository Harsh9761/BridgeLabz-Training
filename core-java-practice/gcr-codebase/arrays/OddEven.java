import java.util.*;
public class OddEven{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int evenArr[]= new int[num/2+1];
		int oddArr[]= new int[num/2+1];
		int evenCount = 0;
		int oddCount = 0;
		for(int i = 1;i<=num;i++) {
			if(i%2==0) {
				evenArr[evenCount] = i;
				evenCount++;
			}
			else {
                oddArr[oddCount] = i;
                oddCount++;
            }
		}
		System.out.println("Odd Numbers: ");
		for(int i = 0;i<oddCount;i++) {
			System.out.print(oddArr[i]+" ");
		}
		System.out.println();
		System.out.println("Even Numbers: ");
		for(int i = 0;i<evenCount;i++) {
			System.out.print(evenArr[i]+" ");
		}
		System.out.println();
	}
}