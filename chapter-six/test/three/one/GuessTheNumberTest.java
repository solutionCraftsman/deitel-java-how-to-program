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
        int randomNumber = guessTheNumber.getRandomNumber();
        guessTheNumber.guessTheNumber(randomNumber);
        assertEquals("Either you know the secret or you got lucky!",
                guessTheNumber.getFeedback());

        guessTheNumber.generateRandomNumber();
        randomNumber = guessTheNumber.getRandomNumber();
        guessTheNumber.setNoOfGuesses(0);
        guessTheNumber.guessTheNumber(randomNumber - 1);
        guessTheNumber.guessTheNumber(randomNumber - 2);
        guessTheNumber.guessTheNumber(randomNumber - 3);
        guessTheNumber.guessTheNumber(randomNumber - 4);
        guessTheNumber.guessTheNumber(randomNumber - 5);
        guessTheNumber.guessTheNumber(randomNumber - 6);
        guessTheNumber.guessTheNumber(randomNumber - 7);
        guessTheNumber.guessTheNumber(randomNumber - 8);
        guessTheNumber.guessTheNumber(randomNumber - 9);
        guessTheNumber.guessTheNumber(randomNumber);
        assertEquals("Aha! You know the secret!",
                guessTheNumber.getFeedback());

        guessTheNumber.generateRandomNumber();
        randomNumber = guessTheNumber.getRandomNumber();
        guessTheNumber.setNoOfGuesses(0);
        guessTheNumber.guessTheNumber(randomNumber - 1);
        guessTheNumber.guessTheNumber(randomNumber - 2);
        guessTheNumber.guessTheNumber(randomNumber - 3);
        guessTheNumber.guessTheNumber(randomNumber - 4);
        guessTheNumber.guessTheNumber(randomNumber - 5);
        guessTheNumber.guessTheNumber(randomNumber - 6);
        guessTheNumber.guessTheNumber(randomNumber - 7);
        guessTheNumber.guessTheNumber(randomNumber - 8);
        guessTheNumber.guessTheNumber(randomNumber - 9);
        guessTheNumber.guessTheNumber(randomNumber - 10);
        guessTheNumber.guessTheNumber(randomNumber);
        assertEquals("You should be able to do better!",
                guessTheNumber.getFeedback());
    }
}