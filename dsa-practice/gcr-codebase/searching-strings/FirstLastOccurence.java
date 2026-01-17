
public class FirstLastOccurence {

	public static void main(String[] args) {
		int input[] = {2, 4, 4, 4, 6, 7, 8};
        int target = 4;

        int first = findFirst(input, target);
        int last = findLast(input, target);
        if (first == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First Occurrence Index: " + first);
            System.out.println("Last Occurrence Index: " + last);
        }

	}
	public static int findFirst(int input[], int target) {

        int left = 0;
        int right = input.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (input[mid] == target) {
            	ans = mid;
                right = mid - 1;
            } 
            else if (input[mid] > target) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public static int findLast(int input[], int target) {

        int left = 0;
        int right = input.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (input[mid] == target) {
            	ans = mid;
                left = mid + 1;
            } 
            else if (input[mid] > target) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }

        return ans;
    }

}
