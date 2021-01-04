package three.two;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceBetweenPointsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDistanceBetweenPoints() {
        assertEquals(5.0,
                DistanceBetweenPoints.calculateDistance(4.0, 2.0, 20.0, 10.0));
    }
}