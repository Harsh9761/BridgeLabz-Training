package RestaurantTableReservationSystem;
import java.util.*;

public class Restaurant {
	Map<Integer, Table> tables = new HashMap<>();
    List<Reservation> reservations = new ArrayList<>();

    // Add tables
    void addTable(int tableNumber) {
        tables.put(tableNumber, new Table(tableNumber));
    }

    // Reserve table
    void reserveTable(int tableNumber, String timeSlot) throws TableAlreadyReservedException {
        for (Reservation r : reservations) {
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                throw new TableAlreadyReservedException("Table already reserved!");
            }
        }
        reservations.add(new Reservation(tableNumber, timeSlot));
        System.out.println("Table " + tableNumber + " reserved for " + timeSlot);
    }

    // Cancel reservation
    void cancelReservation(int tableNumber, String timeSlot) {
        reservations.removeIf(r ->
                r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot));
        System.out.println("Reservation cancelled");
    }

    // Show available tables
    void showAvailableTables(String timeSlot) {
        System.out.println("Available tables for " + timeSlot + ":");
        for (int tableNumber : tables.keySet()) {
            boolean booked = false;
            for (Reservation r : reservations) {
                if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                    booked = true;
                    break;
                }
            }
            if (!booked) {
                System.out.println("Table " + tableNumber);
            }
        }
    }
}
