class Product{
	static double discount = 10;
	
	final int productId;
	String productName;
	double price;
	int quantity;
	public Product(int productId,String productName,double price,int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void displayDetails() {
		if(this instanceof Product) {
			System.out.println("Product Details: ");
			System.out.println("Product ID: "+productId);
			System.out.println("Product Name: "+productName);
			System.out.println("Product price: "+price);
			System.out.println("Product Discount: "+discount+" %");
			double discountPrice = price - (price*discount)/100;
			System.out.println("Discounted Price: "+discountPrice);
			System.out.println();
		}
		else {
			System.out.println("Inavlid Instance object");
		}
	}
	
	
	public static void updateDiscount(double newDiscount) {
		discount = newDiscount;
	}
}
public class ShoppingCartSystem {

	public static void main(String[] args) {
		Product product1 = new Product(101,"Iphone",50000,2);
		product1.displayDetails();
		Product.updateDiscount(15);
		Product product2 = new Product(101,"Laptop",60000,1);
		product2.displayDetails();

	}

}
