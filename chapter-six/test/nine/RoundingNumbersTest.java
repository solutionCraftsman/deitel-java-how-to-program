package nine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundingNumbersTest {

    RoundingNumbers roundingNumbers;

    @BeforeEach
    void setUp() {
        roundingNumbers = new RoundingNumbers(3.55);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatDoubleValues_canBeRead() {
        assertEquals(3.55, roundingNumbers.getDoubleValue());
        roundingNumbers.setDoubleValue(5.34);
        assertEquals(5.34, roundingNumbers.getDoubleValue());
    }

    @Test
    void testThatDoubleValue_canBeRoundedToTheNearestInteger() {
        assertEquals(3.0, roundingNumbers.roundNumberToNearestInteger());
        roundingNumbers.setDoubleValue(5.34);
        assertEquals(5.0, roundingNumbers.roundNumberToNearestInteger());

    }
}