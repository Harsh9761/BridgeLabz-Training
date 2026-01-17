package AddressBookProblem;

public class Contact {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	long phoneNumber;
	String mail;
	public Contact(String firstName,String lastName,String address,String city,String state,int zip,long phoneNumber,String mail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.mail = mail;
		
	}
}
