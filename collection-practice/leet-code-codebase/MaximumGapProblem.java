import java.util.*;
public class MaximumGapProblem {

	public static void main(String[] args) {
		int nums[] = {3,6,9,1};
		int n = nums.length;
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        
        for(int i = n-1;i>0;i--){
            int d = nums[i]-nums[i-1];
            max = Math.max(max,d);
        }
        System.out.println("Maximum gap is: "+max);

	}

}
