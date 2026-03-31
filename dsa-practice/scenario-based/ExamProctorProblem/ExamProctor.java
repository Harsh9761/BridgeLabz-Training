package ExamProctorProblem;

import java.util.*;

public class ExamProctor {
	Stack<Integer> navigationStack = new Stack<>();
    HashMap<Integer, String> studentAnswers = new HashMap<>();
    HashMap<Integer, String> answerKey = new HashMap<>();

    public void loadAnswerKey() {
        answerKey.put(1, "A");
        answerKey.put(2, "B");
        answerKey.put(3, "C");
        answerKey.put(4, "D");
    }

    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public void goBack() {
        if (!navigationStack.isEmpty()) {
            int last = navigationStack.pop();
            System.out.println("Back from Question: " + last);
        } else {
            System.out.println("No previous questions.");
        }
    }

    public void submitAnswer(int questionId, String answer) {
        studentAnswers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    public int evaluateScore() {
        int score = 0;

        for (int qId : answerKey.keySet()) {
            if (studentAnswers.containsKey(qId) && studentAnswers.get(qId).equals(answerKey.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
