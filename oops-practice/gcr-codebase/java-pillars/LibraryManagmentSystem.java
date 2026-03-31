interface Reservable{
	public void reserveItem();
	public boolean checkAvailability();
}

abstract class LibraryItem{
	private int itemId;
	private String title;
	private String author;
	public LibraryItem(int itemId,String title,String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}
	
	public abstract int getLoanDuration();
	
	private String borrowerName;
	
	public void getItemDetails() {
		System.out.println("Item Details: ");
		System.out.println("Item ID: "+itemId);
		System.out.println("Item Title: "+title);
		System.out.println("Item Author: "+author);
		
	}
	
	public void setBorrowerName(String name) {
        this.borrowerName = name;
    }

    public String getBorrowerName() {
        return borrowerName;
    }
}

class Book extends LibraryItem implements Reservable{
	private boolean available = true;
	
	
	public Book(int itemId,String title,String author) {
		super(itemId,title,author);
	}
	
	@Override
	public int getLoanDuration() {
		return 14;
	}
	
	@Override
	public void reserveItem() {
		available = false;
		System.out.println("Book is reserved!");
	}
	
	@Override
	public boolean checkAvailability() {
		return available;
	}
	
}

class Magazine extends LibraryItem implements Reservable{
	private boolean available = true;
	
	
	public Magazine(int itemId,String title,String author) {
		super(itemId,title,author);
	}
	
	@Override
	public int getLoanDuration() {
		return 7;
	}
	
	@Override
	public void reserveItem() {
		available = false;
		System.out.println("Magazine is reserved!");
	}
	
	@Override
	public boolean checkAvailability() {
		return available;
	}
	
}

class DVD extends LibraryItem implements Reservable{
	private boolean available = true;
	
	
	public DVD(int itemId,String title,String author) {
		super(itemId,title,author);
	}
	
	@Override
	public int getLoanDuration() {
		return 5;
	}
	
	@Override
	public void reserveItem() {
		available = false;
		System.out.println("DVD is reserved!");
	}
	
	@Override
	public boolean checkAvailability() {
		return available;
	}
	
}

public class LibraryManagmentSystem {

	public static void main(String[] args) {
		
		LibraryItem book = new Book(1, "Java Basics", "James Gosling");
        LibraryItem magazine = new Magazine(2, "Tech Today", "Editorial Team");
        LibraryItem dvd = new DVD(3, "Java Tutorial", "Oracle");

        LibraryItem[] items = { book, magazine, dvd };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable rev = (Reservable) item;
                System.out.println("Available: " + rev.checkAvailability());
                rev.reserveItem();
            }

            System.out.println("----------------------------");
        }

	}

}
