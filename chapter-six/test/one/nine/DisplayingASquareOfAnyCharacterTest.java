package one.nine;

import one.eight.DisplayingASquareOfAsterisks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayingASquareOfAnyCharacterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSquareOfAnyCharacter() {
        DisplayingASquareOfAnyCharacter displayingASquareOfAnyCharacter = new DisplayingASquareOfAnyCharacter();
        displayingASquareOfAnyCharacter.squareOfCharacter(7, '&');
        assertEquals(7, displayingASquareOfAnyCharacter.getRowCounter());
        assertEquals(7, displayingASquareOfAnyCharacter.getColumnCounter());
    }
}