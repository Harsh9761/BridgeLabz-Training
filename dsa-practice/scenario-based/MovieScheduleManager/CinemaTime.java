package MovieScheduleManager;

import java.util.*;

public class CinemaTime {
	private List<String> movieTitles = new ArrayList<>();
    private List<String> showTimes = new ArrayList<>();

    
    private void validateTime(String time) throws InvalidTimeFormatException {
        if (!time.matches("\\d{2}:\\d{2}")) {
            throw new InvalidTimeFormatException("Time must be in HH:MM format.");
        }

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);

        if (hour > 23 || min > 59) {
            throw new InvalidTimeFormatException("Invalid time value: " + time);
        }
    }

    
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        validateTime(time);
        movieTitles.add(title);
        showTimes.add(time);
    }

    
    public void searchMovie(String keyword) {
        boolean found = false;
        try {
            for (int i = 0; i < movieTitles.size(); i++) {
                if (movieTitles.get(i).contains(keyword)) {
                    System.out.println(
                        String.format("Found: %s at %s", movieTitles.get(i), showTimes.get(i))
                    );
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No matching movie found.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error while searching movies.");
        }
    }

    
    public void displayAllMovies() {
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println(
                movieTitles.get(i) + " - Show Time: " + showTimes.get(i)
            );
        }
    }

    
    public void generateReport() {
        String[] moviesArray = movieTitles.toArray(new String[0]);

        System.out.println("\nPrintable Movie Report:");
        for (String movie : moviesArray) {
            System.out.println(movie);
        }
    }
}
