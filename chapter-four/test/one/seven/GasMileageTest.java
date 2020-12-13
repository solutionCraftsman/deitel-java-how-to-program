package one.seven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {

    GasMileage gM;

    @BeforeEach
    void setUp() {
        gM = new GasMileage();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testProgramCanCalculateMilesPerGallon_forEachTrip() {
        assertEquals(2.00, gM.calculateMilesPerGallon(10, 5));
    }

    @Test
    void testProgramCanDisplayMilesPerGallon_forEachTrip() {
        gM.calculateMilesPerGallon(10, 5);
        assertEquals(2.00, gM.getMilesPerGallonForThisTrip());
    }

    @Test
    void testProgramCanCalculate_andPrint_combinedMilesPerGallon_upToACertainPoint() {
        gM.calculateMilesPerGallon(10, 5);
        gM.calculateCombinedMilesPerGallon();
        gM.calculateMilesPerGallon(6, 2);
        gM.calculateCombinedMilesPerGallon();
        gM.calculateMilesPerGallon(8, 3);
        gM.calculateCombinedMilesPerGallon();
        assertEquals(7.67, gM.getCombinedMilesPerGallon());
    }

    @Test
    void testDataCanBeObtainedFromUser_withJOptionPane() {
        assertEquals(10, gM.obtainData("Miles Driven"));
    }

    @Test
    void testDataCanBeObtainedFromUser_withSentinelControlledLoop() {
        assertTrue(gM.continueReceivingInput(gM.obtainData("Enter Gallons Used")));
        assertFalse(gM.continueReceivingInput(gM.obtainData("Enter Gallons Used")));
    }
}