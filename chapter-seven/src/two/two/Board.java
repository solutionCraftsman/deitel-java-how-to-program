package two.two;

public class Board {

    public static final int ROW_AND_COLUMN_RANGE = 8;
    private static final int MINIMUM_ROW_AND_COLUMN = 0;
    private static final int MAXIMUM_ROW_AND_COLUMN = 7;
    private final Square[][] squares;

    public Board() {
        this.squares = new Square[ROW_AND_COLUMN_RANGE][ROW_AND_COLUMN_RANGE];
        initializeSquaresWithAccessibilityNumbers();
    }

    private void initializeSquaresWithAccessibilityNumbers() {
        for (int row = 0; row < squares.length; row++) {
            for (int column = 0; column < squares[row].length; column++) {

                SquareAccessibilityNumber accessibilityNumber;

                if(row == MINIMUM_ROW_AND_COLUMN || row == MAXIMUM_ROW_AND_COLUMN) {
                    if(column == MINIMUM_ROW_AND_COLUMN ||
                            column == MAXIMUM_ROW_AND_COLUMN) {
                        accessibilityNumber = SquareAccessibilityNumber.TWO;
                    }
                    else
                    if(column == MINIMUM_ROW_AND_COLUMN + 1 ||
                            column == MAXIMUM_ROW_AND_COLUMN - 1) {
                        accessibilityNumber = SquareAccessibilityNumber.THREE;
                    }
                    else {
                        accessibilityNumber = SquareAccessibilityNumber.FOUR;
                    }
                }
                else
                if(row == MINIMUM_ROW_AND_COLUMN + 1 || row == MAXIMUM_ROW_AND_COLUMN - 1) {
                    if(column == MINIMUM_ROW_AND_COLUMN ||
                            column == MAXIMUM_ROW_AND_COLUMN) {
                        accessibilityNumber = SquareAccessibilityNumber.THREE;
                    }
                    else
                    if(column == MINIMUM_ROW_AND_COLUMN + 1 ||
                            column == MAXIMUM_ROW_AND_COLUMN - 1) {
                        accessibilityNumber = SquareAccessibilityNumber.FOUR;
                    }
                    else {
                        accessibilityNumber = SquareAccessibilityNumber.SIX;
                    }
                }
                else {
                    if(column == MINIMUM_ROW_AND_COLUMN ||
                            column == MAXIMUM_ROW_AND_COLUMN) {
                        accessibilityNumber = SquareAccessibilityNumber.FOUR;
                    }
                    else
                    if(column == MINIMUM_ROW_AND_COLUMN + 1 ||
                            column == MAXIMUM_ROW_AND_COLUMN - 1) {
                        accessibilityNumber = SquareAccessibilityNumber.SIX;
                    }
                    else {
                        accessibilityNumber = SquareAccessibilityNumber.EIGHT;
                    }
                }
                squares[row][column] = new Square(accessibilityNumber);
            }
        }
    }

    public Square getSquare(int rowNumber, int columnNumber) {
        Square square = null;
        if(isValidSquare(rowNumber, columnNumber))
            square =  squares[rowNumber][columnNumber];

        return square;
    }

    private boolean validRowOrColumn(int rowOrColumn) {
        return (MINIMUM_ROW_AND_COLUMN <= rowOrColumn) && (rowOrColumn <= MAXIMUM_ROW_AND_COLUMN);
    }

    public boolean isValidSquare(int rowNumber, int columnNumber) {
        if(validRowOrColumn(rowNumber)) {
            if(validRowOrColumn(columnNumber)) {
                return true;
            }
            throw new ArrayIndexOutOfBoundsException("Invalid column number " + columnNumber);
        }
        throw new ArrayIndexOutOfBoundsException("Invalid row number " + rowNumber);
    }
}
