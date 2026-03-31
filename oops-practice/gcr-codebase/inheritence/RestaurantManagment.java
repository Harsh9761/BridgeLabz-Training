class PersonDemo{
	String name;
	int age;
	public PersonDemo(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails() {
		System.out.println("Details: ");
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
	}
}

interface Worker{
	public void performDuties();
}

class Chef extends Person implements Worker{
	public Chef(String name,int age) {
		super(name,age);
	}
	
	public void performDuties() {
		System.out.println("Duties: Cooking food and managing kitchen.");
	}
}

class Waiter extends Person implements Worker{
	public Waiter(String name,int age) {
		super(name,age);
	}
	
	public void performDuties() {
		System.out.println("Duties: Serving food and assisting customers.");
	}
}

public class RestaurantManagment {

	public static void main(String[] args) {
		
		Chef chef = new Chef("Harsh",22);
		Waiter waiter = new Waiter("Ankit",21);
		
		chef.displayDetails();
		chef.performDuties();
		System.out.println();
		
		waiter.displayDetails();
		waiter.performDuties();

	}

}
