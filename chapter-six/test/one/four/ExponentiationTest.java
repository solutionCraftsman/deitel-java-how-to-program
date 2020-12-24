package one.four;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentiationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIntegerPower() {
        Exponentiation exponentiation = new Exponentiation();
        assertEquals(81, exponentiation.integerPower(3, 4));
        assertEquals(125, exponentiation.integerPower(5, 3));
        assertEquals(16, exponentiation.integerPower(2, 4));
    }

}