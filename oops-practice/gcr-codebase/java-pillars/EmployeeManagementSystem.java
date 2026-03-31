import java.util.*;
interface Department{
	public void assignDepartment(String deptName);
	public String getDepartmentDetails();
}

abstract class Employee implements Department{
	private int employeeId;
	private String name;
	protected double salary;
	private String department;
	
	public Employee(int employeeId,String name,double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	
	public abstract double calculateSalary();
	
	public void displayDetails() {
		System.out.println("Employee Details: ");
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Department: "+department);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+calculateSalary());
		System.out.println();
	}
	
	@Override
	public void assignDepartment(String deptName) {
		this.department = deptName;
	}
	
	@Override
	public String getDepartmentDetails() {
		return department;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int newId) {
		this.employeeId = newId;
	}
	
	public String getName() {
		return name;
	}
}

class FullTimeEmployee extends Employee{
	public FullTimeEmployee(int employeeId,String name,double salary) {
		super(employeeId, name, salary);
	}
	
	@Override
	public double calculateSalary() {
		return salary;
	}
}

class PartTimeEmployee extends Employee{
	private int hoursWorked;
	private double hoursRate;
	public PartTimeEmployee(int employeeId,String name,int hoursWorked,double hoursRate) {
		super(employeeId, name, 0);
		this.hoursWorked = hoursWorked;
		this.hoursRate = hoursRate;
	}
	
	@Override
	public double calculateSalary() {
		return hoursWorked*hoursRate;
	}
}


public class EmployeeManagementSystem {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		
		Employee employee1 = new FullTimeEmployee(101,"Harshdeep Singh",50000);
		employee1.assignDepartment("IT");
		Employee employee2 = new PartTimeEmployee(102,"Ankit",80,50);
		employee2.assignDepartment("Management");
		
		employees.add(employee1);
		employees.add(employee2);
		
		for (Employee employee : employees) {
            employee.displayDetails();
        }

	}

}
