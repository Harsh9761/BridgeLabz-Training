class MovieNode{
	String title;
	String director;
	int yearOfRelease;
	double rating;
	MovieNode next;
	MovieNode prev;
	
	public MovieNode(String title,String director,int yearOfRelease,double rating) {
		this.title = title;
		this.director = director;
		this.yearOfRelease = yearOfRelease;
		this.rating = rating;
		this.next = null;
		this.prev = null;
	}
}

class MovieOperations{
	MovieNode head;
	MovieNode tail;
	
	public void addAtBeginning(String title,String director,int yearOfRelease,double rating) {
		MovieNode newNode = new MovieNode(title,director,yearOfRelease,rating);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	public void addAtEnd(String title,String director,int yearOfRelease,double rating) {
		MovieNode newNode = new MovieNode(title,director,yearOfRelease,rating);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}
	
	public void addAtPosition(int position,String title,String director,int yearOfRelease,double rating) {
		if(position == 1) {
			addAtBeginning(title,director,yearOfRelease,rating);
			return;
		}
		
		MovieNode temp = head;
		for(int i = 1;i < position && temp.next!=null;i++) {
			temp = temp.next;
		}
		
		if(temp == null || temp.next == null) {
			addAtEnd(title,director,yearOfRelease,rating);
			return;
		}
		
		MovieNode newNode = new MovieNode(title,director,yearOfRelease,rating);
		
		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next.prev = newNode;
		temp.next = newNode;
		
	}
	
	public void removeByTitle(String title) {
		MovieNode temp = head;
		while(temp!=null) {
			if(temp.title.equalsIgnoreCase(title)) {
				if(temp == head) {
					head = temp.next;
					if (head != null) head.prev = null;
				}else if(temp == tail) {
					tail= tail.prev;
					tail.next = null;
				}else {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				}
				System.out.println("Movie deleted successfully!");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Movie not found!");
	}
	
	public void searchByDirector(String director) {
		MovieNode temp = head;
		while(temp!=null) {
			if(temp.director.equalsIgnoreCase(director)) {
				System.out.println("Movie Found");
				displayMovie(temp);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Movie not found!");
	}
	
	public void searchByRating(double rating) {
		MovieNode temp = head;
		boolean found = false;
		while(temp!=null) {
			if(temp.rating > rating) {
				
				displayMovie(temp);
				found = true;
			}
			temp = temp.next;
		}
		if(!found)
	    System.out.println("No movies found with rating >= " + rating);
		
	}
	
	public void updateRating(String title,double newRating) {
		MovieNode temp = head;
		while(temp!=null) {
			if(temp.title.equalsIgnoreCase(title)) {
				temp.rating = newRating;
				System.out.println("Rating updated successfully.");
                return;
			}
			temp = temp.next;
		}
		System.out.println("Movie not found!");
	}
	
	public void displayForward() {
		if(head == null) {
			System.out.println("No Movies records are present");
			return;
		}
		MovieNode temp = head;
		while(temp!=null) {
			displayMovie(temp);
			temp = temp.next;
		}
	}
	
	public void displayReverse() {
		if(tail == null) {
			System.out.println("No Movies records are present");
			return;
		}
		MovieNode temp = tail;
		while(temp!=null) {
			displayMovie(temp);
			temp = temp.prev;
		}
	}
	
	public void displayMovie(MovieNode movie) {
		System.out.println("Title: " + movie.title +", Director: " + movie.director +", Year: " + movie.yearOfRelease +", Rating: " + movie.rating);
	}
	
}

public class MovieManagementSystem {

	public static void main(String[] args) {
		MovieOperations movies = new MovieOperations();

        movies.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movies.addAtPosition(2, "Avatar", "James Cameron", 2009, 7.9);

        System.out.println("\nMovies (Forward):");
        movies.displayForward();

        System.out.println("\nMovies (Reverse):");
        movies.displayReverse();

        System.out.println("\nSearch by Director (Christopher Nolan):");
        movies.searchByDirector("Christopher Nolan");

        System.out.println("\nUpdating Rating of Avatar:");
        movies.updateRating("Avatar", 8.1);

        System.out.println("\nRemoving Movie: Inception");
        movies.removeByTitle("Inception");

        System.out.println("\nFinal Movie List:");
        movies.displayForward();

	}

}
