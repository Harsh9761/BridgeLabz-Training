
public class CompareSearchAlgorithms {

	public static void main(String[] args) {
		int n = 1000000;
		int numbers[] = new int[n];
		for(int i = 0; i < n;i++) {
			numbers[i] = i;
		}
		
		int target = n-1;
		long start = System.nanoTime();
		linearSearch(numbers,target);
		long end = System.nanoTime();
		System.out.println("Linear Search Time: " + (end - start) / 1_000_000.0 + " ms");
		
		start = System.nanoTime();
        binarySearch(numbers, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) / 1_000_000.0 + " ms");

	}
	
	public static int linearSearch(int numbers[],int target) {
		for(int i = 0 ;i < numbers.length;i++) {
			if(numbers[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int numbers[],int target) {
		int left = 0;
		int right = numbers.length-1;
		while(left < right) {
			int mid = left+(right-left)/2;
			if(numbers[mid] == target) {
				return mid;
			}else if(numbers[mid] > target) {
				right = mid-1;
			}else {
				left = mid+1;
			}
		}
		return -1;
	}

}
