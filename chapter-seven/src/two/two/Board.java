package two.two;

public class Board {

    public static final int ROW_AND_COLUMN_RANGE = 8;
    private final Square[][] squares;

    public Board() {
        this.squares = new Square[8][8];
        for (int row = 0; row < squares.length; row++) {
            for (int column = 0; column < squares[row].length; column++) {
                squares[row][column] = new Square();
            }
        }
    }

    public Square getSquare(Position newPosition) {
        return squares[newPosition.getRow()][newPosition.getColumn()];
    }
}
