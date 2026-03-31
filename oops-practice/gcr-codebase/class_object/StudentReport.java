import java.util.*;
class Student{
	String name;
	int rollNumber;
	double marks[];
	
	//constructor
	public Student(String name,int rollNumber,double marks[]) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	public double calculateTotalMarks(){
        return Math.round((marks[0]+marks[1]+marks[2])*100/3)/100.0;
    }
	
	public String calculateGrade() {
		double totalMarks = calculateTotalMarks();
		if (totalMarks >= 90) {
            return "A+";
        } else if (totalMarks >= 80) {
            return "A";
        } else if (totalMarks >= 70) {
            return "B";
        } else if (totalMarks >= 60) {
            return "C";
        } else if (totalMarks >= 50) {
            return "D";
        } else {
            return "F";
        }
	}
	
	public void displayReport() {
		System.out.println("Report Card");
		System.out.println("Student Name: "+name);
		System.out.println("Student RollNumber: "+rollNumber);
		for(int i = 0;i < 3;i++) {
			System.out.println("Marks of subject "+(i+1)+" : " + marks[i]);
		}
		System.out.println("Grade is: "+calculateGrade());
	}
}



public class StudentReport {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Roll Number: ");
		int rollNumber = sc.nextInt();
		
		System.out.println("Enter 3 subjects marks");
		double marks[] = new double[3];
		for(int i = 0;i < 3;i++) {
			marks[i] = sc.nextDouble();
		}
		
		Student student = new Student(name,rollNumber,marks);
		student.displayReport();
	}

}
