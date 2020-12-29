package two.five;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    PrimeNumbers primeNumbers;

    @BeforeEach
    void setUp() {
        primeNumbers = new PrimeNumbers();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIsPrime() {
        assertFalse(primeNumbers.isPrime(4));
        assertFalse(primeNumbers.isPrime(6));
        assertTrue(primeNumbers.isPrime(5));
        assertTrue(primeNumbers.isPrime(7));
    }

    @Test
    void testDisplayAllPrimeNumbers() {
        primeNumbers.displayPrimeNumbers(10_000);
    }
}