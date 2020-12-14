package one;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionCalculatorTest {

    SalesCommissionCalculator salesCommissionCalculator;

    @BeforeEach
    void setUp() {
        salesCommissionCalculator = new SalesCommissionCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testItemSold_canBeInput_andValueCanBeGot() {
        assertEquals(239.99, salesCommissionCalculator.getItemValue(1));
        assertEquals(129.75, salesCommissionCalculator.getItemValue(2));
        assertEquals(99.95, salesCommissionCalculator.getItemValue(3));
        assertEquals(350.89, salesCommissionCalculator.getItemValue(4));
        assertEquals(0.0, salesCommissionCalculator.getItemValue(5));
    }

    @Test
    void testSalesPersonsEarnings_canBeCalculated() {
        salesCommissionCalculator.inputSalesPersonsItemSold(1);
        salesCommissionCalculator.inputSalesPersonsItemSold(1);
        salesCommissionCalculator.inputSalesPersonsItemSold(2);
        salesCommissionCalculator.inputSalesPersonsItemSold(4);
        assertEquals(286.46, salesCommissionCalculator.getSalesPersonsGrossSales());
    }
}