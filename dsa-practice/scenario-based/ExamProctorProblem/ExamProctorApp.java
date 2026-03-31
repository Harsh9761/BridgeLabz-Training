package ExamProctorProblem;

public class ExamProctorApp {

	public static void main(String[] args) {
		ExamProctor exam = new ExamProctor();
        exam.loadAnswerKey();

        exam.visitQuestion(1);
        exam.submitAnswer(1, "D");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "B");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "C");

        exam.goBack();

        exam.visitQuestion(4);
        exam.submitAnswer(4, "A");

        System.out.println("\nFinal Score: " + exam.evaluateScore());

	}

}
