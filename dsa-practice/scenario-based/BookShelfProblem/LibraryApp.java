package BookShelfProblem;

public class LibraryApp {
	public static void main(String args[]) {
		BookShelf shelf = new BookShelf();

        shelf.addBook("Fiction", new Book("1984", "George Orwell"));
        shelf.addBook("Fiction", new Book("Animal Farm", "George Orwell"));
        shelf.addBook("Technology", new Book("Clean Code", "Robert C. Martin"));

        shelf.displayCatalog();

        shelf.borrowBook("Fiction", "1984");

        shelf.displayCatalog();

        shelf.returnBook("Fiction", new Book("1984", "George Orwell"));

        shelf.displayCatalog();
	}
}
