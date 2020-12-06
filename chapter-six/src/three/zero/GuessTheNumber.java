package three.zero;

import java.security.SecureRandom;

public class GuessTheNumber {

    private static final SecureRandom sr = new SecureRandom();
    private int randomNumber;

    public void generateRandomNumber() {
        randomNumber = 1 + sr.nextInt(20);
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public String guessTheNumber(int guess) {
        String result;
        if(guess < randomNumber) {
            result = "Too low. Try again.";
        }
        else {
            if (guess > randomNumber) {
                result = "Too high. Try again.";
            }
            else {
                result = "Congratulations. You guessed the number!";
            }
        }
        return result;
    }
}

