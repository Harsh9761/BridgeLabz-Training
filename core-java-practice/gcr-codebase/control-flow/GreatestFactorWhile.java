import java.util.*;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 1;
        int i = 1;
        while(i<num){
            if(num%i==0){
                ans = i;
            }
            i++;
        }
        System.out.println("Greatest factor is: "+ans);
    }
}
