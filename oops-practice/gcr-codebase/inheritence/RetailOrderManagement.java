class Order{
	int orderId;
	String orderDate;
	public Order(int orderId,String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order{
	int trackingNumber;
	public ShippedOrder(int orderId,String orderDate,int trackingNumber) {
		super(orderId,orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	@Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder{
	String deliveryDate;
	public DeliveredOrder(int orderId,String orderDate,int trackingNumber,String deliveryDate) {
		super(orderId,orderDate,trackingNumber);
		this.deliveryDate = deliveryDate;
		
	}
	@Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
	
}

public class RetailOrderManagement {

	public static void main(String[] args) {
		
		Order order1 = new Order(101,"01-01-2026");
		Order order2 = new ShippedOrder(102,"02-01-2026", 581247);
		Order order3 = new DeliveredOrder(103,"03-01-2026", 578724, "05-01-2026");
		
		System.out.println(order1.getOrderStatus());
		System.out.println(order2.getOrderStatus());
		System.out.println(order3.getOrderStatus());
	}

}
