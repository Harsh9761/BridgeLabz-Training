class Employee{
	static String companyName = "Google";
	static int totalEmployees = 0;
	
	final int employeeId;
    String employeeName;
    String designation;
    
    public Employee(int employeeId,String employeeName,String designation) {
    	this.employeeId = employeeId;
    	this.employeeName = employeeName;
    	this.designation = designation;
    	totalEmployees++;
    }
    
    public void displayDetails() {
        if(this instanceof Employee) {
        	System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Designation: "+designation);
            System.out.println();
        }else {
        	System.out.println("Invalid Instance!!");
        }
    }
    
    public static void displayTotalEmployees() {
    	System.out.println("Total Employees is: "+totalEmployees);
    }
}
public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101,"Harshdeep Singh","IT");
		Employee employee2 = new Employee(102,"Ram","IT");
		
		employee1.displayDetails();
		employee2.displayDetails();
		
		Employee.displayTotalEmployees();

	}

}
