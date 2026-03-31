import java.util.*;
public class SortPricesUsingMergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		double prices[] = new double[size];
		for(int i = 0;i < size;i++) {
			prices[i] = sc.nextDouble();
		}
		mergeSort(prices,0,size-1);
		System.out.println("Sorted Prices of Book:");
		for(int i = 0;i < size;i++) {
			System.out.print(prices[i]+" ");
		}

	}
	
	public static void mergeSort(double prices[],int left,int right) {
		if(left < right) {
			int mid = (left+right)/2;
			mergeSort(prices,left,mid);
			mergeSort(prices,mid+1,right);
			merge(prices,left,mid,right);
		}
	}
	
	public static void merge(double prices[],int left,int mid,int right) {
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		double L[] = new double[n1];
		double R[] = new double[n2];
		
		for(int i = 0;i<n1;i++) {
			L[i] = prices[left+i];
		}
		for(int i = 0;i<n2;i++) {
			R[i] = prices[mid+1+i];
		}
		
		int i = 0;
		int j = 0;
		
		int k = left;
		while(i < n1 && j < n2) {
			if(L[i]<R[j]) {
				prices[k] = L[i];
				i++;
			}else {
				prices[k] = R[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			prices[k] = L[i];
			i++;
			k++;
		}
		while(j < n2) {
			prices[k] = R[j];
			j++;
			k++;
		}
		
	}

}
