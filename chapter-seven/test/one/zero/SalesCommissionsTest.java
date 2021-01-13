package one.zero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThat_salesCommissions_canBeDetermined() {
        int[] sales = {4000, 5000, 500, 100000, 5500};
        int[] frequency = new int[9];

        SalesCommissions.determineSalesCommissions(sales, frequency);
        assertEquals(1, frequency[0]);
        assertEquals(0, frequency[1]);
        assertEquals(1, frequency[3]);
        assertEquals(2, frequency[4]);
        assertEquals(1, frequency[8]);
    }
}