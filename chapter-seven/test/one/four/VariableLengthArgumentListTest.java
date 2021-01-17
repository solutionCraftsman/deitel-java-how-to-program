package one.four;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableLengthArgumentListTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCalculateProduct_withVariableLength_argumentList() {
        VariableLengthArgumentList v = new VariableLengthArgumentList();
        assertEquals(0, v.calculateProduct(0, 1));
        assertEquals(2, v.calculateProduct(1, 1, 2));
        assertEquals(20, v.calculateProduct(2, 10));
        assertEquals(100, v.calculateProduct(2, 2, 5, 5));
        assertEquals(1000, v.calculateProduct(2, 2, 5, 5, 10));
    }
}