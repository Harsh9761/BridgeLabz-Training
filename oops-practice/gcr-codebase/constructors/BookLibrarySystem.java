class BookTwo{
	public String ISBN;
	protected String title;
	private String author;
	
	public BookTwo(String ISBN,String title,String author) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	
	//setter for author
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	//getter for author
	public String getAuthor() {
		return author;
	}
	
}

class Ebook extends BookTwo{
	public Ebook(String ISBN,String title,String author) {
		super(ISBN,title,author);
	}
	
	public void DisplayDetails() {
		System.out.println("ISBN: " + ISBN);       // public access
        System.out.println("Title: " + title);     // protected access
        System.out.println("Author: " + getAuthor()); //private access
	}
}

public class BookLibrarySystem {

	public static void main(String[] args) {
		Ebook book = new Ebook("123","Merchant of Venice","Harshdeep Singh");
		book.DisplayDetails();
		book.setAuthor("Ram");
		book.DisplayDetails();
		System.out.println("author of the book: "+book.getAuthor());
	}

}
