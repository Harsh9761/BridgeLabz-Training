class StudentNode{
	int rollNumber;
	String name;
	int age;
	String grade;
	StudentNode next;
	public StudentNode(int rollNumber,String name,int age,String grade) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
	
}

class StudentOperations{
	StudentNode head;
	
	public void addAtBeginning(int rollNumber,String name,int age,String grade) {
		StudentNode newNode = new StudentNode(rollNumber,name,age,grade);
		newNode.next = head;
		head = newNode;
	}
	
	public void addAtEnd(int rollNumber,String name,int age,String grade) {
		StudentNode newNode = new StudentNode(rollNumber,name,age,grade);
		if(head == null) {
			head = newNode;
			return;
		}
		
		StudentNode temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public void addAtPosition(int position,int rollNumber,String name,int age,String grade) {
		if(position == 1) {
			addAtBeginning(rollNumber,name,age,grade);
			return;
		}
		StudentNode newNode = new StudentNode(rollNumber,name,age,grade);
		StudentNode temp = head;
		
		for(int i = 1;i < position-1 && temp!=null;i++) {
			temp = temp.next;
		}
		
		if(temp == null) {
			System.out.println("Invalid Position!");
			return;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
	
	public void deleteByRollNum(int rollnumber) {
		if(head == null) {
			System.out.println("List is Empty.");
			return;
		}
		if(head.rollNumber == rollnumber) {
			head = head.next;
			System.out.println("Student record deleted successfully");
			return;
		}
		StudentNode temp = head;
		while(temp.next!=null && temp.next.rollNumber!=rollnumber) {
			temp = temp.next;
		}
		
		if(temp.next == null) {
			System.out.println("Record not Found!");
		}else {
			temp.next = temp.next.next;
			System.out.println("Student deleted successfully");
		}
		
	}
	
	public void searchByRollNum(int rollnumber) {
		StudentNode temp = head;
		while(temp != null) {
			if(temp.rollNumber == rollnumber) {
				System.out.println("Student found");
				displayStudent(temp);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Student not found!");
	}
	
	public void updateGrade(int rollNumber,String newGrade) {
		StudentNode temp = head;
		while(temp != null) {
			if(temp.rollNumber == rollNumber) {
				temp.grade = newGrade;
				System.out.println("Grade updated successfully.");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Student not found!");
	}
	
	public void displayAll() {
		if(head == null) {
			System.out.println("No records present");
			return;
		}
		
		StudentNode temp = head;
		while(temp!=null) {
			displayStudent(temp);
			temp = temp.next;
		}
	}
	
	public void displayStudent(StudentNode student) {
		System.out.println("Roll number: "+student.rollNumber);
		System.out.println("Name: "+student.name);
		System.out.println("Age: "+student.age);
		System.out.println("Grade: "+student.grade);
		System.out.println();
	}
}

public class StudentRecordManagement {

	public static void main(String[] args) {
		StudentOperations record = new StudentOperations();
		
		record.addAtBeginning(101, "Aman", 20, "A");
        record.addAtEnd(102, "Riya", 21, "B");
        record.addAtPosition(2, 103, "Neha", 22, "A");

        System.out.println("\nAll Student Records:");
        record.displayAll();

        System.out.println("\nSearching Roll No 102:");
        record.searchByRollNum(102);

        System.out.println("\nUpdating Grade for Roll No 103:");
        record.updateGrade(103, "A");

        System.out.println("\nDeleting Roll No 101:");
        record.deleteByRollNum(101);

        System.out.println("\nFinal Student Records:");
        record.displayAll();

	}

}
