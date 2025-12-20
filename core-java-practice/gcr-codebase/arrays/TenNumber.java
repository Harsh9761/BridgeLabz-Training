import java.util.*;
public class TenNumber{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number[] = new int[10];
		int sum = 0;
		int count = 0;
		for(int i = 0;i<10;i++) {
			number[i] = sc.nextInt();
			
			if(number[i]<0) {
				break;
			}
			sum += number[i];
			count++;
		}
		for(int i = 0;i<count;i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println("Sum is: "+sum);
	}
}