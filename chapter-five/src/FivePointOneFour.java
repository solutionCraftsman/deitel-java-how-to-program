
public class FivePointOneFour {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        //double rate;
        //double rateInDecimal;

        calculateCompoundInterest(0.0, principal, 0.0, 0.0);
    }

    public static void calculateCompoundInterest(double amount, double principal, double rate, double rateInDecimal) {
        System.out.printf("%s%7s%20s%n", "Year", "Rate", "Amount on deposit");
        boolean printedYear;
        for (int year = 1; year <= 10; ++year) {
            printedYear = false;
            for (rate = 5.0; rate <= 10.0; rate++) {
                rateInDecimal = rate / 100.0;
                amount = principal * Math.pow(1.0 + rateInDecimal, year);
                if(!printedYear) {
                    System.out.printf("%4d%7s%,20.2f%n", year, rate, amount);
                    printedYear = true;
                }
                else {
                    System.out.printf("%4s%7s%,20.2f%n", "", rate, amount);
                }
            }
            System.out.println();
        }
    }
}

class Interest {
    public static void main(String[] args) {
        double amount; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        double rate = 0.05; // interest rate

        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; ++year) {
            // calculate new amount for specified year
            amount = principal * Math.pow(1.0 + rate, year);

            // display the year and the amount
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}