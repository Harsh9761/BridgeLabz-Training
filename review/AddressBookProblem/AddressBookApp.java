package AddressBookProblem;

public class AddressBookApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Contact contact1 = new Contact("Harshdeep","Singh","Nagar","Mathura","UP",281004,976186900,"abc@gmail.com");
		Contact contact2 = new Contact("Ankit","Singh","Nagar","Mathura","UP",281004,789254512,"xyz@gmail.com");
		
		AddressBookService book = new AddressBookService();
		
		book.addContact(contact1);
		book.addContact(contact2);
		book.displayAll();
		
		
		book.editPhoneNumber("Harshdeep", 701762251);
		book.editCity("Harshdeep", "Agra");
		book.editMail("Harshdeep", "newmail@gmail.com");
		
		book.displayAll();
	}

}
