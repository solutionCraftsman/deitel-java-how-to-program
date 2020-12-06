package three.zero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {

    GuessTheNumber gtn;
    int randomNumber;

    @BeforeEach
    void setUp() {
        gtn = new GuessTheNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkThatRandomNumberIsBetweenOneAndTwenty() {
        int minimum = 1, maximum = 20;
        gtn.generateRandomNumber();
        randomNumber = gtn.getRandomNumber();
        assertTrue((minimum < randomNumber) && (randomNumber < maximum));
    }

    @Test
    void verifyThatTheProgramPrintsTooLowIfUsersGuessIsLowerThanRandomNumber() {
        gtn.generateRandomNumber();
        randomNumber = gtn.getRandomNumber();
        String result = gtn.guessTheNumber(randomNumber - 5);
        assertSame("Too low. Try again.", result);
    }

    @Test
    void verifyThatTheProgramPrintsTooHighIfUsersGuessIsLowerThanRandomNumber() {
        gtn.generateRandomNumber();
        randomNumber = gtn.getRandomNumber();
        String result = gtn.guessTheNumber(randomNumber + 5);
        assertSame("Too high. Try again.", result);
    }

    @Test
    void verifyThatTheProgramPrintsCongratulationsIfUsersGuessIsCorrect() {
        gtn.generateRandomNumber();
        randomNumber = gtn.getRandomNumber();
        String result = gtn.guessTheNumber(randomNumber);
        assertSame("Congratulations. You guessed the number!", result);
    }
}