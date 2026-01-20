package MovieScheduleManager;

public class CinemaTimeApp {

	public static void main(String[] args) {
		
		CinemaTime cinema = new CinemaTime();

        try {
            cinema.addMovie("Inception", "18:30");
            cinema.addMovie("Interstellar", "21:00");
            cinema.addMovie("Avatar", "25:99");
        } catch (InvalidTimeFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nAll Movies:");
        cinema.displayAllMovies();

        System.out.println("\nSearch Result:");
        cinema.searchMovie("Inter");

        cinema.generateReport();

	}

}
