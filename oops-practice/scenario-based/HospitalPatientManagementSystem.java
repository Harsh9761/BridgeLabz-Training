
interface Ipayable{
	public double calculateBill();
}

class Patient{
	private String patientName;
	private int patientAge;
	private String ailment;
	public Patient(String patientName,int patientAge,String ailment) {
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.ailment = ailment;
	}
	
	public String getPatientName() {
		return patientName;
	}
	
	public String ailment() {
		return ailment;
	}
	
	public int patientAge() {
		return patientAge;
	}
	
	public void displayInfo() {
		System.out.println("Patient Name: "+patientName);
		System.out.println("Patient age: "+patientAge);
		System.out.println("Patient Ailment: "+ailment);
	}
}

class InPatient extends Patient implements Ipayable{
	int daysAdmited;
	double perDayCharge;
	
	public InPatient(String patientName,int patientAge,String ailment,int daysAdmited,double perDayCharge) {
		super(patientName,patientAge,ailment);
		this.daysAdmited = daysAdmited;
		this.perDayCharge = perDayCharge;
	}
	
	@Override
	public double calculateBill() {
		return daysAdmited*perDayCharge;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Patient Type: InPatient");
		System.out.println("Days Admitted"+daysAdmited);
	}
}

class OutPatient extends Patient implements Ipayable{
	double consultationFee;
	
	public OutPatient(String patientName,int patientAge,String ailment,double consultationFee) {
		super(patientName,patientAge,ailment);
		this.consultationFee = consultationFee;
	}
	
	@Override
	public double calculateBill() {
		return consultationFee;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Patient Type: OutPatient");
	}
}

class Doctor{
	private String doctorName;
	private int doctorId;
	private String department;
	public Doctor(String doctorName,int doctorId,String department) {
		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.department = department;
	}
	public String getDoctorName() {
		return doctorName;
	}
	
	public int getDoctorId() {
		return doctorId;
	}
	
	public String getDepartment() {
		return department;
	}
	public void displayInfo() {
		System.out.println("Doctor Name: "+doctorName);
		System.out.println(" Doctor Id: "+doctorId);
		System.out.println("Doctor Department: "+department);
	}
}

class Bills{
	public void generateBill(Ipayable bill) {
		System.out.println("Total Bill is: "+bill.calculateBill());
	}
}


public class HospitalPatientManagementSystem {

	public static void main(String[] args) {
		
		Patient patient1 = new InPatient("Harshdeep", 22, "Maleria", 5, 2000);
        Patient patient2 = new OutPatient("Anikt", 22, "Dengue",500);

        Doctor doctor = new Doctor("Dr. Sharma",101, "Cardiology");

        Bills bill = new Bills();

        patient1.displayInfo();
        bill.generateBill((Ipayable) patient1);

        System.out.println();

        patient2.displayInfo();
        bill.generateBill((Ipayable) patient2);

        System.out.println();

        doctor.displayInfo();

	}

}

