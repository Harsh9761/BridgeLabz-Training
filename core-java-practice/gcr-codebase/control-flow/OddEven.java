
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Even Numbers");
        for(int i = 0;i<=num;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("Odd Numbers");
        for(int i = 0;i<=num;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
