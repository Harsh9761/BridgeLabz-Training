import java.util.Scanner;

public class EmployeeDetails {
    String name;
    int employeeId;
    double salary;
    
    public EmployeeDetails(String name,int employeeId,double salary){
    	this.name = name;
    	this.employeeId = employeeId;
    	this.salary = salary;
    }
    
    //display Details
    public void displayDetails() {
    	System.out.println("Details of the Employee");
    	System.out.println("Employee Name is: "+name);
    	System.out.println("Employee Id is: "+employeeId);
    	System.out.println("Salary is: "+salary);
    }
    
    public static void main(String args[]) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter name: ");
    	String name = sc.nextLine();
    	System.out.println("Enter id: ");
    	int id = sc.nextInt();
    	System.out.println("Enter salary: ");
    	double salary = sc.nextDouble();
    	
    	EmployeeDetails details = new EmployeeDetails(name,id,salary);
    	
    	details.displayDetails();
    }
}
