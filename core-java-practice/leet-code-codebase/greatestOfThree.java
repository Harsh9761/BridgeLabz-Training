public class greatestOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 15;
        if(a>b && a>c){
            System.out.print(a);
        }
        else if(b>a && b>c){
            System.out.print(b);
        }
        else{
            System.out.print(c);
        }
    }
}
