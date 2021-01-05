package two.one;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleGraphicsTest {

    TurtleGraphics turtleGraphics;

    @BeforeEach
    void setUp() {
        turtleGraphics = new TurtleGraphics();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatTurtleCanMove() {
        int[] movementCommand = {5, 10, 3, 5, 5};
        turtleGraphics.move(movementCommand);

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
        int[] movementCommand = {5, 6, 3, 5, 5};
        turtleGraphics.move(movementCommand);

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

}