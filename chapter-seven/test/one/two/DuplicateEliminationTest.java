package one.two;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {

    DuplicateElimination duplicateElimination;

    @BeforeEach
    void setUp() {
        duplicateElimination = new DuplicateElimination();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThat_fiveNumbersBetweenTenAndHundred_canBeInput() {
        duplicateElimination.readNumbers();
        assertEquals(10, duplicateElimination.getNumbers()[0]);
        assertEquals(30, duplicateElimination.getNumbers()[1]);
        assertEquals(50, duplicateElimination.getNumbers()[2]);
        assertEquals(70, duplicateElimination.getNumbers()[3]);
        assertEquals(100, duplicateElimination.getNumbers()[4]);
    }

    @Test
    void testThat_numberRead_isBetweenTenAndHundredInclusive() {
        assertTrue(duplicateElimination.inValidInput(5));
        assertFalse(duplicateElimination.inValidInput(50));
    }

    @Test
    void testThat_numberIsAdded_andDisplayed_onlyIfUnique() {
        duplicateElimination.addNumber(20);
        assertTrue(duplicateElimination.numberAlreadyAdded(20));
        assertFalse(duplicateElimination.numberAlreadyAdded(10));
    }

    @Test
    void testThat_worstCaseOfDifferentFiveNumbers_canBeHandled() {
        int[] expected = {10, 20, 30, 40, 50};
        duplicateElimination.addNumber(10);
        duplicateElimination.addNumber(20);
        duplicateElimination.addNumber(30);
        duplicateElimination.addNumber(40);
        duplicateElimination.addNumber(50);

        assertEquals(5, duplicateElimination.getNumbers().length);
        assertArrayEquals(expected, duplicateElimination.getNumbers());
    }

    @Test
    void testThat_smallestPossibleArray_isUsed() {
        int[] expected = {10, 20, 30};
        duplicateElimination.addNumber(10);
        duplicateElimination.addNumber(10);
        duplicateElimination.addNumber(20);
        duplicateElimination.addNumber(20);
        duplicateElimination.addNumber(30);

        assertEquals(3, duplicateElimination.getNumbers().length);
        assertArrayEquals(expected, duplicateElimination.getNumbers());
    }

    @Test
    void testThat_completeSetOfUniqueValues_canBeDisplayed_afterEachNewValue_isEntered() {
        int[] expected = {20};
        duplicateElimination.addNumber(20);
        assertArrayEquals(expected, duplicateElimination.getNumbers());

        duplicateElimination.addNumber(20);
        assertArrayEquals(expected, duplicateElimination.getNumbers());
    }
}