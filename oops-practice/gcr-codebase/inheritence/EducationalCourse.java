class Course{
	String courseName;
	int duration;
	public Course(String courseName,int duration) {
		this.courseName = courseName;
		this.duration = duration;
	}
	public void displayDetails() {
		System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
	}
}

class OnlineCourse extends Course{
	String platform;
	boolean isRecorded;
	public OnlineCourse(String courseName,int duration,String platform,boolean isRecorded) {
		super(courseName,duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	
	@Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse{
	double fee;
	double discount;
	public PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,double fee,double discount) {
		super(courseName,duration,platform,isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	
	@Override
    public void displayDetails() {
        super.displayDetails();
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Course Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + finalPrice);
    }
}
public class EducationalCourse {

	public static void main(String[] args) {
		PaidOnlineCourse course = new PaidOnlineCourse("Java Full Stack",120,"Udemy",true,10000,20);

        course.displayDetails();

	}

}
