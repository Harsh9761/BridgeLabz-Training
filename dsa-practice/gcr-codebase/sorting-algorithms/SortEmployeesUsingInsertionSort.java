import java.util.*;
public class SortEmployeesUsingInsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int employeeId[] = new int[size];
		for(int i = 0;i < size;i++) {
			employeeId[i] = sc.nextInt();
		}
		for(int i = 1;i < size;i++) {
			int key = employeeId[i];
			int j = i-1;
			while(j>=0 && employeeId[j]>key) {
				employeeId[j+1] = employeeId[j];
				j--;
			}
			employeeId[j+1] = key;
		}
		System.out.println("Sorted Employee Id:");
		for(int i = 0;i < size;i++) {
			System.out.print(employeeId[i]+" ");
		}
	}

}
