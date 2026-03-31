package BookShelfProblem;

import java.util.*;

public class BookShelf {
	HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

	
    public void addBook(String genre, Book book) {
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        System.out.println("Added: " + book + " to " + genre);
    }

    
    public void borrowBook(String genre, String title) {
        LinkedList<Book> books = catalog.get(genre);

        if (books == null) {
            System.out.println("Genre not found.");
            return;
        }

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.equals(title)) {
                it.remove();
                System.out.println("Borrowed: " + b);
                return;
            }
        }
        System.out.println("Book not available.");
    }

    
    public void returnBook(String genre, Book book) {
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        System.out.println("Returned: " + book);
    }

    
    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  " + b);
            }
        }
    }
}
