package one.seven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIsEven() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertTrue(evenOrOdd.isEven(8));
        assertFalse(evenOrOdd.isEven(19));
        assertTrue(evenOrOdd.isEven(24));
        assertFalse(evenOrOdd.isEven(49));
    }
}