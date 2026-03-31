import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 1;
        for(int i = 1;i<num;i++){
            if(num%i==0){
                ans = i;
            }
        }
        System.out.println("Greatest factor is: "+ans);
    }
}
