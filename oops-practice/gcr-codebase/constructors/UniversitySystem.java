class Student{
	public int rollNumber;
	protected String name;
	private double cgpa;
	
	public Student(int rollNumber,String name,double cgpa) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
}

class Postgraduate extends Student{
	String specialization;
	
	public Postgraduate(int rollNumber,String name,double cgpa,String specialization) {
		super(rollNumber,name,cgpa);
		this.specialization = specialization;
	}
	
	public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);   // public
        System.out.println("Name: " + name);                // protected
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCgpa());            // private via getter
    }
}


public class UniversitySystem {

	public static void main(String[] args) {
		
		Postgraduate pg = new Postgraduate(101,"Harshdeep",8.61,"CS");
		pg.displayDetails();
		
		pg.setCgpa(8.58);
		pg.displayDetails();

	}

}
