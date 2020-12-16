package one.eight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {

    CreditLimitCalculator creditLimitCalculator;

    @BeforeEach
    void setUp() {
        creditLimitCalculator = new CreditLimitCalculator("010203", 500.0, 1000.0, 200.0, 5000.0);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCustomerFacts_canBeInput() {
        assertEquals("010203", creditLimitCalculator.getAccountNumber());
        assertEquals(500.0, creditLimitCalculator.getBeginningMonthlyBalance());
        assertEquals(1_000.0, creditLimitCalculator.getTotalCreditsCharged());
        assertEquals(200.0, creditLimitCalculator.getTotalCreditsApplied());
        assertEquals(5_000.0, creditLimitCalculator.getCreditLimit());

        creditLimitCalculator.setBeginningMonthlyBalance(400.0);
        assertEquals(400.0, creditLimitCalculator.getBeginningMonthlyBalance());

        creditLimitCalculator.setTotalCreditsCharged(500.0);
        assertEquals(500.0, creditLimitCalculator.getTotalCreditsCharged());

        creditLimitCalculator.setTotalCreditsApplied(700.0);
        assertEquals(700.0, creditLimitCalculator.getTotalCreditsApplied());

        creditLimitCalculator.setCreditLimit(10_000.0);
        assertEquals(10_000.0, creditLimitCalculator.getCreditLimit());
    }

    @Test
    void testBalanceCanBeCalculated() {
        //when
        double newBalance = creditLimitCalculator.calculateBalance();
        //assert
        assertEquals(1_300.0, newBalance);
    }

    @Test
    void testCreditLimitStatus_canBeDetermined() {
        assertEquals("", creditLimitCalculator.getCreditLimitStatus());

        creditLimitCalculator.setTotalCreditsCharged(15_000.0);
        assertEquals("Credit limit exceeded", creditLimitCalculator.getCreditLimitStatus());
    }
}