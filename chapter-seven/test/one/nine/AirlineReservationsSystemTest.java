package one.nine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationsSystemTest {

    AirlineReservationsSystem ars;

    @BeforeEach
    void setUp() {
        ars = new AirlineReservationsSystem();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void alternatives_canBeDisplayed() {
        assertEquals(
                "Please type 1 for First Class\n" +
                "Please type 2 for Economy", ars.getAlternatives());
    }

    @Test
    void user_canTypeInput() {
        ars.setUserInput(ars.getUserInputWithJOptionPane());
        assertEquals(1, ars.getUserInput());
    }

    @Test
    void application_shouldAssignSeat_inTheFirstClass() {
        ars.setUserInput(1);
        ars.assignSeat();
        assertTrue(ars.getSeats()[0]);

        ars.setUserInput(1);
        ars.assignSeat();
        assertTrue(ars.getSeats()[1]);

        assertFalse(ars.getSeats()[5]);
    }

    @Test
    void application_shouldAssignSeat_inTheEconomySection() {
        ars.setUserInput(2);
        ars.assignSeat();
        assertTrue(ars.getSeats()[5]);

        ars.setUserInput(2);
        ars.assignSeat();
        assertTrue(ars.getSeats()[6]);

        assertFalse(ars.getSeats()[0]);
    }

    @Test
    void application_shouldDisplay_boardingPass_indicatingSeatNumber_andSection() {
        ars.setUserInput(1);
        ars.assignSeat();
        assertEquals(1, ars.getPassengerSeatNumber());
        assertEquals("First Class", ars.getSection());

        ars.setUserInput(2);
        ars.assignSeat();
        assertEquals(6, ars.getPassengerSeatNumber());
        assertEquals("Economy", ars.getSection());
    }

    @Test
    void application_shouldPresentFirstClass_ifEconomyIsFull() {
        ars.setUserInput(2);
        ars.assignSeat();
        ars.setUserInput(2);
        ars.assignSeat();
        ars.setUserInput(2);
        ars.assignSeat();
        ars.setUserInput(2);
        ars.assignSeat();
        ars.setUserInput(2);
        ars.assignSeat();

        ars.setUserInput(2);
        assertFalse(ars.assignSeat());
        assertEquals("Economy is full, would you like to " +
                "be placed in First Class?", ars.getAlternativeSectionOption());
    }

    @Test
    void application_shouldPresentEconomy_ifFirstClassIsFull() {
        ars.setUserInput(1);
        ars.assignSeat();
        ars.setUserInput(1);
        ars.assignSeat();
        ars.setUserInput(1);
        ars.assignSeat();
        ars.setUserInput(1);
        ars.assignSeat();
        ars.setUserInput(1);
        ars.assignSeat();

        ars.setUserInput(1);
        assertFalse(ars.assignSeat());
        assertEquals("First Class is full, would you like to " +
                "be placed in Economy?", ars.getAlternativeSectionOption());
    }

    @Test
    void passenger_canBeReassigned() {
        ars.setUserInput(1);
        ars.setAlternativeOption(1);
        ars.assignSeat();
        assertTrue(ars.getSeats()[5]);

        ars.setUserInput(2);
        ars.setAlternativeOption(1);
        ars.assignSeat();
        assertTrue(ars.getSeats()[0]);
    }

    @Test
    void test_nextFlightMessage_canBeDisplayed() {
        assertEquals("Next flight leaves in 3 hours.",
                ars.getNextFlightMessage());
    }
}

