
public class ItemDetails {
//	Attributes
	String itemCode;
	double itemPrice;
	String itemName;
	//constructor
	public ItemDetails(String itemCode,double itemPrice,String itemName) {
		this.itemCode = itemCode;
		this.itemPrice = itemPrice;
		this.itemName = itemName;
	}
	//Display details
	public void DisplayDetails() {
		System.out.println("itemCode: "+itemCode);
		System.out.println("itemPrice: "+itemPrice);
		System.out.println("itemName: "+itemName);
	}
		
	public static void main(String[] args) {
		
		ItemDetails item1 = new ItemDetails("01AA",500.0,"Water bottle");
		ItemDetails item2 = new ItemDetails("01BB",700.0,"Rice");
		ItemDetails item3 = new ItemDetails("02AA",400.0,"blackboard");
		
		item1.DisplayDetails();
		item2.DisplayDetails();
		item3.DisplayDetails();
		
	}

}
