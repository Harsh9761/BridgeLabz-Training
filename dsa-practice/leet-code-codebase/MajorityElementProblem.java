import java.util.*;
public class MajorityElementProblem {

	public static void main(String[] args) {
		int nums[] = {1,7,3,4,4,8};
		int n = nums.length;
		int f = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num: nums){
            if(map.get(num)>n/2){
                System.out.println("Majority element is: "+num);
                f = 1;
                break;
            }
        }
        if(f == 0) {
        	System.out.println("No Majority element found");
        }

	}

}
