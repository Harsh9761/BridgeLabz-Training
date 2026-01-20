import java.util.*;
public class SingleNumberProblem {

	public static void main(String[] args) {
		int nums[] = {2,2,1};
		int f = 0;
		HashMap<Integer,Integer> a = new HashMap<>();
        for(int num : nums){
           a.put(num,a.getOrDefault(num,0)+1);
        }
        for(int i = 0;i<nums.length;i++){
            if(a.get(nums[i])==1){
                System.out.println(nums[i]);
                f = 1;
            }
        }
        if(f==0)
        System.out.println(-1);
	}

}
