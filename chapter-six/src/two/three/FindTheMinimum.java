package two.three;

public class FindTheMinimum {

    public double minimum3(double firstNumber, double secondNumber, double thirdNumber) {
        return Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
    }
}
