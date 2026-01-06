import java.util.*;
public class StudentReport {

	public static void main(String[] args) {
		ArrayList<String> studentName = new ArrayList<>();
		
		String subjects[] = {"Physics","Chemistry","Maths"};
		try {
			int[] marks1 = {85, 90, 78};
            validateMarks(marks1);
            studentName.add("Amit");
            displayReport("Amit", subjects, marks1);

            int[] marks2 = {95, 88, 92};
            validateMarks(marks2);
            studentName.add("Neha");
            displayReport("Neha", subjects, marks2);

            // Invalid marks case
            int[] marks3 = {120, 70, 60};
            validateMarks(marks3);
            studentName.add("Rahul");
            displayReport("Rahul", subjects, marks3);

        } catch (InvalidMarkException e) {
            System.out.println(e.getMessage());
        }
		

	}
	
	public static void validateMarks(int marks[]) throws InvalidMarkException {
		for(int mark : marks) {
			if(mark < 0 || mark > 100) {
				throw new InvalidMarkException("Marks must be between 0 and 100");
			}
		}
	}
	
	public static int averageScore(int scores[]) {
		int sum = 0;
		for(int i = 0;i<scores.length;i++) {
			sum += scores[i];
		}
		return (sum/scores.length);
	}
	
	public static char findGrade(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else return 'D';
    }
	
	static void displayReport(String name, String[] subjects, int[] marks) {
        double avg = averageScore(marks);
        char grade = findGrade(avg);

        System.out.println("Report Card\n");
        System.out.println("Name : " + name);

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i]+" "+ marks[i]+" ");
        }

        System.out.println("Average : "+ avg);
        System.out.println("Grade   : " + grade);
        System.out.println();
    }

}

class InvalidMarkException extends Exception {
    InvalidMarkException(String msg) {
        super(msg);
    }
}
