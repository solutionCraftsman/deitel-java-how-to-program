package one.seven;

import java.util.Random;

public class DiceRolling {

    private int firstRoll;
    private int secondRoll;
    private static final Random random = new Random();
    private int rollCount;
    private int[] tallyResults;

    public void rollDice() {
        firstRoll = 1 + random.nextInt(6);
        secondRoll = 1 + random.nextInt(6);
    }

    public int getFirstRoll() {
        return firstRoll;
    }

    public int getSecondRoll() {
        return secondRoll;
    }

    public int getSum() {
        return firstRoll + secondRoll;
    }

    public void rollTheDice() {
        tallyResults = new int[36];
        int index;
        for (rollCount = 1; rollCount <= 36_000_000; rollCount++) {
            index = 0;
            rollDice();
            getSum();
            switch (getFirstRoll()) {
                case 1 -> index = getSecondRoll() + (-1);
                case 2 -> index = getSecondRoll() + 5;
                case 3 -> index = getSecondRoll() + 11;
                case 4 -> index = getSecondRoll() + 17;
                case 5 -> index = getSecondRoll() + 23;
                case 6 -> index = getSecondRoll() + 29;
            }
            tallyResults[index]++;
        }
    }

    public int getRollCount() {
        return rollCount;
    }

    public int[] getTallyResults() {
        return tallyResults;
    }

    public void displayTallyResults() {
        System.out.printf("%3s%10d%10d%10d%10d%10d%10d", "", 1, 2, 3, 4, 5, 6);
        for (int index = 0; index < 36; index++) {
            if(index % 6 == 0) {
                System.out.println();
                System.out.printf("%3d", (index / 6) + 1);
            }
            System.out.printf("%10d", tallyResults[index]);
        }
        System.out.println();
    }
}
