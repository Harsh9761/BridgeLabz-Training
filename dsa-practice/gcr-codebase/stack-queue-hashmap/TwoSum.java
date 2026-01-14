import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int arr[] = {8, 7, 2, 5, 3, 1};
		int target = 10;
		int f = 0;
		for(int i = 0;i < arr.length;i++) {
			int compliment = target - arr[i];
			if(map.containsKey(compliment)) {
				System.out.println("Pair found: "+map.get(compliment)+" "+i);
				f = 1;
				break;
			}
			map.put(arr[i],i);
		}
		if(f == 0) {
			System.out.println("No Pair Found");
		}

	}

}
