interface Discountable{
	public double applyDiscount();
	public String getDiscountDetails();
	
}

abstract class FoodItem{
	private String itemName;
	private double price;
	private int quantity;
	public FoodItem(String itemName,double price,int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getItemName() {
        return itemName;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }
	
	public abstract double calculateTotalPrice();
	
	public void getItemDetails() {
		System.out.println("Item Details: ");
		System.out.println("Item Details: "+itemName);
		System.out.println("Item Details: "+price);
		System.out.println("Item Details: ");
	}
	
}

class VegItem extends FoodItem implements Discountable{
	public VegItem(String itemName,double price,int quantity) {
		super(itemName,price,quantity);
	}
	
	@Override
	public double calculateTotalPrice() {
		return getPrice()*getQuantity();
	}
	
	@Override
	public double applyDiscount() {
		return calculateTotalPrice() * 0.10;
	}
	
	@Override
	public String getDiscountDetails() {
		return "10% discount on Veg Items";
	}
}

class NonVegItem extends FoodItem implements Discountable{
	public NonVegItem(String itemName,double price,int quantity) {
		super(itemName,price,quantity);
	}
	
	@Override
	public double calculateTotalPrice() {
		double extraCharge = 50;
		return getPrice()*getQuantity()+extraCharge;
	}
	
	@Override
	public double applyDiscount() {
		return calculateTotalPrice() * 0.15;
	}
	
	@Override
	public String getDiscountDetails() {
		return "15% discount on Non-Veg Items";
	}
}

public class BookDeliverySystem {

	public static void main(String[] args) {
		FoodItem veg = new VegItem("Paneer Burger", 120, 2);
        FoodItem nonveg = new NonVegItem("Chicken Pizza", 250, 1);

        FoodItem[] items = { veg, nonveg };
        
        double finalPrice = 0;

        for (FoodItem item : items) {
            item.getItemDetails();

            double total = item.calculateTotalPrice();
            System.out.println("Total Price: " + total);

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
                double discount = d.applyDiscount();
                System.out.println("Discount: " + discount);
                total -= discount;
            }

            System.out.println("Final Amount: " + total);
            finalPrice += total;
            System.out.println("--------------------------");
        }

        System.out.println("Grand Total Payable: " + finalPrice);

	}

}
