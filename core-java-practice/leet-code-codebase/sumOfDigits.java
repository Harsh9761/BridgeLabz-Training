// package core-java-practice.leet-code-codebase;

public class sumOfDigits {
    public static void main(String[] args) {
        int n = 121;
        int sum = 0;
        while(n>0){
            sum = sum + (n%10);
            n = n/10;
        }
        System.out.print(sum);
    }
}
