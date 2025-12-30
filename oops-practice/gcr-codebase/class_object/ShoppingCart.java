
class CartItem{
	String itemName;
	double price;
	int quantity;
	
	
	public void addItem(String itemName,double price,int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		
		System.out.println("Item added name: "+itemName);
		System.out.println("Item added price: "+price);
	}
	
	void removeItem(int removeCount) {
		if (quantity >= removeCount) {
            quantity -= removeCount;
            System.out.println("Item removed from cart: " + itemName);
        } else {
            System.out.println("Cannot remove. Not enough quantity");
        }
    }
	
	public void displayTotalCost() {
		double totalcost = price*quantity;
		System.out.println("Total Cost is: "+totalcost);
	}
}
public class ShoppingCart {

	public static void main(String[] args) {
		CartItem cart = new CartItem();

        cart.addItem("Laptop", 9999.0, 3);
        cart.displayTotalCost();

        cart.removeItem(1);
        cart.displayTotalCost();

	}

}
