
public class rearrangeArray {

	public static void main(String[] args) {
		int arr[] = {3,1,-2,-5,2,-4};
		rearrangeArr(arr);
		for(int i = 0;i < 6;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}
	public static int[] rearrangeArr(int[] nums) {
	        
	     int n = nums.length;
	     int arr[] = new int[n];
	     int b0 = 0;
	     int b1 = 1;
	     for(int i = 0;i<n;i++){
	         if(nums[i]>0){
	             arr[b0] = nums[i];
	             b0 += 2;
	         }
	         if(nums[i]<0){
	             arr[b1] = nums[i];
	             b1 += 2;
	         }
	     }
	     return arr;
	 }

}
