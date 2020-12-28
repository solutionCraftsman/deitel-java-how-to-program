package two.one;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatingDigitsTest {

    SeparatingDigits separatingDigits = new SeparatingDigits();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCalculateIntegerPart() {
        assertEquals(3, separatingDigits.calculateIntegerPart(10, 3));
        assertEquals(7, separatingDigits.calculateIntegerPart(15, 2));
    }

    @Test
    void testCalculateRemainderPart() {
        assertEquals(1, separatingDigits.calculateRemainderPart(10, 3));
        assertEquals(3, separatingDigits.calculateRemainderPart(15, 4));
    }

    @Test
    void testDisplayDigits() {
        assertEquals("4  5  6  2", separatingDigits.displayDigits(4562));
        assertEquals("9  9  9  9  9", separatingDigits.displayDigits(99999));
    }
}