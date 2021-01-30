package one.seven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    TicTacToe ticTacToe;

    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void boardElements_areInitializedToEmpty() {
        for (Cell[] rows : ticTacToe.getBoard().getCells()) {
            for (Cell cell : rows) {
                assertEquals(CellValue.EMPTY.getCharacter(),
                        cell.getValue().getCharacter());
            }
        }
    }

    @Test
    void x_isPlaced_inTheSpecifiedSquare_whereverTheFirstPlayerMoves() {
        ticTacToe.getFirstPlayer().toggleTurn();
        ticTacToe.makeAMove(1);
        assertEquals(CellValue.X.getCharacter(),
                ticTacToe.getBoard().getCellFromCellNumber(1).getValue().getCharacter());
    }

    @Test
    void o_isPlaced_inTheSpecifiedSquare_whereverTheSecondPlayerMoves() {
        ticTacToe.getSecondPlayer().toggleTurn();
        ticTacToe.makeAMove(5);
        assertEquals(CellValue.O.getCharacter(),
                ticTacToe.getBoard().getCellFromCellNumber(5).getValue().getCharacter());
    }

    @Test
    void eachMove_isTo_anEmptySquare() {
        ticTacToe.getFirstPlayer().toggleTurn();
        ticTacToe.makeAMove(1);
        assertFalse(ticTacToe.getBoard().isAnEmptyCell(1));
    }

    @Test
    void determineWhether_gameHasBeenWon_afterEachMove() {
        ticTacToe.getFirstPlayer().toggleTurn();

        for (int cellNumber = 1; !ticTacToe.gameHasBeenWon(); cellNumber++) {
            ticTacToe.makeAMove(cellNumber);
        }

        assertTrue(ticTacToe.gameHasBeenWon());
        assertTrue(ticTacToe.getFirstPlayer().won());
    }

    //xxo
    //oox
    //xox
    @Test
    void determineWhether_gameIsADraw() {
        ticTacToe.getFirstPlayer().toggleTurn();
        ticTacToe.makeAMove(1);
        ticTacToe.makeAMove(3);
        ticTacToe.makeAMove(2);
        ticTacToe.makeAMove(4);
        ticTacToe.makeAMove(6);
        ticTacToe.makeAMove(5);
        ticTacToe.makeAMove(7);
        ticTacToe.makeAMove(8);
        ticTacToe.makeAMove(9);

        assertTrue(ticTacToe.gameIsADraw());
        assertFalse(ticTacToe.gameHasBeenWon());
        assertFalse(ticTacToe.getFirstPlayer().won());
        assertFalse(ticTacToe.getSecondPlayer().won());
    }
}