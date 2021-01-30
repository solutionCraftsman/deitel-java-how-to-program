package one.seven;

public class Board {
    private final Cell[][] cells;

    public Board() {
        this.cells = new Cell[3][3];
        for (int row = 0; row < cells.length; row++) {
            for (int column = 0; column < cells[row].length; column++) {
                cells[row][column] = new Cell();
            }
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void markCell(int cellNumber, CellValue cellValue) {
        if(isAnEmptyCell(cellNumber)) {
            getCellFromCellNumber(cellNumber).setValue(cellValue);
        }
    }

    public boolean isAnEmptyCell(int cellNumber) {
        return getCellFromCellNumber(cellNumber).getValue().equals(CellValue.EMPTY);
    }

    public Cell getCellFromCellNumber(int cellNumber) {
        cellNumber -= 1;
        return cells[cellNumber / 3][cellNumber % 3];
    }

    public boolean leftColumnIsFilled(CellValue cellValue) {
        return getCellFromCellNumber(1).getValue().equals(cellValue) &&
                getCellFromCellNumber(4).getValue().equals(cellValue) &&
                getCellFromCellNumber(7).getValue().equals(cellValue);
    }

    public boolean topRowIsFilled(CellValue cellValue) {
        return getCellFromCellNumber(1).getValue().equals(cellValue) &&
                getCellFromCellNumber(2).getValue().equals(cellValue) &&
                getCellFromCellNumber(3).getValue().equals(cellValue);
    }

    public boolean rightColumnIsFilled(CellValue cellValue) {
        return getCellFromCellNumber(3).getValue().equals(cellValue) &&
                getCellFromCellNumber(6).getValue().equals(cellValue) &&
                getCellFromCellNumber(9).getValue().equals(cellValue);
    }

    public boolean bottomRowIsFilled(CellValue cellValue) {
        return getCellFromCellNumber(7).getValue().equals(cellValue) &&
                getCellFromCellNumber(8).getValue().equals(cellValue) &&
                getCellFromCellNumber(9).getValue().equals(cellValue);
    }

    public boolean leftDiagonalIsFilled(CellValue cellValue) {
        return getCellFromCellNumber(1).getValue().equals(cellValue) &&
                getCellFromCellNumber(5).getValue().equals(cellValue) &&
                getCellFromCellNumber(9).getValue().equals(cellValue);
    }

    public boolean rightDiagonalIsFilled(CellValue cellValue) {
        return getCellFromCellNumber(3).getValue().equals(cellValue) &&
                getCellFromCellNumber(5).getValue().equals(cellValue) &&
                getCellFromCellNumber(7).getValue().equals(cellValue);
    }

    public void display() {
        for (Cell[] row : cells) {
            for (Cell column : row) {
                System.out.print(column.getValue().getCharacter() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
