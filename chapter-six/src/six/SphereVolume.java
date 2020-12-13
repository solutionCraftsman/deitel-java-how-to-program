package six;

import javax.swing.*;

public class SphereVolume {

    private static double radius;

    public static void inputRadius() {
        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius"));
    }

    public static double getRadius() {
        return radius;
    }

    public static double sphereVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return Double.parseDouble(String.format("%.2f", volume));
    }
}
