package eight;

public class ParkingCharges {

    private double totalReceipts = 0.0;
    private double currentCustomerCharge;
    private static double MINIMUM_PARKING_FEE = 2.00;
    private static double ADDITIONAL_CHARGE = 0.50;
    private static int BASE_HOURS = 3;
    private static double MAXIMUM_CHARGE = 10.00;

    public void calculateCharges(int parkingHours) {
        int excessHours = parkingHours - BASE_HOURS;
        double excessHoursCharge = excessHours * ADDITIONAL_CHARGE;
        double parkingCharge = MINIMUM_PARKING_FEE + excessHoursCharge;

        //currentCustomerCharge = (parkingCharge > MAXIMUM_CHARGE) ? MAXIMUM_CHARGE : parkingCharge;
        currentCustomerCharge = Math.min(parkingCharge, MAXIMUM_CHARGE);
        totalReceipts += currentCustomerCharge;
    }

    public double getCurrentCustomerCharge() {
        return currentCustomerCharge;
    }

    public double getTotalReceipts() {
        return totalReceipts;
    }
}

