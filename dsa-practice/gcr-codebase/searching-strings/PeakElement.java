
public class PeakElement {

	public static void main(String[] args) {
		int input[] = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(input);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + input[peakIndex]);

	}
	public static int findPeakElement(int input[]) {
		int left = 0;
		int right = input.length-1;
		while(left<right) {
			int mid = (left + right) / 2;
			if(input[mid]>input[mid-1] && input[mid]>input[mid+1]) {
				return mid;
			}else if(input[mid] < input[mid-1]){
				right = mid-1;
			}else {
				left = mid+1;
			}
		}
		return -1;
	}

}
