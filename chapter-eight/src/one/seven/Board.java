package one.seven;

public class Board {
    private final Cell[][] cells;
    private static final int DIMENSION = 3;

    public Board() {
        this.cells = new Cell[DIMENSION][DIMENSION];
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
        return cells[cellNumber / DIMENSION][cellNumber % DIMENSION];
    }

    public boolean anyRowIsFilledWith(CellValue cellValue) {
        boolean rowHasBeenSoFarFilledWithThisValue;

        for (int row = 0; row < DIMENSION; row++) {
            rowHasBeenSoFarFilledWithThisValue = true;
            for (int column = 0; column < DIMENSION && rowHasBeenSoFarFilledWithThisValue; column++) {
                if(!cells[row][column].getValue().equals(cellValue)) {
                    rowHasBeenSoFarFilledWithThisValue = false;
                }
            }

            if(rowHasBeenSoFarFilledWithThisValue) {
                return true;
            }

        }

        return false;
    }

    public boolean anyColumnIsFilledWith(CellValue cellValue) {
        boolean columnHasBeenSoFarFilledWithThisValue;

        for (int column = 0; column < DIMENSION; column++) {
            columnHasBeenSoFarFilledWithThisValue = true;
            for (int row = 0; row < DIMENSION && columnHasBeenSoFarFilledWithThisValue; row++) {
                if(!cells[row][column].getValue().equals(cellValue) ) {
                    columnHasBeenSoFarFilledWithThisValue = false;
                }
            }

            if(columnHasBeenSoFarFilledWithThisValue) {
                return true;
            }
        }

        return false;

    }

    public boolean leftDiagonalIsFilledWith(CellValue cellValue) {
        boolean leftDiagonalHasBeenSoFarFilledWithThisValue = true;

        for (int rowAndColumn = 0;
             rowAndColumn < DIMENSION && leftDiagonalHasBeenSoFarFilledWithThisValue; rowAndColumn++) {
            if(!cells[rowAndColumn][rowAndColumn].getValue().equals(cellValue)){
                leftDiagonalHasBeenSoFarFilledWithThisValue = false;
            }
        }

        return leftDiagonalHasBeenSoFarFilledWithThisValue;
    }

    public boolean rightDiagonalIsFilledWith(CellValue cellValue) {
        boolean rightDiagonalHasBeenSoFarFilledWithThisValue = true;
        for (int row = 0, column = DIMENSION - 1;
             row < DIMENSION && column >= 0 && rightDiagonalHasBeenSoFarFilledWithThisValue; row++, column--) {
            if(!cells[row][column].getValue().equals(cellValue)){
                rightDiagonalHasBeenSoFarFilledWithThisValue = false;
            }
        }

        return rightDiagonalHasBeenSoFarFilledWithThisValue;
    }

    public String display() {
        StringBuilder boardDisplay = new StringBuilder();
        boardDisplay.append("-------------\n");
        for (Cell[] row : cells) {
            boardDisplay.append("| ");
            for (Cell column : row) {
                boardDisplay.append(column.getValue().getCharacter()).append(" | ");
            }
            boardDisplay.append("\n-------------");
            boardDisplay.append("\n");
        }
        boardDisplay.append("\n");

        return boardDisplay.toString();
    }

    public boolean isCompletelyFilled() {
        for (int cellNumber = 1; cellNumber <= DIMENSION * DIMENSION; cellNumber++) {
            if(getCellFromCellNumber(cellNumber).getValue().equals(CellValue.EMPTY)) {
                return false;
            }
        }
        return true;
    }
}
