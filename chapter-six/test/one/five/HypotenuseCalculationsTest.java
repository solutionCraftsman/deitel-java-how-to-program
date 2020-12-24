package one.five;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HypotenuseCalculationsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testHypotenuse() {
        HypotenuseCalculations hypotenuseCalculations = new HypotenuseCalculations();
        assertEquals(5.0, hypotenuseCalculations.hypotenuse(3.0, 4.0));
        assertEquals(13.0, hypotenuseCalculations.hypotenuse(5.0, 12.0));
        assertEquals(17.0, hypotenuseCalculations.hypotenuse(8.0, 15.0));
    }
}