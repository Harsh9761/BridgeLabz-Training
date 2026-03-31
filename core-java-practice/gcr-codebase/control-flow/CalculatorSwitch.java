import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        char operat = sc.next().charAt(0);
        double ans = 0;
        switch(operat){
            case '+':
                ans = num1+num2;
                System.out.println("Sum is: "+ans);
                break;
            case '-':
                ans = num1-num2;
                System.out.println("Subtract is: "+ans);
                break;
            case '*':
                ans = num1*num2;
                System.out.println("Multiplication is: "+ans);
                break;
            case '/':
                if(num2!=0){
                    ans = num1/num2;
                    System.out.println("Division is: "+ans);
                }
                else{
                    System.out.println("Division By Zero Error");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
