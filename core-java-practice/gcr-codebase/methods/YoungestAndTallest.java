import java.util.*;
public class YoungestAndTallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] person = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + person[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + person[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        int youngestIndex = Youngest(ages);
        int tallestIndex = Tallest(heights);

        System.out.println("\nYoungest friend is: " + person[youngestIndex] +" (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest friend is: " + person[tallestIndex] +" (Height: " + heights[tallestIndex] + ")");
	}
	public static int Youngest(int[] age) {
        int min = age[0];
        int index = 0;

        for (int i = 1; i < age.length; i++) {
            if (age[i] < min) {
                min = age[i];
                index = i;
            }
        }
        return index;
    }
	
	public static int Tallest(double[] height) {
        double max = height[0];
        int index = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
                index = i;
            }
        }
        return index;
    }

}
