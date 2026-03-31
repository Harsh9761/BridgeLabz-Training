package RestaurantTableReservationSystem;

public class Main {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant();

        restaurant.addTable(1);
        restaurant.addTable(2);
        restaurant.addTable(3);

        try {
            restaurant.reserveTable(1, "7PM");
            restaurant.reserveTable(2, "7PM");
            restaurant.reserveTable(1, "7PM");
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        restaurant.showAvailableTables("7PM");

        restaurant.cancelReservation(1, "7PM");
        restaurant.showAvailableTables("7PM");

	}

}
