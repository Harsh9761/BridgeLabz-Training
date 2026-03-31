package FutureLogistics;

public class TimberTransport extends GoodsTransport{
	private int vehicleNumber;
    private int timberQuantity;
    private double timberPrice;

    public TimberTransport(String transportId, String transportDate, int rating,
                           String transportType, int vehicleNumber,
                           int timberQuantity, double timberPrice) {
        super(transportId, transportDate, rating, transportType);
        this.vehicleNumber = vehicleNumber;
        this.timberQuantity = timberQuantity;
        this.timberPrice = timberPrice;
    }

    @Override
    public double calculateTotalCharge() {
        return (timberQuantity * timberPrice) + (rating * 300);
    }
}
