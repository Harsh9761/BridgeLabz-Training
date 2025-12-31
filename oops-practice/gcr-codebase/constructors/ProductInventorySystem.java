class ProductInventory{
	String productName;
	double price;
	
	static int totalProducts = 0;
	
	public ProductInventory(String productName,double price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	public void display() {
		System.out.println("Product Details: ");
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+price);
		
	}
	
	public static void totalDisplay() {
		System.out.println("Total Products : "+totalProducts);
	}
}
public class ProductInventorySystem {

	public static void main(String[] args) {
		ProductInventory product1 = new ProductInventory("Iphone",50000.0);
		ProductInventory product2 = new ProductInventory("Laptop",60000.0);
		product1.display();
		product2.display();
		
		ProductInventory.totalDisplay();

	}

}
