package three;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathClassMethodsTest {

    MathClassMethods mtm;

    @BeforeEach
    void setUp() {
        mtm = new MathClassMethods();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAbsoluteValue() {
        double result = mtm.absoluteValue(-23.7);
        assertEquals(23.7, result);
    }

    @Test
    void testCeil() {
        double result = mtm.ceil(9.2);
        assertEquals(10.0, result);
    }

    @Test
    void testCos() {
        double result = mtm.cos(0.0);
        assertEquals(1.0, result);
    }

    @Test
    void testExp() {
        double result = mtm.exp(1.0);
        assertEquals(2.71828, result);
    }

    @Test
    void testFloor() {
        double result = mtm.floor(9.2);
        assertEquals(9.0, result);
    }

    @Test
    void testLog() {
        double result = mtm.log(Math.E);
        assertEquals(1.0, result);
    }

    @Test
    void testMax() {
        double result = mtm.max(2.3, 12.7);
        assertEquals(12.7, result);
    }

    @Test
    void testMin() {
        double result = mtm.min(2.3, 12.7);
        assertEquals(2.3, result);
    }

    @Test
    void testPow() {
        double result = mtm.pow(2.0, 7.0);
        assertEquals(128.0, result);
    }

    @Test
    void testSin() {
        double result = mtm.sin(0.0);
        assertEquals(0.0, result);
    }

    @Test
    void testSqrt() {
        double result = mtm.sqrt(900.0);
        assertEquals(30.0, result);
    }

    @Test
    void testTan() {
        double result = mtm.tan(0.0);
        assertEquals(0.0, result);
    }
}