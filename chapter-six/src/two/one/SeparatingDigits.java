package two.one;

public class SeparatingDigits {

    public int calculateIntegerPart(int dividend, int divisor) {
        return dividend / divisor;
    }

    public int calculateRemainderPart(int dividend, int divisor) {
        return dividend % divisor;
    }

    public String displayDigits(int integer) {

        if(integer < 1 || integer > 99999) {
            return "Only 1 - 99999 allowed.";
        }

        String separatedDigits = "";
        int digitTakenOff;

        while (integer > 0) {
            digitTakenOff = calculateRemainderPart(integer, 10);
            if(separatedDigits.isEmpty()) {
                separatedDigits = digitTakenOff + "";
            } else {
                separatedDigits = digitTakenOff + "  " + separatedDigits;
            }
            integer = calculateIntegerPart(integer, 10);
        }

        return separatedDigits;
    }
}
