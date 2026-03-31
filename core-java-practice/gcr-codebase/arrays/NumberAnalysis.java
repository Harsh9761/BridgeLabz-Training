
import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int num[] = new int[len];
        for(int i = 0;i<len;i++){
            num[i] = sc.nextInt();
            if (num[i] > 0) {
                System.out.print("Positive and ");
                if (num[i] % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else if (num[i] < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
        if (num[0] == num[len-1]) {
            System.out.println("First and last elements are Equal");
        } else if (num[0] > num[len-1]) {
            System.out.println("First element is Greater than last element");
        } else {
            System.out.println("First element is Less than last element");
        }
    }
}
