package AddressBookProblem;
import java.util.*;
public class AddressBookService{
	
	Contact contact;

	ArrayList<Contact> contacts = new ArrayList<>();
	
	
	//Add contact
	public void addContact(Contact input) {
		contacts.add(input);
	}
	
	//display Contacts
	public void displayAll() {
		System.out.println("Contact Details: ");
		for(Contact output : contacts) {
			
			System.out.println("Contact firstName is: "+output.firstName);
			System.out.println("Contact lastName is: "+output.lastName);
			System.out.println("Contact address is: "+output.address);
			System.out.println("Contact city is: "+output.city);
			System.out.println("Contact state is: "+output.state);
			System.out.println("Contact zip is: "+output.zip);
			System.out.println("Contact Number is: "+output.phoneNumber);
			System.out.println("Contact Mail is: "+output.mail);
			System.out.println();
		}
	}
	
	//Edit Number
	public void editPhoneNumber(String name,long newNumber) {
		for(Contact cont: contacts) {
			if(cont.firstName.equalsIgnoreCase(name)) {
				cont.phoneNumber = newNumber;
			}
		}
	}
	
	//Edit City
	public void editCity(String name,String newCity) {
		for(Contact cont: contacts) {
			if(cont.firstName.equalsIgnoreCase(name)) {
				cont.city = newCity;
			}
		}
	}
	
	//Edit Mail
		public void editMail(String name,String newMail) {
			for(Contact cont: contacts) {
				if(cont.firstName.equalsIgnoreCase(name)) {
					cont.mail = newMail;
				}
			}
		}
	
}
