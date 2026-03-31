
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        if(n<2){
            System.out.print("Not Prime");
        }
        else{
            for(int i = 2;i*i<=n;i++){
                if(n%i==0){
                    f = 1;
                    break;
                }
                System.out.print("Prime Number");
            }
            
        }
        if(n>2 && f==1){
            System.out.print("Not prime");
        }
    }
}
