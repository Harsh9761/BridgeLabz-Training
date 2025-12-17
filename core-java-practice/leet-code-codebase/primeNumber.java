// package core-java-practice.leet-code-codebase;

public class primeNumber {
    public static void main(String[] args) {
        int n = 6;
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
