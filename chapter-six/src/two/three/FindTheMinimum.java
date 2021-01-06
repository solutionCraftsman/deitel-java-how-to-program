package two.three;

import javax.swing.*;

public class FindTheMinimum {

    private double firstNumber;
    private double secondNumber;
    private double thirdNumber;

    public double minimum3() {
        return Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
    }

    public void inputFirstNumber() {
        firstNumber = readInput();
    }

    public void inputSecondNumber() {
        secondNumber = readInput();
    }

    public void inputThirdNumber() {
        thirdNumber = readInput();
    }

    public double readInput() {
        return Double.parseDouble(JOptionPane.showInputDialog("Enter value"));
    }
}
