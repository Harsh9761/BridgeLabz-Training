import java.util.*;
public class SingleNumber {

	public static void main(String[] args) {
		int nums[] = {25,1,45,78,2};
		Arrays.sort(nums);
        int element = nums[nums.length-1];
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                element=nums[i];
                break;
            }
        }
        System.out.println(element);

	}

}
