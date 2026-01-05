interface MedicalRecord{
	public void addRecord(String record);
	public void viewRecords();
	
}
abstract class Patient{
	 private int patientId;
	 private String name;
	 private int age;
	 public Patient(int patientId,String name,int age) {
		 this.patientId = patientId;
		 this.name = name;
		 this.age = age;
	 }
	 private String diagnosis;
	 
	 public abstract double calculateBill();
	 
	 public void getPatientDetails() {
		 System.out.println("Patient Details: ");
		 System.out.println("Patient ID: "+patientId);
		 System.out.println("Patient name: "+name);
		 System.out.println("Patient age: "+age);
	 }
	 
	 protected void setDiagnosis(String diagnosis) {
	        this.diagnosis = diagnosis;
	 }
	 
	 protected String getDiagnosis() {
	        return diagnosis;
	 }
	 
}

class InPatient extends Patient implements MedicalRecord{
	private int days;
    private double dailyCharge;
    private String medicalHistory = "";

    public InPatient(int id, String name, int age, int days, double charge) {
        super(id, name, age);
        this.days = days;
        this.dailyCharge = charge;
    }

    @Override
    public double calculateBill() {
        return days * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:\n" + medicalHistory);
    }
}

class OutPatient extends Patient implements MedicalRecord {

    private double Fee;
    private String medicalHistory = "";

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.Fee = fee;
    }

    @Override
    public double calculateBill() {
        return Fee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:\n" + medicalHistory);
    }
}

public class HospitalManagement {

	public static void main(String[] args) {
		Patient patient1 = new InPatient(101, "Harshdeep", 24, 5, 2000);
        Patient patient2 = new OutPatient(102, "Ankit", 22, 500);

        Patient[] patients = { patient1, patient2 };

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Initial checkup completed");
                record.viewRecords();
            }

            System.out.println("---------------------------");
        }

	}

}
