package FutureLogistics;

public class BrickTransport extends GoodsTransport{
	private int vehicleNumber;
    private int quantity;
    private double brickPrice;

    public BrickTransport(String transportId, String transportDate, int rating,
                          String transportType, int vehicleNumber,
                          int quantity, double brickPrice) {
        super(transportId, transportDate, rating, transportType);
        this.vehicleNumber = vehicleNumber;
        this.quantity = quantity;
        this.brickPrice = brickPrice;
    }

    @Override
    public double calculateTotalCharge() {
        return (quantity * brickPrice) + (rating * 200);
    }

    public void display() {
        System.out.println("\nTransporter id : " + transportId);
        System.out.println("Date of transport : " + transportDate);
        System.out.println("Rating of the transport : " + rating);
        System.out.println("Quantity of bricks : " + quantity);
        System.out.println("Brick price : " + brickPrice);
        System.out.println("Vehicle for transport : MonsterLorry");
        System.out.println("\nTotal charge : " + calculateTotalCharge());
    }
}
