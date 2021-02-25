package two.two;

public enum SquareAccessibilityNumber {

    TWO(2),
    THREE(3),
    FOUR(4),
    SIX(6),
    EIGHT(8);

    private final int value;

    public int getValue() {
        return value;
    }

    SquareAccessibilityNumber(int value) {
        this.value = value;
    }
}