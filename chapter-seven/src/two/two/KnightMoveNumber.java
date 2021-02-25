package two.two;

import java.security.SecureRandom;

public enum KnightMoveNumber {

    ONE(0),
    TWO(1),
    THREE(2),
    FOUR(3),
    FIVE(4),
    SIX(5),
    SEVEN(6),
    EIGHT(7);

    private final int numberOfHorizontalSteps;
    private final int numberOfVerticalSteps;

    KnightMoveNumber(int moveNumber) {
        int[] horizontal = new int[8];
        int[] vertical = new int[8];

        horizontal[0] = 2; vertical[0] = -1;
        horizontal[1] = 1; vertical[1] = -2;
        horizontal[2] = -1; vertical[2] = -2;
        horizontal[3] = -2; vertical[3] = -1;
        horizontal[4] = -2; vertical[4] = 1;
        horizontal[5] = -1; vertical[5] = 2;
        horizontal[6] = 1; vertical[6] = 2;
        horizontal[7] = 2; vertical[7] = 1;

        this.numberOfHorizontalSteps = horizontal[moveNumber];
        this.numberOfVerticalSteps = vertical[moveNumber];
    }

    public int getNumberOfHorizontalSteps() {
        return numberOfHorizontalSteps;
    }

    public int getNumberOfVerticalSteps() {
        return numberOfVerticalSteps;
    }

    public static KnightMoveNumber random() {
        SecureRandom random = new SecureRandom();
        return values()[random.nextInt(values().length)];
    }
}
