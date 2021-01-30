package one.seven;

public class TicTacToe {

    private final Board board;
    private final Player firstPlayer;
    private final Player secondPlayer;
    private boolean gameHasBeenWon;
    private boolean gameIsADraw;

    public TicTacToe() {
        this.board = new Board();
        firstPlayer = new Player();
        secondPlayer = new Player();
    }

    public Board getBoard() {
        return board;
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public void makeAMove(int cellNumber) {
        if(firstPlayer.isNextToPlay()) {
            board.markCell(cellNumber, CellValue.X);
            firstPlayer.toggleTurn();
            secondPlayer.toggleTurn();
        } else {
            if(secondPlayer.isNextToPlay()) {
                board.markCell(cellNumber, CellValue.O);
                secondPlayer.toggleTurn();
                firstPlayer.toggleTurn();
            }
        }

        board.display();
        analyzeGame();
    }

    private void analyzeGame() {
        if(playerHasWon(CellValue.X)) {
            firstPlayer.setWon(true);
        } else {
            if(playerHasWon(CellValue.O)) {
                secondPlayer.setWon(true);
            }
        }

        if(firstPlayer.won() || secondPlayer.won()) {
            gameHasBeenWon = true;
        } else {
            gameIsADraw = true;
        }
    }

    private boolean playerHasWon(CellValue cellValue) {
        return board.leftColumnIsFilled(cellValue) || board.topRowIsFilled(cellValue) ||
                board.rightColumnIsFilled(cellValue) || board.bottomRowIsFilled(cellValue) ||
                board.leftDiagonalIsFilled(cellValue) || board.rightDiagonalIsFilled(cellValue);
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public boolean gameHasBeenWon() {
        return gameHasBeenWon;
    }

    public boolean gameIsADraw() {
        return gameIsADraw;
    }
}
