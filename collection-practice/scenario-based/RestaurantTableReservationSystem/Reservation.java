package RestaurantTableReservationSystem;

public class Reservation {
	int tableNumber;
    String timeSlot;

    public Reservation(int tableNumber, String timeSlot) {
        this.tableNumber = tableNumber;
        this.timeSlot = timeSlot;
    }
}
