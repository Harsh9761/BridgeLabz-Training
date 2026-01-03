import java.util.*;
public class LibraryManagementSystem {
	static String[] titles = {"Java Programming","Data Structures","Python Basics","Web Development","Operating Systems"};

	static String[] authors = {"James Gosling","Mark Allen","Guido van Rossum","Tim Berners-Lee","Abraham Silberschatz"};

	static boolean[] isAvailable = {true, true, true, true, true};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("All bookDetails :");
		displayBooks();
		
		System.out.println("Enter keyword to search book: ");
		String keyword = sc.next();
		searchBook(keyword);
		
		System.out.println("Enter title of book to be checked out");
		String title = sc.next();
		withdrawBook(title);

	}
	
	public static void displayBooks() {
		for(int i = 0;i< titles.length;i++) {
			System.out.print("Title is: "+titles[i]+" ");
			System.out.print("authors is: "+authors[i]+" ");
			System.out.print("isAvailable : "+(isAvailable[i]?"Available" : "Checked Out"));
			System.out.println();
		}
	}
	
	public static void withdrawBook(String title) {
		for(int i = 0;i < title.length();i++) {
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
	
	public static void searchBook(String keyword) {
		boolean found = false;
		for(int i = 0;i < titles.length;i++) {
			if(titles[i].toLowerCase().contains(keyword)) {
				found = true;
				System.out.print("Title is: "+titles[i]+" ");
				System.out.print("authors is: "+authors[i]+" ");
				System.out.print("isAvailable : "+(isAvailable[i]?"Available" : "Checked Out"));
				System.out.println();
			}
			
		}
		if (!found) {
            System.out.println("No books found with title containing: " + keyword);
        }
	}

}
