package one.six;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIsMultiple() {
        Multiples multiples = new Multiples();
        assertFalse(multiples.isMultiple(9, 2));
        assertTrue(multiples.isMultiple(9, 3));
    }


}