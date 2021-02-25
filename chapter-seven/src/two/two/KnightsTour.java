package two.two;

public class KnightsTour {

    private Position currentPosition;
    private KnightMoveNumber knightMoveNumber;

    public KnightsTour(Board board, Position currentPosition) {
        this.currentPosition = currentPosition;
        board.getSquare(currentPosition.getRow(), currentPosition.getColumn()).
                setToHaveBeenVisitedByKnight();
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setKnightMoveNumber(KnightMoveNumber knightMoveNumber) {
        this.knightMoveNumber = knightMoveNumber;
    }

    public void move(Board board) {

        if(knightDoesNotLandOffTheChessboard(board)){
            if(squareHasNotBeenVisited(board)) {
                setCurrentPosition(getNewPosition());
                board.getSquare(currentPosition.getRow(),
                        currentPosition.getColumn()).setToHaveBeenVisitedByKnight();
            }
        }

    }

    public boolean squareHasNotBeenVisited(Board board) {
        return !board.getSquare(getNewPosition().getRow(),
                getNewPosition().getColumn()).hasBeenVisitedByKnight();
    }

    public Position getNewPosition() {
        return new Position(
                getCurrentPosition().getRow() + knightMoveNumber.getNumberOfVerticalSteps(),
                getCurrentPosition().getColumn() + knightMoveNumber.getNumberOfHorizontalSteps());
    }

    public boolean knightDoesNotLandOffTheChessboard(Board board) {
        try {
            return board.isValidSquare(getNewPosition().getRow(), getNewPosition().getColumn());
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new RuntimeException("Invalid move. Knight Lands off Board.");
        }
    }

    private void setCurrentPosition(Position newPosition) {
        currentPosition = newPosition;
    }
}
