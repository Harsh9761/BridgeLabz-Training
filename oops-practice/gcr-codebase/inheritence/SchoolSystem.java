class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails() {
		System.out.println("Details: ");
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
	}
	
}

class Teacher extends Person{
	String subject;
	public Teacher(String name,int age,String subject) {
		super(name,age);
		this.subject = subject;
	}
	
	public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person{
	String grade;
	public Student(String name,int age,String grade) {
		super(name,age);
		this.grade = grade;
	}
	
	public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person{
	String department;
	public Staff(String name,int age,String department) {
		super(name,age);
		this.department = department;
	}
	
	public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Shardul",25,"DSA");
		Student student = new Student("Harsh",22,"A");
		Staff staff = new Staff("Kuldip",21,"Managment");
		
		teacher.displayDetails();
		teacher.displayRole();
		System.out.println();
		
		student.displayDetails();
		student.displayRole();
		System.out.println();
		
		staff.displayDetails();
		staff.displayRole();

	}

}
