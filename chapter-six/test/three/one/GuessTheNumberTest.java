package three.one;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import three.zero.GuessTheNumber;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testModifiedProgramReturnsFeedback() {
        GuessTheNumber guessTheNumber = new GuessTheNumber();

        guessTheNumber.generateRandomNumber();
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber());
        assertEquals("Either you know the secret or you got lucky!",
                guessTheNumber.getFeedback());

        guessTheNumber.generateRandomNumber();
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 1);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 2);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 3);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 4);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 5);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 6);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 7);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 8);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 9);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber());
        assertEquals("Aha! You know the secret!",
                guessTheNumber.getFeedback());

        guessTheNumber.generateRandomNumber();
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 1);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 2);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 3);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 4);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 5);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 6);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 7);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 8);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 9);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber() - 10);
        guessTheNumber.guessTheNumber(guessTheNumber.getRandomNumber());
        assertEquals("You should be able to do better!",
                guessTheNumber.getFeedback());
    }
}