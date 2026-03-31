
public class ContainsDuplicate {

	public static void main(String[] args) {
		int nums[] = {1,1,2,3,4,5};
		int f = 1;
		 for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] == nums[j]) {
	                	f = 0;
	                    System.out.println("Arraays contains Duplicates");
	                    break;
	                }
	            }
	        }
	        if(f==1) {
	        	System.out.println("Arraays does not contains Duplicates");
	        }

	}

}
