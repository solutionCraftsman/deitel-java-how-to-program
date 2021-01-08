package two.three;

import javax.swing.*;

public class FindTheMinimum {

    private double firstNumber;
    private double secondNumber;
    private double thirdNumber;

    public double minimum3() {
        return Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setThirdNumber(double thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    public double readInput() {
        return Double.parseDouble(JOptionPane.showInputDialog("Enter value"));
    }
}
