public class FirstNegativeSearch {

	public static void main(String[] args) {
		int input[] = {4,8,3,-2,10,-5};

        int result = findFirstNegative(input);

        if (result != -1) {
            System.out.println("First negative number found at index: " + result);
        } else {
            System.out.println("No negative number found");
        }

	}
	public static int findFirstNegative(int input[]) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                return i;
            }
        }
        return -1;
    }

}
