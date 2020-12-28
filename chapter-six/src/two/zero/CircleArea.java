package two.zero;

public class CircleArea {

    public double circleArea(double radius) {
        double area = Math.round(Math.PI * Math.pow(radius, 2));
        return Double.parseDouble(String.format("%.2f", area));
    }
}
