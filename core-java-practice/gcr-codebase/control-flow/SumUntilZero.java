
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            sum = sum+num;

        }
        System.out.print(sum);
    }
}
