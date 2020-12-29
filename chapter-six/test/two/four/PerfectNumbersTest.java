package two.four;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

    PerfectNumbers perfectNumbers;

    @BeforeEach
    void setUp() {
        perfectNumbers = new PerfectNumbers();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIsPerfect() {
        assertFalse(perfectNumbers.isPerfect(1));
        assertTrue(perfectNumbers.isPerfect(6));
        assertFalse(perfectNumbers.isPerfect(10));
    }

    @Test
    void testProgramCanDisplayThePerfectNumbersInARange() {
        //perfectNumbers.displayPerfectNumbers(1, 1000);
        perfectNumbers.displayPerfectNumbers(1, 10_000);
    }
}