class Person{
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//Copy Constructor
	public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
	
	public void display() {
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
	}
}
public class PersonDetails {

	public static void main(String[] args) {
		Person person1 = new Person("Harshdeep Singh",18);
		
		Person person2 = new Person(person1);
		
		
		System.out.println("Original Person:");
        person1.display();
        
        System.out.println("Cloned Person:");
        person2.display();

	}

}
