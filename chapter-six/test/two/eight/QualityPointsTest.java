package two.eight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QualityPointsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testQualityPoints() {
        QualityPoints qualityPoints = new QualityPoints();

        assertEquals(4, qualityPoints.qualityPoints(100));
        assertEquals(4, qualityPoints.qualityPoints(95));
        assertEquals(4, qualityPoints.qualityPoints(90));

        assertEquals(3, qualityPoints.qualityPoints(89));
        assertEquals(3, qualityPoints.qualityPoints(85));
        assertEquals(3, qualityPoints.qualityPoints(80));

        assertEquals(2, qualityPoints.qualityPoints(79));
        assertEquals(2, qualityPoints.qualityPoints(75));
        assertEquals(2, qualityPoints.qualityPoints(70));

        assertEquals(1, qualityPoints.qualityPoints(69));
        assertEquals(1, qualityPoints.qualityPoints(65));
        assertEquals(1, qualityPoints.qualityPoints(60));

        assertEquals(0, qualityPoints.qualityPoints(59));
        assertEquals(0, qualityPoints.qualityPoints(30));
        assertEquals(0, qualityPoints.qualityPoints(0));
        assertEquals(0, qualityPoints.qualityPoints(-10));

    }
}