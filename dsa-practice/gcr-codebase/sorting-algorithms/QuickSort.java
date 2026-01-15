import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        double[] prices = new double[size];

        for (int i = 0; i < size; i++) {
            prices[i] = sc.nextDouble();
        }

        quickSort(prices, 0, size - 1);

        System.out.println("Product Prices in Ascending Order:");
        for (double price : prices) {
            System.out.print(price + " ");
        }

	}
	
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    public static int partition(double[] prices, int low, int high) {
        double pivot = prices[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

}
