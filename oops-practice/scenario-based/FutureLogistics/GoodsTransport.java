package FutureLogistics;

public abstract class GoodsTransport {
	protected String transportId;
    protected String transportDate;
    protected int rating;
    protected String transportType;

    public GoodsTransport(String transportId, String transportDate, int rating, String transportType) {
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.rating = rating;
        this.transportType = transportType;
    }

    public static boolean validateTransportId(String transportId) {
        if (transportId.matches("[A-Z]{3}[0-9]{3}[A-Z]")) {
            return true;
        } else {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return false;
        }
    }

    public static GoodsTransport parseDetails(String input) {
        String[] data = input.split(":");

        String id = data[0];
        String date = data[1];
        int rating = Integer.parseInt(data[2]);
        String type = data[3];

        if (!validateTransportId(id) || rating < 1 || rating > 5) {
            return null;
        }

        if (type.equals("BrickTransport")) {
            int vehicleNo = Integer.parseInt(data[4]);
            int quantity = Integer.parseInt(data[5]);
            double price = Double.parseDouble(data[6]);
            return new BrickTransport(id, date, rating, type, vehicleNo, quantity, price);
        } 
        else if (type.equals("TimberTransport")) {
            int vehicleNo = Integer.parseInt(data[4]);
            int timberQty = Integer.parseInt(data[5]);
            double price = Double.parseDouble(data[6]);
            return new TimberTransport(id, date, rating, type, vehicleNo, timberQty, price);
        }

        return null;
    }

    public static String findObjectType(GoodsTransport obj) {
        if (obj instanceof BrickTransport)
            return "BrickTransport";
        else if (obj instanceof TimberTransport)
            return "TimberTransport";
        return "Unknown";
    }

    public abstract double calculateTotalCharge();
}
