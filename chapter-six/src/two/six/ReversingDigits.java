package two.six;

public class ReversingDigits {

    public int reverseDigits(int number) {
        String numberToString = number + "";
        String numberReversed = "";
        for (int digitIndex = 0; digitIndex < numberToString.length() ; digitIndex++) {
            numberReversed = numberToString.charAt(digitIndex) + numberReversed;
        }
        return Integer.parseInt(numberReversed);
    }
}
