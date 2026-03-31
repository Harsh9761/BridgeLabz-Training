class Library{
	static String libraryName = "Central Library";
	public static void displayLibraryName() {
		System.out.println("LibraryName is: "+libraryName);
	}
	
	final String ISBN;
	String title;
	String author;
	
	public Library(String ISBN,String title,String author) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	
	public void DisplayDetails() {
		if(this instanceof Library) {
			System.out.println("ISBN: " + ISBN); 
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
		}else {
			System.out.println("Invalid Instance");
		}
	}
}
public class LibraryManagementSystem {

	public static void main(String[] args) {
		Library book1 = new Library("978-0134685991","Effective Java","Joshua Bloch");
		book1.DisplayDetails();
		Library.displayLibraryName();

	}

}
