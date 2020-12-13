package six;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereVolumeTest {

    @BeforeAll
    static void setUp() {
        SphereVolume.inputRadius();
    }

    @BeforeEach

    @AfterEach
    void tearDown() {
    }

    @Test
    void testRadiusCanBeInput() {
        assertEquals(7.0, SphereVolume.getRadius());
    }

    @Test
    void testVolumeSphereCalculation() {
        //assertEquals(1437.33, SphereVolume.sphereVolume());
        assertEquals(1436.76, SphereVolume.sphereVolume());
    }

}