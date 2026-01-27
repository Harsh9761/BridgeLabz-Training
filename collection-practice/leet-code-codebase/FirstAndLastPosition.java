
public class FirstAndLastPosition {

	public static void main(String[] args) {
		int nums[] = {5,7,7,8,8,10};
		int target = 8;
		
		int c = 0;
        int arr[] = new int[2];
        int n = nums.length;
        for(int i = 0;i<nums.length;i++){
            
            
            if(nums[i]==target){
                arr[0]=i;
                c++;
                break;

            }
        }
        for(int i = 0;i<nums.length;i++){
            
            if(nums[n-i-1]==target){
                arr[1]=n-i-1;
                c++;
                break;
            }
        }
        if(c==0){
            arr[0]=-1;
            arr[1]=-1;
        }
        for(int i = 0;i < 2;i++) {
        	System.out.println(arr[i]);
        }

	}

}
