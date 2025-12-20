import java.util.*;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        int i = 1;
        while(i<=num){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
