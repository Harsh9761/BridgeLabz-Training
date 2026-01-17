
public class FindRotationPoint {

	public static void main(String[] args) {
		int input[] = {4, 5, 6, 7, 0, 1, 2};

        int index = findRotationPoint(input);

        System.out.println("Rotation point index: " + index);
        System.out.println("Smallest element: " + input[index]);

	}
	public static int findRotationPoint(int[] input) {

        int left = 0;
        int right = input.length - 1;
        while (left < right) {

            int mid = left + (right - left) / 2;
            if (input[mid] > input[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }

}
