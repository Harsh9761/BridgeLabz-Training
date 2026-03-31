
public class FindDulicateProblem {

	public static void main(String[] args) {
		int arr[] = {3,25,7,8};
		int k = removeElement(arr,3);
		System.out.println(k);

	}
	public static int removeElement(int arr[],int val){
        int n = arr.length;
        int nums[] = new int[n];
        for(int i = 0;i<n;i++){
            nums[i]=arr[i];
        }
        
        
        int k = 0;
         for(int i = 0;i<n;i++){
            if(nums[i]!=val){
                arr[k]=nums[i];
                k++;
            }
        }
        
        return k;

    }

}
