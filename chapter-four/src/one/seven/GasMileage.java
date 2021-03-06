package one.seven;

import javax.swing.*;

public class GasMileage {

    private double milePerGallonForThisTrip;
    private double combinedMilesPerGallon;
    private final static int SENTINEL_VALUE = -1;

    public double calculateMilesPerGallon(int milesDriven, int gallonsUsed) {
         milePerGallonForThisTrip = (double) milesDriven / gallonsUsed;
         return milePerGallonForThisTrip;
    }

    public double getMilesPerGallonForThisTrip() {
        return Double.parseDouble(String.format("%.2f", milePerGallonForThisTrip));
    }

    public void calculateCombinedMilesPerGallon() {
        combinedMilesPerGallon += milePerGallonForThisTrip;
    }

    public double getCombinedMilesPerGallon() {
        return Double.parseDouble(String.format("%.2f", combinedMilesPerGallon));
    }

    public int obtainData(String dataLabel) {
        return Integer.parseInt(JOptionPane.showInputDialog("Enter " + dataLabel + " for this trip, -1 to end"));
    }

    public boolean continueReceivingInput(int input) {
        return input != SENTINEL_VALUE;
    }
}
