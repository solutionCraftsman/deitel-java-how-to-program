package three.one;

public class BinaryToDecimal {

    private int binaryNumber;

    public BinaryToDecimal(int binaryNumber) {
        setBinaryNumber(binaryNumber);
    }

    private void setBinaryNumber(int binaryNumber) {
        int temp = binaryNumber;
        boolean areAllBinaryDigits = true;
        while (temp > 0 && areAllBinaryDigits) {
            if((temp % 10) > 1) {
                areAllBinaryDigits = false;
            }
            temp /= 10;
        }

        if(areAllBinaryDigits) {
            this.binaryNumber = binaryNumber;
        }
    }

    public int getBinaryNumber() {
        return binaryNumber;
    }

    public double convert() {
        double sum = 0.0;
        int temp = binaryNumber;
        int binaryPower = 0; //or binaryIndex .. but binaryPower sounds more P-O-W-E-R-F-U-L!!! ;-)
        while(temp > 0) {
            sum += ((temp % 10) * Math.pow(2, binaryPower));
            temp /= 10;
            ++binaryPower;
        }
        return sum;
    }
}
