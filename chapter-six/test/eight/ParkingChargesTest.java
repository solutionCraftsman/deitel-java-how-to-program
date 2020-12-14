package eight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {

    ParkingCharges parkingCharges;

    @BeforeEach
    void setUp() {
        parkingCharges = new ParkingCharges();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testParkingCharges_canBeCalculated() {
        parkingCharges.calculateCharges(20);
        assertEquals(10.00, parkingCharges.getCurrentCustomerCharge());

        parkingCharges.calculateCharges(15);
        assertEquals(8.00, parkingCharges.getCurrentCustomerCharge());
    }

    @Test
    void testTotalReceipt_canBeCalculated() {
        parkingCharges.calculateCharges(20);
        parkingCharges.calculateCharges(15);
        parkingCharges.calculateCharges(17);
        assertEquals(27.00, parkingCharges.getTotalReceipts());
    }

}