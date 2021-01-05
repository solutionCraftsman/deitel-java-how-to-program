package three.four;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryOctalHexadecimalTest {

    BinaryOctalHexadecimal binaryOctalHexadecimal = new BinaryOctalHexadecimal();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testBinary() {
        assertEquals(10110, binaryOctalHexadecimal.toBinary(22));
        assertEquals(11110011, binaryOctalHexadecimal.toBinary(243));
    }

    @Test
    void testOctal() {
                                                                                                                                                                                                                                                                                                                                                                                                                                                       assertEquals(713, binaryOctalHexadecimal.toOctal(459));
        assertEquals(352, binaryOctalHexadecimal.toOctal(234));
    }

    @Test
    void testHexadecimal() {
        assertEquals("F", binaryOctalHexadecimal.toHexadecimal(15));
        assertEquals("A", binaryOctalHexadecimal.toHexadecimal(10));
        assertEquals("2A", binaryOctalHexadecimal.toHexadecimal(42));
        assertEquals("1A6", binaryOctalHexadecimal.toHexadecimal(422));
    }
}