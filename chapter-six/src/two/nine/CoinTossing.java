package two.nine;

import java.security.SecureRandom;

public class CoinTossing {

    private static SecureRandom secureRandom;
    private int noOfHeads;
    private int noOfTails;
    private int randomNumber;

    public enum Coin {
        HEADS,
        TAILS
    }

    public CoinTossing() {
        secureRandom = new SecureRandom();
        noOfHeads = 0;
        noOfTails = 0;
    }

    public void tossCoin() {
        randomNumber = secureRandom.nextInt(2);
        switch (randomNumber) {
            case 0 -> noOfHeads++;
            case 1 -> noOfTails++;
        }
    }

    public int getNoOfHeads() {
        return noOfHeads;
    }

    public int getNoOfTails() {
        return noOfTails;
    }

    public Coin flip() {
        return (randomNumber == 0) ? Coin.HEADS : Coin.TAILS;
    }
}
