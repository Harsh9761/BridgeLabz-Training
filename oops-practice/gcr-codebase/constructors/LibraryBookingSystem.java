class LibraryBooking{
	String title;
    String author;
    double price;
    boolean isAvailable;
    
	public LibraryBooking(String title,String author,double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.isAvailable = true;
	}
	
	public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
        }
    }
	
	public void DisplayDetails() {
		System.out.println("Details of the book");
		System.out.println("Title of the book: "+title);
		System.out.println("Author of the book: "+author);
		System.out.println("Price of the book: "+price);
		System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
		System.out.println();
	}
}
public class LibraryBookingSystem {

	public static void main(String[] args) {
		
		 LibraryBooking book1 = new LibraryBooking("Maths","Harshdeep",500.0);
		
		 book1.borrowBook();
		 book1.DisplayDetails();
		 
	     book1.borrowBook();

	}

}
