class Animal{
	String name;
	int age;
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void makeSound() {
		System.out.println("Animals makes a Sound");
	}
}

class Dog extends Animal{
	public Dog(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
	
}

class Cat extends Animal{
	public Cat(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Cat Meows");
	}
}

class Bird extends Animal{
	public Bird(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Bird Chirps");
	}
}
public class AnimalDemo {

	public static void main(String[] args) {
		Animal a1 = new Dog("Bob",3);
		Animal a2 = new Cat("Cat",2);
		Animal a3 = new Bird("birki",5);
		
		a1.makeSound();
		a2.makeSound();
		a3.makeSound();

	}

}
