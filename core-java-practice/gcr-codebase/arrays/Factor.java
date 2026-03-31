import java.util.*;
public class Factor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factor[] = new int[num];
		int count  = 0;
		for(int i = 1;i<=num;i++) {
			if(num%i==0) {
				factor[count] = i;
				count++;
			}
		}
		System.out.println("Factors are ");
		for(int i = 0;i<count;i++) {
			System.out.print(factor[i]+" ");
		}
	}
}