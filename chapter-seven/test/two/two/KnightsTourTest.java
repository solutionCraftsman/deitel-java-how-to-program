package two.two;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;

class KnightsTourTest {

    Board board;
    KnightsTour knightsTour;

    @BeforeEach
    void setUp() {
        board = new Board();
        knightsTour = new KnightsTour(board, new Position(3, 4));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void knightHas_aPosition() {
        assertNotNull(knightsTour.getCurrentPosition());
        assertEquals(new Position(3, 4), knightsTour.getCurrentPosition());
    }

    @Test
    void knightCanMake_moveNumberOne() {
        knightsTour.setKnightMoveNumber(KnightMoveNumber.ONE);
        knightsTour.move(board);
        assertEquals(new Position(2, 6), knightsTour.getCurrentPosition());
    }

    @Test
    void knightCanMake_moveNumberTwo() {
        knightsTour.setKnightMoveNumber(KnightMoveNumber.TWO);
        knightsTour.move(board);
        assertEquals(new Position(1, 5), knightsTour.getCurrentPosition());
    }

    @Test
    void knightCanMake_moveNumberThree() {
        knightsTour.setKnightMoveNumber(KnightMoveNumber.THREE);
        knightsTour.move(board);
        assertEquals(new Position(1, 3), knightsTour.getCurrentPosition());
    }

    @Test
    void knightCanMake_moveNumberFour() {
        knightsTour.setKnightMoveNumber(KnightMoveNumber.FOUR);
        knightsTour.move(board);
        assertEquals(new Position(2, 2), knightsTour.getCurrentPosition());
    }

    @Test
    void knightCanMake_moveNumberFive() {
        knightsTour.setKnightMoveNumber(KnightMoveNumber.FIVE);
        knightsTour.move(board);
        assertEquals(new Position(4, 2), knightsTour.getCurrentPosition());
    }

    @Test
    void knightCanMake_moveNumberSix() {
        knightsTour.setKnightMoveNumber(KnightMoveNumber.SIX);
        knightsTour.move(board);
        assertEquals(new Position(5, 3), knightsTour.getCurrentPosition());
    }

    @Test
    void knightCanMake_moveNumberSeven() {
        knightsTour.setKnightMoveNumber(KnightMoveNumber.SEVEN);
        knightsTour.move(board);
        assertEquals(new Position(5, 5), knightsTour.getCurrentPosition());
    }

    @Test
    void knightCanMake_moveNumberEight() {
        knightsTour.setKnightMoveNumber(KnightMoveNumber.EIGHT);
        knightsTour.move(board);
        assertEquals(new Position(4, 6), knightsTour.getCurrentPosition());
    }

    @Test
    void knight_cannotVisit_sameSquareTwice() {
        Position currentPosition = knightsTour.getCurrentPosition();
        assertTrue(board.getSquare(currentPosition.getRow(), currentPosition.getColumn()).hasBeenVisitedByKnight());

        knightsTour.setKnightMoveNumber(KnightMoveNumber.EIGHT);
        knightsTour.move(board);
        assertTrue(board.getSquare(currentPosition.getRow(), currentPosition.getColumn()).hasBeenVisitedByKnight());

        currentPosition = knightsTour.getCurrentPosition();
        knightsTour.setKnightMoveNumber(KnightMoveNumber.SIX);
        knightsTour.move(board);
        assertTrue(board.getSquare(currentPosition.getRow(), currentPosition.getColumn()).hasBeenVisitedByKnight());
    }

    @Test
    void squaresHaveAccessibilityNumbers() {
        for (Square[] squares : board.getSquares()) {
            for (Square square : squares) {
                assertNotNull(square.getAccessibilityNumber());
                assertNotEquals(0, square.getAccessibilityNumber().getValue());
            }
        }
    }

    @Test
    void getRandomKnightMoveNumber() {
        assertNotNull(KnightMoveNumber.random());
    }

    @Test
    void knight_doesNotLand_offTheChessboard() {
        Board board = new Board();

        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> new KnightsTour(board, new Position(1, 8)));

        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> new KnightsTour(board, new Position(8, 1)));

        knightsTour.setKnightMoveNumber(KnightMoveNumber.ONE);
        knightsTour.move(board);
        Position currentPosition = knightsTour.getCurrentPosition();
        knightsTour.setKnightMoveNumber(KnightMoveNumber.ONE);

        assertThrows(RuntimeException.class,
                () -> knightsTour.move(board));

        assertEquals(currentPosition, knightsTour.getCurrentPosition());
    }

    @Test
    void moveKnight_aroundChessboard() {
        SecureRandom secureRandom = new SecureRandom();
        Board board = new Board();
        /*KnightsTour knightsTour = new KnightsTour(board,
                new Position(secureRandom.nextInt(Board.ROW_AND_COLUMN_RANGE),
                        secureRandom.nextInt(Board.ROW_AND_COLUMN_RANGE)));*/

        KnightsTour knightsTour = new KnightsTour(board, new Position(0, 0));
        Position currentPosition = knightsTour.getCurrentPosition();
        Position previousPosition;

        System.out.println();
        System.out.println("Starting at:");
        System.out.println("Row: " + currentPosition.getRow() + "\n" +
                "Column: " + currentPosition.getColumn());
        System.out.println("------------------");

        for (int counter = 1, movesMade = 0; counter <= 64; counter++) {
            previousPosition = knightsTour.getCurrentPosition();

            boolean isNotAValidMoveNumber = true;
            boolean isNotAnUnvisitedSquare = true;

            while (isNotAValidMoveNumber && isNotAnUnvisitedSquare) {

                Square newSquare;
                Square leastAccessibleSquare = new Square(SquareAccessibilityNumber.EIGHT);
                KnightMoveNumber moveToLeastAccessibleSquare = KnightMoveNumber.random();
                Position newPosition;

                try {

                    for (KnightMoveNumber knightMoveNumber : KnightMoveNumber.values()) {
                        knightsTour.setKnightMoveNumber(knightMoveNumber);
                        if(knightsTour.squareHasNotBeenVisited(board) &&
                                knightsTour.knightDoesNotLandOffTheChessboard(board)) {

                            newPosition = knightsTour.getNewPosition();
                            newSquare = board.getSquare(newPosition.getRow(), newPosition.getColumn());
                            if(newSquare.getAccessibilityNumber().getValue() <
                                    leastAccessibleSquare.getAccessibilityNumber().getValue()) {
                                moveToLeastAccessibleSquare = knightMoveNumber;
                            }
                        }
                    }

                } catch (RuntimeException runtimeException) {
                    System.err.println(runtimeException.getMessage());
                }

                knightsTour.setKnightMoveNumber(moveToLeastAccessibleSquare);

                try {

                    if (knightsTour.knightDoesNotLandOffTheChessboard(board))
                        isNotAValidMoveNumber = false;

                    if (knightsTour.squareHasNotBeenVisited(board))
                        isNotAnUnvisitedSquare = false;

                } catch (RuntimeException runtimeException) {
                    System.err.println(runtimeException.getMessage());
                }
            }

            knightsTour.move(board);
            currentPosition = knightsTour.getCurrentPosition();

            if (!currentPosition.equals(previousPosition)) {
                movesMade++;
                System.out.println("Row: " + currentPosition.getRow() + "\n" +
                        "Column: " + currentPosition.getColumn());
            }

            System.out.println("Counter: " + counter);
            System.out.println("Moves made: " + movesMade);
            System.out.println("------------------");
        }
    }
}
