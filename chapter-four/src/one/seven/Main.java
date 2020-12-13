package one.seven;

public class Main {

    public static void main(String[] args) {

        GasMileage gasMileage = new GasMileage();

        int mileage = gasMileage.obtainData("Miles");
        int gallons = gasMileage.obtainData("Gallons");

        while (gasMileage.continueReceivingInput(mileage) && gasMileage.continueReceivingInput(gallons)) {
            gasMileage.calculateMilesPerGallon(mileage, gallons);
            gasMileage.calculateCombinedMilesPerGallon();
            System.out.println("Mile: " + mileage + "\n" +
                    "Gallons: " + gallons + "\n" +
                    "MilesPerGallon: " + gasMileage.getMilesPerGallonForThisTrip() + "\n" +
                    "Combined MilesPerGallon: " + gasMileage.getCombinedMilesPerGallon());

            mileage = gasMileage.obtainData("Miles");
            gallons = gasMileage.obtainData("Gallons");

            System.out.println();
        }
    }
}
