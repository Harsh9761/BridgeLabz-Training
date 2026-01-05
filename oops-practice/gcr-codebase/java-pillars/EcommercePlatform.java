import java.util.*;
interface Taxable{
	public double calculateTax();
	public String getTaxDetails();
}

abstract class Product{
	private int productId;
	private String name;
	private double price;
	
	public Product(int productId,String name,double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
				
	}
	
	public abstract double discount();
	
	public int getProdectId() {
		return productId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double newPrice) {
		if(newPrice > 0) {
			this.price = newPrice;
		}
	}
	
}

class Electronics extends Product implements Taxable{
	public Electronics(int productId,String name,double price) {
		super(productId,name,price);
	}
	
	@Override
	public double discount() {
		return getPrice()*0.12;
	}
	
	@Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }
	
	@Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}

class Clothing extends Product implements Taxable{
	public Clothing(int productId,String name,double price) {
		super(productId,name,price);
	}
	
	@Override
	public double discount() {
		return getPrice()*0.20;
	}
	
	@Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }
	
	@Override
    public String getTaxDetails() {
        return "12% GST on Clothing";
    }
	
}

class Groceries extends Product{
	public Groceries(int productId,String name,double price) {
		super(productId,name,price);
	}
	@Override
	public double discount() {
		return getPrice()*0.05;
	}
	
}

public class EcommercePlatform {

	public static void main(String[] args) {
		
		ArrayList<Product> product = new ArrayList<>();
		Product p1 = new Electronics(101, "Laptop", 60000);
		Product p2 = new Clothing(102, "Jacket", 3000);
		Product p3 = new Groceries(103, "Rice", 1200);
		product.add(p1);
		product.add(p2);
		product.add(p3);
		
		printFinalPrices(product);

	}
	
	public static void printFinalPrices(ArrayList<Product> products) {
		 for (Product product : products) {
	        double price = product.getPrice();
	        double discount = product.discount();
	        double tax = 0;

	        if (product instanceof Taxable) {
	            tax = ((Taxable) product).calculateTax();
	        }

	        double finalPrice = price + tax - discount;

	        System.out.println("Product : " + product.getName());
	        System.out.println("Base Price : " + price);
	        System.out.println("Discount : " + discount);
	        System.out.println("Tax : " + tax);
	        System.out.println("Final Price : " + finalPrice);
	        System.out.println("-----------------------------");
	    }
	}

}
