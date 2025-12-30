import java.util.*;
public class BookDetails {
	
	String title;
	String author;
	double price;
	
	public BookDetails(String title,String author,double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//Display Details
	public void DisplayDetails() {
		System.out.println("Details of the book");
		System.out.println("Title of the book: "+title);
		System.out.println("Author of the book: "+author);
		System.out.println("Price of the book: "+price);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of the book: ");
		System.out.println("Enter Title of the book: ");
		String title = sc.nextLine();
		
		System.out.println("Enter Author of the book: ");
		String author = sc.nextLine();
		
		System.out.println("Enter Price of the book: ");
		double price = sc.nextDouble();
		
		BookDetails book = new BookDetails(title,author,price);
		book.DisplayDetails();
	}

}
