import java.util.Scanner;

public class HarshadNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            sum = sum + (n%10);
            n = n/10;
        }
        if(n%sum==0)
            System.out.print("Harshad Number");
        else
            System.out.println("Not Harshad Number");
    }
}
