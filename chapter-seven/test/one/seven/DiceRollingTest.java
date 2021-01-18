package one.seven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceRollingTest {

    DiceRolling diceRolling;

    @BeforeEach
    void setUp() {
        diceRolling = new DiceRolling();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDiceRollingSimulation() {
        diceRolling.rollDice();
        assertTrue((1 <= diceRolling.getFirstRoll()) && (diceRolling.getFirstRoll() <= 6));
        assertTrue((1 <= diceRolling.getSecondRoll()) && (diceRolling.getSecondRoll() <= 6));
    }

    @Test
    void testSumOfRolledDice_canBeCalculated() {
        diceRolling.rollDice();
        assertEquals((diceRolling.getFirstRoll() + diceRolling.getSecondRoll()), diceRolling.getSum());
    }

    @Test
    void testThatDice_isRolled_thirtySixMillionTimes() {
        diceRolling.rollTheDice();
        assertEquals(36_000_000, diceRolling.getRollCount() - 1);
    }

    @Test
    void testFrequencyOfSums_canBeTallied_andDisplayed() {
        diceRolling.rollTheDice();
        diceRolling.displayTallyResults();
        assertNotNull(diceRolling.getTallyResults());
        assertTrue(diceRolling.getTallyResults()[0] > 0);
        assertTrue(diceRolling.getTallyResults()[6 - 1] > 0);
        assertTrue(diceRolling.getTallyResults()[12 - 1] > 0);
        assertTrue(diceRolling.getTallyResults()[18 - 1] > 0);
        assertTrue(diceRolling.getTallyResults()[24 - 1] > 0);
        assertTrue(diceRolling.getTallyResults()[30 - 1] > 0);
        assertTrue(diceRolling.getTallyResults()[36 - 1] > 0);
    }
}

