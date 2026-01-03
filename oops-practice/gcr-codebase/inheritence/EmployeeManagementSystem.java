class Employee{
	String name;
	int id;
	double salary;
	public Employee(String name,int id,double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee Details: ");
		System.out.println("Enmployee name: "+name);
		System.out.println("Enmployee id: "+id);
		System.out.println("Enmployee salary: "+salary);
	}
}

class Manager extends Employee{
	int teamSize;
	public Manager(String name,int id,double salary,int teamSize) {
		super(name,id,salary);
		this.teamSize = teamSize;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("TeamSize is: "+teamSize);
	}
}

class Developer extends Employee{
	String ProgrammingLanguage;
	public Developer(String name,int id,double salary,String ProgrammingLanguage) {
		super(name,id,salary);
		this.ProgrammingLanguage = ProgrammingLanguage;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("ProgrammingLanguage is: "+ProgrammingLanguage);
	}
}

class Intern extends Employee{
	int durationMonths;
	public Intern(String name,int id,double salary,int durationMonths) {
		super(name,id,salary);
		this.durationMonths = durationMonths;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("durationMonths is: "+durationMonths);
	}
}

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Employee manager = new Manager("Harsh",101,100000,5);
		Employee developer = new Developer("Ankit",102,50000,"Java");
		Employee intern = new Intern("Krishna",103,80000,6);
		
		manager.displayDetails();
		developer.displayDetails();
		intern.displayDetails();

	}

}
