class Book{
	String title;
	int publicationYear;
	public Book(String title,int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
	public void displayDetails() {
		System.out.println();
		System.out.println("Book Details: ");
		System.out.println("Book title is: "+title);
		System.out.println("Book publicationYear is: "+publicationYear);
	}
}

class Author extends Book{
	String name;
	String bio;
	public Author(String title,int publicationYear,String name,String bio) {
		super(title,publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Author name: "+name);
		System.out.println("Author bio: "+bio);
	}
}
public class LibraryManagementSystem {

	public static void main(String[] args) {
		Author book = new Author("Clean Code",2008,"Robert C. Martin","Software engineer and author");

        book.displayDetails();

	}

}
