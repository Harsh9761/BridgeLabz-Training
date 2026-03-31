class Patient{
	static String hospitalName = "AIIMS";
	static int totalPatients = 0;
	
	final int patientId;
	String name;
	int age;
	String ailment;
	
	public Patient(int patientId,String name,int age,String ailment) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.ailment = ailment;
		totalPatients++;
	}
	
	public void displayDetails() {
        if(this instanceof Patient) {
        	System.out.println("Patient ID: " + patientId);
            System.out.println("Patient Name: " + name);
            System.out.println("Patient age: "+age);
            System.out.println("Patient ailment: "+ailment);
            System.out.println();
        }else {
        	System.out.println("Invalid Instance!!");
        }
    }
	
	public static void displayTotalPatients() {
    	System.out.println("Total Patients is: "+totalPatients);
    }
}
public class HospitalManagmentSystem {

	public static void main(String[] args) {
		Patient patient1 = new Patient(101,"Lathika",30,"Flu");
		Patient patient2 = new Patient(102,"King",35,"Maleria");
		
		patient1.displayDetails();
		patient2.displayDetails();
		
		Patient.displayTotalPatients();

	}

}
