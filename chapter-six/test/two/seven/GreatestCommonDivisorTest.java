package two.seven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGCD() {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        assertEquals(6, greatestCommonDivisor.gcd(78, 144));
        assertEquals(7, greatestCommonDivisor.gcd(49, 21));
        assertEquals(3, greatestCommonDivisor.gcd(9, 12));
    }
}