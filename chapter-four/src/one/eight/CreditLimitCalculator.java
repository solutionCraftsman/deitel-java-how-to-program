package one.eight;

public class CreditLimitCalculator {

    private final String accountNumber;
    private double beginningMonthlyBalance;
    private double totalCreditsCharged;
    private double totalCreditsApplied;
    private double creditLimit;

    public CreditLimitCalculator(String accountNumber, double beginningMonthlyBalance,
                                 double totalCreditsCharged, double totalCreditsApplied,
                                 double creditLimit) {

        this.accountNumber = accountNumber;
        this.beginningMonthlyBalance = beginningMonthlyBalance;
        this.totalCreditsCharged = totalCreditsCharged;
        this.totalCreditsApplied = totalCreditsApplied;
        this.creditLimit = creditLimit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBeginningMonthlyBalance() {
        return beginningMonthlyBalance;
    }

    public void setBeginningMonthlyBalance(double beginningMonthlyBalance) {
        this.beginningMonthlyBalance = beginningMonthlyBalance;
    }

    public double getTotalCreditsCharged() {
        return totalCreditsCharged;
    }

    public void setTotalCreditsCharged(double totalCreditsCharged) {
        this.totalCreditsCharged = totalCreditsCharged;
    }

    public double getTotalCreditsApplied() {
        return totalCreditsApplied;
    }

    public void setTotalCreditsApplied(double totalCreditsApplied) {
        this.totalCreditsApplied = totalCreditsApplied;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double calculateBalance() {
        return beginningMonthlyBalance + totalCreditsCharged - totalCreditsApplied;
    }

    public String getCreditLimitStatus() {
        return (calculateBalance() > creditLimit) ? "Credit limit exceeded" : "";
    }
}
