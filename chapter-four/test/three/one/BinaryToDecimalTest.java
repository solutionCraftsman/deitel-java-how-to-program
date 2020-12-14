package three.one;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToDecimalTest {

    BinaryToDecimal binaryToDecimal;

    @BeforeEach
    void setUp() {
        binaryToDecimal = new BinaryToDecimal(10110);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testOnlyOnesAndZeroes_canBeInput() {
        assertEquals(10110, binaryToDecimal.getBinaryNumber());

        BinaryToDecimal binaryToDecimal2 = new BinaryToDecimal(10450);
        assertEquals(0, binaryToDecimal2.getBinaryNumber());
    }

    @Test
    void testBinary_canBeConvertedTo_decimalEquivalent() {
        assertEquals(22.0, binaryToDecimal.convert());

        BinaryToDecimal binaryToDecimal2 = new BinaryToDecimal(11111);
        assertEquals(31.0, binaryToDecimal2.convert());

        BinaryToDecimal binaryToDecimal3 = new BinaryToDecimal(101);
        assertEquals(5.0, binaryToDecimal3.convert());
    }
}