package one.seven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {

    GasMileage gasMileage;

    @BeforeEach
    void setUp() {
        gasMileage = new GasMileage();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testProgramCanCalculateMilesPerGallon_forEachTrip() {
        assertEquals(2.00, gasMileage.calculateMilesPerGallon(10, 5));
    }

    @Test
    void testProgramCanDisplayMilesPerGallon_forEachTrip() {
        gasMileage.calculateMilesPerGallon(10, 5);
        assertEquals(2.00, gasMileage.getMilesPerGallonForThisTrip());
    }

    @Test
    void testProgramCanCalculate_andPrint_combinedMilesPerGallon_upToACertainPoint() {
        gasMileage.calculateMilesPerGallon(10, 5);
        gasMileage.calculateCombinedMilesPerGallon();
        gasMileage.calculateMilesPerGallon(6, 2);
        gasMileage.calculateCombinedMilesPerGallon();
        gasMileage.calculateMilesPerGallon(8, 3);
        gasMileage.calculateCombinedMilesPerGallon();
        assertEquals(7.67, gasMileage.getCombinedMilesPerGallon());
    }

    @Test
    void testDataCanBeObtainedFromUser_withJOptionPane() {
        assertEquals(10, gasMileage.obtainData("Miles Driven"));
    }

    @Test
    void testDataCanBeObtainedFromUser_withSentinelControlledLoop() {
        assertTrue(gasMileage.continueReceivingInput(gasMileage.obtainData("Enter Gallons Used")));
        assertFalse(gasMileage.continueReceivingInput(gasMileage.obtainData("Enter Gallons Used")));
    }
}