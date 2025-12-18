import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int subtract = a-b;
        int multiply = a*b;
        int divide = a/b;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers");
        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);

    }
}
