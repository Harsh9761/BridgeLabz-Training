class OnlineCourse{
	String courseName;
	int duration;
	double fees;
	
	static String InstituteName = "GLA University";
	
	public OnlineCourse(String courseName,int duration,double fees){
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}
	
	public void Display() {
		System.out.println("Course Details: ");
		System.out.println("Course Name: "+courseName);
		System.out.println("Duration : "+duration);
		System.out.println("fees: "+fees);
	}
	
	public static void modifyInstitute(String newName) {
		InstituteName = newName;
		System.out.println("New Name is: "+InstituteName);
	}
}
public class OnilineCourseSystem {

	public static void main(String[] args) {
		OnlineCourse course1 = new OnlineCourse("Java Full Stack", 6, 45000);
		OnlineCourse course2 = new OnlineCourse("Python with AI", 5, 40000);
		
		course1.Display();
		course2.Display();
		OnlineCourse.modifyInstitute("GL Bajaj");
		System.out.println(OnlineCourse.InstituteName);
		

	}

}
