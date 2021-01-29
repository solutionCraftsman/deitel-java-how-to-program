package two.two;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;

class KnightsTourTest {

    Board board;
    KnightsTour kn;

    @BeforeEach
    void setUp() {
        board = new Board();
        kn = new KnightsTour(board, new Position(3, 4));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void knight_canMake_moveNumberOne() {
        kn.move(board, new KnightMove(1));
        assertEquals(new Position(2, 6), kn.getCurrentPosition());
    }

    @Test
    void knight_canMake_moveNumberTwo() {
        kn.move(board, new KnightMove(2));
        assertEquals(new Position(1, 5), kn.getCurrentPosition());
    }

    @Test
    void knight_canMake_moveNumberThree() {
        kn.move(board, new KnightMove(3));
        assertEquals(new Position(1, 3), kn.getCurrentPosition());
    }

    @Test
    void knight_canMake_moveNumberFour() {
        kn.move(board, new KnightMove(4));
        assertEquals(new Position(2, 2), kn.getCurrentPosition());
    }

    @Test
    void knight_canMake_moveNumberFive() {
        kn.move(board, new KnightMove(5));
        assertEquals(new Position(4, 2), kn.getCurrentPosition());
    }

    @Test
    void knight_canMake_moveNumberSix() {
        kn.move(board, new KnightMove(6));
        assertEquals(new Position(5, 3), kn.getCurrentPosition());
    }

    @Test
    void knight_canMake_moveNumberSeven() {
        kn.move(board, new KnightMove(7));
        assertEquals(new Position(5, 5), kn.getCurrentPosition());
    }

    @Test
    void knight_canMake_moveNumberEight() {
        kn.move(board, new KnightMove(8));
        assertEquals(new Position(4, 6), kn.getCurrentPosition());
    }

    @Test
    void knight_cannotVisit_sameSquareTwice() {
        Position currentPosition = kn.getCurrentPosition();

        kn.move(board, new KnightMove(8));
        assertTrue(board.getSquare(currentPosition).hasBeenVisitedByKnight());

        currentPosition = kn.getCurrentPosition();
        kn.move(board, new KnightMove(6));
        assertTrue(board.getSquare(currentPosition).hasBeenVisitedByKnight());
    }

    @Test
    void knight_doesNotLand_offTheChessboard() {
        kn.move(board, new KnightMove(1));

        Position invalidPosition = new Position(1, 8);
        assertFalse(kn.knightDoesNotLandOffTheChessboard(invalidPosition));
        Position currentPosition = kn.getCurrentPosition();

        kn.move(board, new KnightMove(1));
        assertEquals(currentPosition, kn.getCurrentPosition());
    }

    @Test
    void moveKnight_aroundChessboard() {
        Position currentPosition;
        Position previousPosition;

        for (int counter = 1, uniquePositions = 1; counter <= 64; counter++) {
            previousPosition = kn.getCurrentPosition();
            SecureRandom secureRandom = new SecureRandom();
//            kn.move(board, new KnightMove(counter % 8));
            kn.move(board, new KnightMove(1 + secureRandom.nextInt(8)));
            currentPosition = kn.getCurrentPosition();

            System.out.println("Counter: " + counter);
            if(!currentPosition.equals(previousPosition)){
                System.out.print(uniquePositions + " - ");
                System.out.print(kn.getCurrentPosition().getRow() + ", " +
                        kn.getCurrentPosition().getColumn());
                uniquePositions++;
                System.out.println("\n");
            }
        }
    }
}