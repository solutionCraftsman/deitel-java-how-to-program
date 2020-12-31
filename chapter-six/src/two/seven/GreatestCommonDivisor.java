package two.seven;

public class GreatestCommonDivisor {

    public int gcd(int firstNumber, int secondNumber) {
        int minimumNumber = Math.min(firstNumber, secondNumber);
        int gcd = 1;
        for (int divisor = 2; divisor <= minimumNumber; divisor++) {
            if(firstNumber % divisor == 0 && secondNumber % divisor == 0) {
                gcd = divisor;
            }
        }
        return gcd;
    }
}
