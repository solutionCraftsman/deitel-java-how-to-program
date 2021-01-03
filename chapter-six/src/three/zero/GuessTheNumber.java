package three.zero;

import java.security.SecureRandom;

public class GuessTheNumber {

    private static final SecureRandom sr = new SecureRandom();
    private int randomNumber;
    private int noOfTries = 0;

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
        noOfTries++;
        return result;
    }

    public String getFeedback() {
        String feedback = "";
        if(noOfTries < 10) {
            feedback = "Either you know the secret or you got lucky!";
        }
        else if(noOfTries == 10) {
            feedback ="Aha! You know the secret!";
        }
        else {
            feedback = "You should be able to do better!";
        }
        return feedback;
    }
}

