package one.seven;

public enum CellValue {
    EMPTY(' '),
    X('x'),
    O('o');

    private final char value;

    CellValue() {
        value = ' ';
    }

    CellValue(char value) {
        this.value = value;
    }

    public char getCharacter() {
        return value;
    }
}
