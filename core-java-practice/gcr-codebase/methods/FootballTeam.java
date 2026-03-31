import java.util.*;
public class FootballTeam {

	public static void main(String[] args) {
		int heights[] = generateHeight();
		int max = findTallest(heights);
		int min = findShortest(heights);
		int sum = findSum(heights);
		double mean = findMean(heights,sum);
		
		System.out.println("Player Heights (cm): " + Arrays.toString(heights));
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Player Height: " + min + " cm");
        System.out.println("Tallest Player Height: " + max + " cm");

	}
	
	public static int[] generateHeight() {
		int heights[] = new int[11];
		for(int i = 0;i < 11;i++) {
			heights[i] = (int)(Math.random()*101)+150;
			
		}
		return heights;
	}
	public static int findTallest(int heights[]) {
		int max = heights[0];
		for(int i = 1;i<heights.length;i++) {
			max = Math.max(max, heights[i]);
		}
		return max;
	}
	public static int findShortest(int heights[]) {
		int min = heights[0];
		for(int i = 1;i<heights.length;i++) {
			min = Math.min(min, heights[i]);
		}
		return min;
	}
	public static int findSum(int heights[]) {
		int sum = 0;
		for(int i = 0;i<heights.length;i++) {
			sum += heights[i];
		}
		return sum;
	}
	public static double findMean(int heights[],int sum) {
		return (double)sum/heights.length;
	}

}
