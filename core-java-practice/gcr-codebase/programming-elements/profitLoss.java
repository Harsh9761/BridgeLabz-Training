public class ProfitLoss{
    public static void main(String args[]){
        int cp = 129;
        int sp = 191;
        int profit = sp-cp;
        double profitper = (profit*100)/cp;
        System.out.println("The cost price is INR "+cp+" and Selling price is INR "+sp);
        System.out.print("The Profit is INR "+profit+" and profit percentage is INR "+profitper);
    }
}