import java.util.*;
public class SortMarksUsingBubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		double marks[] = new double[size];
		for(int i = 0;i < size;i++) {
			marks[i] = sc.nextDouble();
		}
		for(int i = 0;i<size-1;i++) {
			for(int j = 0;j < size-i-1;j++) {
				if(marks[j]>marks[j+1]) {
					double temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted Marks: ");
		for(int i = 0;i < size;i++) {
			System.out.print(marks[i]+" ");
		}

	}

}
