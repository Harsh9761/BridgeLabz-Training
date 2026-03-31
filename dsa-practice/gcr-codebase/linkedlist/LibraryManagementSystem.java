class BookNode {
    int bookId;
    String title;
    String author;
    String genre;
    boolean available;

    BookNode next;
    BookNode prev;

    public BookNode(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}

class LibraryOperations {
    private BookNode head;
    private BookNode tail;

    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode newBook = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode newBook = new BookNode(id, title, author, genre, available);

        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    public void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {
        if (pos == 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        int count = 1;

        while (count < pos - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, available);
            return;
        }

        BookNode newBook = new BookNode(id, title, author, genre, available);
        newBook.next = temp.next;
        newBook.prev = temp;
        temp.next.prev = newBook;
        temp.next = newBook;
    }

    public void removeById(int id) {
        if (head == null) return;

        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {

                if (temp == head) {
                    head = temp.next;
                    if (head != null)
                        head.prev = null;
                } 
                else if (temp == tail) {
                    tail = temp.prev;
                    tail.next = null;
                } 
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Book removed");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Book not found");
    }

    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Book not found");
    }

    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    public void displayForward() {
        BookNode temp = head;

        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        BookNode temp = tail;

        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    public void countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total books: " + count);
    }

    private void printBook(BookNode book) {
        System.out.println("ID: " + book.bookId +", Title: " + book.title +", Author: " + book.author +", Genre: " + book.genre +", Available: " + book.available);
    }
}


public class LibraryManagementSystem {

	public static void main(String[] args) {
		LibraryOperations library = new LibraryOperations();

        library.addAtEnd(1, "Java Basics", "James", "Programming", true);
        library.addAtEnd(2, "Data Structures", "Mark", "CS", true);
        library.addAtBeginning(3, "Python Intro", "Guido", "Programming", false);

        library.displayForward();

        library.searchByAuthor("Mark");

        library.updateAvailability(3, true);

        library.removeById(2);

        library.displayReverse();

        library.countBooks();

	}

}
