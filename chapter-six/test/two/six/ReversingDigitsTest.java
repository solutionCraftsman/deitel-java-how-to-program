package two.six;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingDigitsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testMethodReturnsNumberWithDigitsReversed() {
        ReversingDigits reversingDigits = new ReversingDigits();
        assertEquals(1367, reversingDigits.reverseDigits(7631));
    }
}