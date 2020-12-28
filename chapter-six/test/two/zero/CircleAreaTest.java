package two.zero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleAreaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCircleArea() {
        CircleArea circleArea = new CircleArea();
        assertEquals(154.00, circleArea.circleArea(7.0));
    }
}