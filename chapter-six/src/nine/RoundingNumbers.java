package nine;

public class RoundingNumbers {

    private double doubleValue;

    public RoundingNumbers(double doubleValue) {

        this.doubleValue = doubleValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public double roundNumberToNearestInteger() {
        return Math.floor(doubleValue);
    }
}
