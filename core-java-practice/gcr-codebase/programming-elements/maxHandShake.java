import java.util.*;
public class maxHandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = (n*(n-1))/2;
        System.out.println(ans);
    }
}
