import java.util.*;
public class HeapSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        double[] salaries = new double[size];

        for (int i = 0; i < size; i++) {
            salaries[i] = sc.nextDouble();
        }
		PriorityQueue<Double> minHeap = new PriorityQueue<>();
		for(double salary: salaries) {
			minHeap.add(salary);
		}
		int index = 0;
		while(!minHeap.isEmpty()) {
			salaries[index++] = minHeap.poll();
		}
		for(int i = 0;i < salaries.length;i++) {
			System.out.print(salaries[i]+" ");
		}
	}

}
