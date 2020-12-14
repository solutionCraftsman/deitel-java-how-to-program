package one;

public class SalesCommissionCalculator {

    private double salesPersonsGrossSales;
    private final static double WEEKLY_BASE_PAY = 200.0;
    private final static double COMMISSION_PERCENTAGE = 9.0;

    public double getItemValue(int item) {
        double value;

        if(item == 1) {
            value = 239.99;
        }
        else if(item == 2) {
             value = 129.75;
        }
        else if(item == 3) {
            value = 99.95;
        }
        else if(item == 4) {
            value = 350.89;
        }
        else {
            value = 0.0;
        }

        return value;
    }

    public void inputSalesPersonsItemSold(int item) {
        salesPersonsGrossSales += getItemValue(item);
    }

    public double getSalesPersonsGrossSales() {
        double salesPersonsEarnings = WEEKLY_BASE_PAY +
                ((COMMISSION_PERCENTAGE / 100.0) * salesPersonsGrossSales);
        return Double.parseDouble(String.format("%.2f", salesPersonsEarnings));
    }
}
