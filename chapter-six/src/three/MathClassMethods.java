package three;

public class MathClassMethods {

    public double absoluteValue(double x) {
        return Math.abs(x);
    }

    public double ceil(double x) {
        return Math.ceil(x);
    }

    public double cos(double x) {
        return Math.cos(x);
    }

    public double exp(double x) {
        return Double.parseDouble(String.format("%.5f", Math.exp(x)));
    }

    public double floor(double x) {
        return Math.floor(x);
    }

    public double log(double e) {
        return Math.log(Math.E);
    }

    public double max(double x, double y) {
        return Math.max(x, y);
    }

    public double min(double x, double y) {
        return Math.min(x, y);
    }

    public double pow(double x, double y) {
        return Math.pow(x, y);
    }

    public double sin(double x) {
        return Math.sin(x);
    }

    public double sqrt(double x) {
        return Math.sqrt(x);
    }

    public double tan(double x) {
        return Math.tan(x);
    }
}
