package one.eight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayingASquareOfAsterisksTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSquareOfAsterisks() {
        DisplayingASquareOfAsterisks displayingASquareOfAsterisks = new DisplayingASquareOfAsterisks();
        displayingASquareOfAsterisks.squareOfAsterisks(5);
        assertEquals(5, displayingASquareOfAsterisks.getRowCounter());
        assertEquals(5, displayingASquareOfAsterisks.getColumnCounter());
    }
}