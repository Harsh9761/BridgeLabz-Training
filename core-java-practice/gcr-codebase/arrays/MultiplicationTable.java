import java.util.*;
public class MultiplicationTable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res[] = new int[4];
		int index = 0;
		for(int i = 6;i<=9;i++) {
			res[index] = num*i;
			index++;
		}
		index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + res[index]);
            index++;
        }
	}
}