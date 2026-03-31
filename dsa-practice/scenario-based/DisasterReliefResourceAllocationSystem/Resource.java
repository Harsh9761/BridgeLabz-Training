package DisasterReliefResourceAllocationSystem;

public class Resource {
	private String item;
	private int quantity;
	
	public Resource(String item,int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	public String getItem() {
		return item;
	}
	
	public int getQuantity() {
		return quantity;
	}
}
