package two.zero;

public class Employee {

    private int numberOfHoursWorked;
    private double hourlyRate;

    public Employee(int numberOfHoursWorked, double hourlyRate) {
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double calculateGrossPay() {
        double hoursExcessOf40 = numberOfHoursWorked - 40;
        return (numberOfHoursWorked > 40) ?
                ((40 * hourlyRate) + (hoursExcessOf40 * (hourlyRate * 1.5))) :
                (numberOfHoursWorked * hourlyRate);
    }
}
