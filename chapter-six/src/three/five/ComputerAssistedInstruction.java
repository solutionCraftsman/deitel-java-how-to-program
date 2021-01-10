package three.five;

import java.security.SecureRandom;

public class ComputerAssistedInstruction {

    private static final SecureRandom secureRandom = new SecureRandom();
    private int firstRandomNumber;
    private int secondRandomNumber;

    public void generateRandomNumbers() {
        firstRandomNumber = 1 + secureRandom.nextInt(10);
        secondRandomNumber = 1 + secureRandom.nextInt(10);
    }


    public int getFirstRandomNumber() {
        return firstRandomNumber;
    }

    public int getSecondRandomNumber() {
        return secondRandomNumber;
    }
}
