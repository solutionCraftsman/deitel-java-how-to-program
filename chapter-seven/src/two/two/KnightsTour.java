package two.two;

public class KnightsTour {

    private Position currentPosition;

    public KnightsTour(Board board, Position currentPosition) {
        this.currentPosition = currentPosition;
        board.getSquare(currentPosition).hasBeenVisitedByKnight(true);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void move(Board board, KnightMove knightMove) {
        Position newPosition = new Position(
                getCurrentPosition().getRow() + knightMove.getNumberOfVerticalSteps(),
                getCurrentPosition().getColumn() + knightMove.getNumberOfHorizontalSteps());

        if(knightDoesNotLandOffTheChessboard(newPosition)){
            if(!board.getSquare(newPosition).hasBeenVisitedByKnight()) {
                setCurrentPosition(newPosition);
                board.getSquare(newPosition).hasBeenVisitedByKnight(true);
            }
        }
    }

    public boolean knightDoesNotLandOffTheChessboard(Position newPosition) {
        return newRowOrColumnIsWithinBoardRange(newPosition.getRow()) &&
                newRowOrColumnIsWithinBoardRange(newPosition.getColumn());
    }

    private boolean newRowOrColumnIsWithinBoardRange(int newRowOrColumn) {
        return (0 <= newRowOrColumn) && (newRowOrColumn < Board.ROW_AND_COLUMN_RANGE);
    }

    private void setCurrentPosition(Position newPosition) {
        currentPosition = newPosition;
    }
}
