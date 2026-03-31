class Student{
	static String UniversityName = "GLA University";
	static int totalStudents = 0;
	
	String name;
	final int rollNumber;
	String grade;
	public Student(String name,int rollNumber,String grade) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		totalStudents++;
	}
	
	public void displayDetails() {
		if(this instanceof Student) {
			System.out.println("Student Details: ");
			System.out.println("Student Name: "+name);
			System.out.println("Student rollNumber: "+rollNumber);
			System.out.println("Student Grade: "+grade);
			System.out.println();
		}
		else {
			System.out.println("Inavlid Instance object");
		}
		
	}
	
	public static void displayTotalStudents() {
		System.out.println("Total Students: "+totalStudents);
	}
	
	
}
public class UniversityManagementSystem {

	public static void main(String[] args) {
		Student student1 = new Student("Harshdeep Singh",101,"A");
		
		Student student2 = new Student("Ram",102,"B");
		
		student1.displayDetails();
		student2.displayDetails();
		Student.displayTotalStudents();

	}

}
