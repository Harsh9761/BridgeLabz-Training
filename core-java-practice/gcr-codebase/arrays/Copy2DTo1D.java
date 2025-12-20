import java.util.*;
public class Copy2DTo1D{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int arr2D[][] = new int[rows][cols];
        for(int i = 0;i<rows;i++) {
        	for(int j = 0;j<cols;j++) {
        		arr2D[i][j] = sc.nextInt();
        	}
        }
        int[] arr1D = new int[rows * cols];
        int index = 0;
        for(int i = 0;i<rows;i++) {
        	for(int j = 0;j<cols;j++) {
        		arr1D[index++] = arr2D[i][j];
        	}
        }
        System.out.println("\n1D Array:");
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }
	}
}