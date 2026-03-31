import java.util.*;
public class MeanHeight{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double players[] = new double[11];
		double sum = 0;
		for(int i = 0;i<11;i++) {
			players[i] = sc.nextDouble();
			sum += players[i];
		}
		System.out.println("The mean height of the football team is "+sum/11);
	}
}