public class discountAmount {
    public static void main(String[] args) {
        double fee = 125000;
        // double dispercent = 10;
        double discount = 0.1*125000;
        double discountedAmount = fee-discount;
        System.out.print("The discount amount is INR "+discount+" final discounted fees is "+discountedAmount);
    }
}
