package one.zero;

public class RoundingNumbers {

    public int roundToInteger(double number) {
        return (int)Math.round(number);
    }

    public double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}
