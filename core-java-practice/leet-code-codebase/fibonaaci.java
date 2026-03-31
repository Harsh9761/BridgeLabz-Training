// package core-java-practice.leet-code-codebase;

public class fibonaaci {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0;i<n;i++){
            System.out.print(c+" ");
            c = a+b;
            a = b;
            b = c;    
        }
    }
}
