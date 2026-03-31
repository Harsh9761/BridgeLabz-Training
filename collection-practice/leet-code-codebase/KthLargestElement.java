import java.util.*;
public class KthLargestElement {

	public static void main(String[] args) {
		int nums[] = {3,2,1,5,6,4};
		int k = 3;
		int n = nums.length;
        Arrays.sort(nums);
        
        System.out.println(nums[n-k]);

	}

}
