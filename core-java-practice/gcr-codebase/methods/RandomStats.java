import java.util.*;
public class RandomStats {

	public static void main(String[] args) {
		
		int randomNumbers[] = generateRandomNumber();
		double ans[] = findAvgMinMax(randomNumbers);
		System.out.println("Generated Numbers: " + Arrays.toString(randomNumbers));
		System.out.println("Average is: "+ans[0]);
		System.out.println("Max number is: "+ans[1]);
		System.out.println("Min number is: "+ans[2]);
		
	}
	public static int[] generateRandomNumber() {
		int RandomArr[] = new int[5];
		Random r = new Random();
		for(int i = 0;i<5; i++) {
			RandomArr[i] = (int)(Math.random()*9000)+1000; 
		}
		return RandomArr;
	}
	public static double[] findAvgMinMax(int randomArr[]) {
		int sum = 0;
		int min = randomArr[0];
		int max = randomArr[0];
		for(int i = 0;i < randomArr.length;i++) {
			sum += randomArr[i];
			min = Math.min(min, randomArr[i]);
			max = Math.max(max, randomArr[i]);
		}
		double avg = (sum)/5.0;
		return new double[] {avg,max,min};
		
	}

}
