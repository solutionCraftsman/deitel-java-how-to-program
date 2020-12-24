package one.zero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundingNumbersTest {

    RoundingNumbers roundingNumbers;

    @BeforeEach
    void setUp() {
        roundingNumbers = new RoundingNumbers();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testRoundToInteger() {
        assertEquals(46, roundingNumbers.roundToInteger(45.542));
        assertEquals(342, roundingNumbers.roundToInteger(342.42545));
        assertEquals(-42443, roundingNumbers.roundToInteger(-42442.745));
    }

    @Test
    void testRoundToTenths() {
        assertEquals(45.5, roundingNumbers.roundToTenths(45.542));
        assertEquals(342.4, roundingNumbers.roundToTenths(342.42545));
        assertEquals(-42442.7, roundingNumbers.roundToTenths(-42442.745));
    }

    @Test
    void testRoundToHundredths() {
        assertEquals(45.54, roundingNumbers.roundToHundredths(45.542));
        assertEquals(342.43, roundingNumbers.roundToHundredths(342.42545));
        assertEquals(-42442.74, roundingNumbers.roundToHundredths(-42442.745));
    }

    @Test
    void testRoundToThousandths() {
        assertEquals(45.500, roundingNumbers.roundToThousandths(45.5));
        assertEquals(342.425, roundingNumbers.roundToThousandths(342.42545));
        assertEquals(-42442.745, roundingNumbers.roundToThousandths(-42442.745));
    }
}
