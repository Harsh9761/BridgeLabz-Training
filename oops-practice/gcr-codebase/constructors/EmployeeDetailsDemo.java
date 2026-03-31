class Employee{
    public int employeeId;
    protected String department;
    private double salary;
    
    public Employee(int employeeId,String department,double salary){
    	this.employeeId = employeeId;
    	this.department = department;
    	this.salary = salary;
    }
    
    //getter
    public double getSalary() {
    	return salary;
    }
    //setter
    public void setSalary(double salary) {
    	this.salary = salary;
    }
    
}

class Manager extends Employee{
	String role;
	
	Manager(int employeeID, String department, double salary, String role) {
	     super(employeeID, department, salary);
	     this.role = role;
	}
	
	public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);     // public
        System.out.println("Department: " + department);     // protected
        System.out.println("Salary: " + getSalary());         // private via getter
        System.out.println("Role: " + role);
    }
}

public class EmployeeDetailsDemo {

	public static void main(String[] args) {
		Manager employee = new Manager(201, "IT", 85000, "Project Manager");
		employee.displayDetails();
		employee.setSalary(95000);
        System.out.println("Updated Salary: " + employee.getSalary());

	}

}
