public class penDivide {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int ans = pens/students;
        int remaining = pens%students;
        System.out.println("The Pen per Student is "+ans+" the remaining pen not distributed is "+remaining);
    }
}
