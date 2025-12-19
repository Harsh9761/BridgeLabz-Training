public class VolOfEarth {
    public static void main(String[] args) {
        double r = 6378;
        double ans =(4*22*r*r*r)/21;
        System.out.print("The volume of earth in cubic kilometers is "+ans+" and cubic miles is "+ans*0.239912758);
    }
}
