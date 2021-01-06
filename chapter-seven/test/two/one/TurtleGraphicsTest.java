package two.one;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleGraphicsTest {

    TurtleGraphics turtleGraphics;

    @BeforeEach
    void setUp() {
        int[] movementCommand = {5, 6, 3, 5, 5, 9};
        turtleGraphics = new TurtleGraphics(movementCommand);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatTurtleCanMove() {
        int[] movementCommand = {5, 10, 3, 5, 5};
        turtleGraphics.setMovementCommand(movementCommand);
        turtleGraphics.move();

        System.out.println(turtleGraphics.getPosition()[0]);
        System.out.println(turtleGraphics.getPosition()[1]);

        assertArrayEquals(new int[]{5, 10}, turtleGraphics.getPosition());
        assertEquals(TurtleGraphics.Direction.DOWN, turtleGraphics.getDirection());
    }

    @Test
    void testThatPenCanBeToggled() {
        turtleGraphics.setPenState(TurtleGraphics.PenState.DOWN);
        assertEquals(TurtleGraphics.PenState.DOWN, turtleGraphics.getPenState());

        turtleGraphics.setPenState(TurtleGraphics.PenState.UP);
        assertEquals(TurtleGraphics.PenState.UP, turtleGraphics.getPenState());
    }

    @Test
    void testThat_turtleCanTraceOutShape_whenPenIsDown() {
        turtleGraphics.setPenState(TurtleGraphics.PenState.DOWN);
        turtleGraphics.move();

        int[][] expectedFloor = new int[20][20];
        expectedFloor[0][0] = 1;
        expectedFloor[0][1] = 1;
        expectedFloor[0][2] = 1;
        expectedFloor[0][3] = 1;
        expectedFloor[0][4] = 1;
        expectedFloor[0][5] = 1;
        expectedFloor[0][6] = 1;
        expectedFloor[1][6] = 1;
        expectedFloor[2][6] = 1;
        expectedFloor[3][6] = 1;
        expectedFloor[4][6] = 1;
        expectedFloor[5][6] = 1;

        assertArrayEquals(expectedFloor, turtleGraphics.getFloor());
    }

    @Test
    void testThat_nineWorksAsSentinelValue_inCommandArray() {
        assertTrue(turtleGraphics.doNextCommand());

        int[] movementCommand = {9, 5, 6, 3};
        turtleGraphics.setMovementCommand(movementCommand);
        assertFalse(turtleGraphics.doNextCommand());
    }

    @Test
    void testThat_arrayCanBeDisplayed_inGraphicalForm() {
        turtleGraphics.setPenState(TurtleGraphics.PenState.DOWN);
        turtleGraphics.move();

        char[][] expectedDisplay = new char[20][20];
        expectedDisplay[0][0] = '*';
        expectedDisplay[0][1] = '*';
        expectedDisplay[0][2] = '*';
        expectedDisplay[0][3] = '*';
        expectedDisplay[0][4] = '*';
        expectedDisplay[0][5] = '*';
        expectedDisplay[0][6] = '*';
        expectedDisplay[1][6] = '*';
        expectedDisplay[2][6] = '*';
        expectedDisplay[3][6] = '*';
        expectedDisplay[4][6] = '*';
        expectedDisplay[5][6] = '*';

        for (int row = 0; row < expectedDisplay.length; row++) {
            for (int column = 0; column < expectedDisplay.length; column++) {
                if(expectedDisplay[row][column] != '*') {
                    expectedDisplay[row][column] = ' ';
                }
            }
        }

        assertArrayEquals(expectedDisplay, turtleGraphics.setGraphicsArray());
        turtleGraphics.displayGraphics();
    }
}