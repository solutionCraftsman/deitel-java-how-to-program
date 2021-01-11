package three.five;

import javax.swing.*;
import java.security.SecureRandom;

public class ComputerAssistedInstruction {

    private static final SecureRandom secureRandom = new SecureRandom();
    private int firstRandomNumber;
    private int secondRandomNumber;
    private int studentAnswer;

    public void generateRandomNumbers() {
        firstRandomNumber = 1 + secureRandom.nextInt(9);
        secondRandomNumber = 1 + secureRandom.nextInt(9);
    }

    public int getFirstRandomNumber() {
        return firstRandomNumber;
    }

    public int getSecondRandomNumber() {
        return secondRandomNumber;
    }

    public String getQuestion() {
        return "How much is " + firstRandomNumber + " times " + secondRandomNumber;
    }

    public void getQuestionAndInputAnswer() {
        studentAnswer = Integer.parseInt(JOptionPane.showInputDialog(getQuestion()));
    }

    public int getStudentAnswer() {
        return studentAnswer;
    }

    public int getMultiplicationResult() {
        return firstRandomNumber * secondRandomNumber;
    }

    public String getQuestionFeedback() {
        return (studentAnswer == getMultiplicationResult()) ?
                "Very good!" : "No. Please try again.";
    }

    public void checkStudentsAnswer() {
        if(studentAnswer == getMultiplicationResult()) {
            generateRandomNumbers();
        }
    }
}
