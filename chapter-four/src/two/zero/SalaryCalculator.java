package two.zero;

public class SalaryCalculator {

    private Employee employeeOne;
    private Employee employeeTwo;
    private Employee employeeThree;

    public SalaryCalculator(Employee employeeOne, Employee employeeTwo, Employee employeeThree) {
        this.employeeOne = employeeOne;
        this.employeeTwo = employeeTwo;
        this.employeeThree = employeeThree;
    }

    public Employee getEmployeeOne() {
        return employeeOne;
    }

    public Employee getEmployeeTwo() {
        return employeeTwo;
    }

    public Employee getEmployeeThree() {
        return employeeThree;
    }
}
