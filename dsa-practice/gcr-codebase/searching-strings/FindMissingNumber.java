import java.util.*;
public class FindMissingNumber {

	public static void main(String[] args) {
		int input[] = {3, 4, -1, 1};
        int target = 4;
        int missing = firstMissingPositive(input);
        System.out.println("First Missing Positive: " + missing);

        Arrays.sort(input);

        int index = binarySearch(input, target);

        System.out.println("Sorted Array: " + Arrays.toString(input));
        System.out.println("Target Index: " + index);

	}
	
	public static int firstMissingPositive(int[] nums) {

        int n = nums.length;
        boolean[] visited = new boolean[n + 1];
        for (int num : nums) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return n + 1;
    }

    public static int binarySearch(int input[], int target) {

        int left = 0;
        int right = input.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (input[mid] == target) {
                return mid;
            } else if (input[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
