package two.zero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {

    SalaryCalculator salaryCalculator;
    Employee employeeOne;
    Employee employeeTwo;
    Employee employeeThree;

    @BeforeEach
    void setUp() {
        employeeOne = new Employee(100, 10.0);
        employeeTwo = new Employee(20, 20.0);
        employeeThree = new Employee(40, 50.0);
        salaryCalculator = new SalaryCalculator(employeeOne, employeeTwo, employeeThree);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEmployeesInformation_canBeInput() {
        assertEquals(employeeOne, salaryCalculator.getEmployeeOne());
        assertEquals(employeeTwo, salaryCalculator.getEmployeeTwo());
        assertEquals(employeeThree, salaryCalculator.getEmployeeThree());
    }

    @Test
    void testEmployeesGrossPays_canBeDetermined() {
        assertEquals(1_300.00, employeeOne.calculateGrossPay());
        assertEquals(400.00, employeeTwo.calculateGrossPay());
        assertEquals(2_000.00, employeeThree.calculateGrossPay());
    }
}