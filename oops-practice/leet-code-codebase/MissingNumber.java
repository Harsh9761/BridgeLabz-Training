
public class MissingNumber {

	public static void main(String[] args) {
		int nums[] = {1,2,4,5};
		int n = nums.length;
        int s1 = (n*(n+1))/2;
        int s2 = 0;
        for(int i = 0;i<n;i++){
            s2 = s2+nums[i];
        }
        System.out.println(s1-s2);;

	}

}
