package EduResultsProblem;

public class EduResultApp {

	public static void main(String[] args) {
		
		Student[] students = {
	            new Student(101, 85),
	            new Student(102, 92),
	            new Student(103, 85),
	            new Student(104, 78)
	    };

	    EduResults.mergeSort(students, 0, students.length - 1);

	    System.out.println("State-wise Rank List:");
	    for (Student s : students) {
	        System.out.println("Roll No: " + s.rollNo + ", Marks: " + s.marks);
	    }

	}

}
