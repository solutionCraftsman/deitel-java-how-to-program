package two.zero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee(100, 10.0);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEmployeeInformation_canBeInput() {
        assertEquals(100, employee.getNumberOfHoursWorked());
        assertEquals(10.0, employee.getHourlyRate());
    }

    @Test
    void testEmployeeGrossPay_canBeDetermined() {
        assertEquals(1_300.00, employee.calculateGrossPay());

        Employee employeeOne = new Employee(30, 5.0);
        assertEquals(150.00, employeeOne.calculateGrossPay());
    }
}