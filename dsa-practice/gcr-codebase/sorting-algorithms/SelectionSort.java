import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        double[] scores = new double[size];

        for (int i = 0; i < size; i++) {
            scores[i] = sc.nextDouble();
        }
        
        for(int i = 0;i<size;i++) {
        	int minIndex = i;
        	for(int j = i+1;j<size;j++) {
        		if(scores[j]<scores[minIndex]) {
        			minIndex = j;
        		}
        	}
        	double temp = scores[minIndex];
        	scores[minIndex] = scores[i];
        	scores[i] = temp;
        }
        System.out.println("Sorted Scores are:");
        for(int i = 0;i < size;i++) {
        	System.out.print(scores[i]+" ");
        }

	}

}
