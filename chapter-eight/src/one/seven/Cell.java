package one.seven;

public class Cell {
    private CellValue value;

    public Cell() {
        this.value = CellValue.EMPTY;
    }

    public CellValue getValue() {
        return value;
    }

    public void setValue(CellValue value) {
        this.value = value;
    }
}
