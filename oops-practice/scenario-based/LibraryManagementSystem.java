import java.util.*;
public class LibraryManagementSystem {
	static String[] titles = {"Java Programming","Data Structures","Python Basics","Web Development","Operating Systems"};

	static String[] authors = {"James Gosling","Mark Allen","Guido van Rossum","Tim Berners-Lee","Abraham Silberschatz"};

	static boolean[] isAvailable = {true, true, true, true, true};
	
	static List<Integer> bookList = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < titles.length; i++) {
            bookList.add(i);
        }
		System.out.println("All bookDetails :");
		displayBooks();
		
		System.out.println("Enter keyword to search book: ");
		String keyword = sc.next();
		searchBook(keyword);
		
		System.out.println("Enter title of book to be checked out");
		String title = sc.next();
		try {
            withdrawBook(title);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

	}
	
	public static void displayBooks() {
		for(int i = 0;i< titles.length;i++) {
			System.out.print("Title is: "+titles[i]+" ");
			System.out.print("authors is: "+authors[i]+" ");
			System.out.print("isAvailable : "+(isAvailable[i]?"Available" : "Checked Out"));
			System.out.println();
		}
	}
	
	public static void withdrawBook(String title) throws BookNotAvailableException{
		for(int i = 0;i < titles.length;i++) {
			if(titles[i].equalsIgnoreCase(title)) {
				isAvailable[i] = false;
				System.out.println("Book checkedout successfully.");
			}
			else {
				System.out.println("Book is not available");
			}
			return;
		}
		System.out.println("Book not found.");
	}
	
	public static void searchBook(String keyword){
		boolean found = false;

        for (int i : bookList) {
            if (titles[i].toLowerCase().contains(keyword.toLowerCase())) {
                found = true;
                System.out.println(
                    "Title: " + titles[i] +
                    " | Author: " + authors[i] +
                    " | Status: " + (isAvailable[i] ? "Available" : "Checked Out")
                );
            }
        }

        if (!found) {
            System.out.println("No books found with keyword: " + keyword);
        }
	}

}

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}
