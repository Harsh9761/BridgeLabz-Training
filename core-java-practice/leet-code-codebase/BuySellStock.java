
public class BuySellStock {

	public static void main(String[] args) {
		int price[] = {7,1,5,3,6};
		int n = price.length;
        int buy = price[0];
        int max = 0;
        for(int i = 1;i<n;i++){
            if(price[i]<buy){
                buy = price[i];
            }
            else if(price[i]-buy>max){
                max = price[i]-buy;
            }
        }
        for(int i = 0;i<n;i++) {
        	System.out.println(price[i]);
        }

	}

}
