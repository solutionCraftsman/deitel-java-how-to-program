package two.one;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {

    Turtle turtle;
    Pen turtlePen;
    SketchPad sketchPad;

    @BeforeEach
    void setUp() {
        turtlePen = new Pen();
        turtle = new Turtle(turtlePen);
        sketchPad = new SketchPad(20, 20);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void turtle_hasAPen() {
        assertNotNull(turtle.getPen());
    }

    @Test
    void turtlePen_canBeSetToDown() {
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        assertEquals(PenOrientation.PEN_DOWN, turtle.getPen().getPenOrientation());
    }

    @Test
    void turtlePen_canBeSetToUp() {
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        assertEquals(PenOrientation.PEN_UP, turtle.getPen().getPenOrientation());
    }

    @Test
    void turtle_canTurnRight() {
        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.turnRight();
        assertEquals(CurrentDirection.SOUTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(CurrentDirection.WEST, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(CurrentDirection.NORTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(CurrentDirection.EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtle_canTurnLeft() {
        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.turnLeft();
        assertEquals(CurrentDirection.NORTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(CurrentDirection.WEST, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(CurrentDirection.SOUTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(CurrentDirection.EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtle_canMoveEastWard_onASketchPad/*_whilePenIsUp*/() {
        //given
        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        turtle.setCurrentPosition(new Position(0, 0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position(0, 5), turtle.getCurrentPosition());
    }

    @Test
    void turtle_canMoveSouthWard_onASketchPad/*_whilePenIsUp*/() {
        //given
        turtle.setCurrentDirection(CurrentDirection.SOUTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        turtle.setCurrentPosition(new Position(0, 0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(4, 0), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position(5, 0), turtle.getCurrentPosition());
    }

    @Test
    void turtle_canMoveWestWard_onASketchPad/*_whilePenIsUp*/() {
        //given
        turtle.setCurrentDirection(CurrentDirection.WEST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        turtle.setCurrentPosition(new Position(0, 7));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(0, 3), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position(0, 2), turtle.getCurrentPosition());
    }

    @Test
    void turtle_canMoveNorthWard_onASketchPad/*_whilePenIsUp*/() {
        //given
        turtle.setCurrentDirection(CurrentDirection.NORTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        turtle.setCurrentPosition(new Position(7, 0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(3, 0), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position(2, 0), turtle.getCurrentPosition());
    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingEast() {
        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        turtle.setCurrentPosition(new Position(0, 0));
        int numberOfSteps = 5;
        turtle.move(sketchPad, numberOfSteps);

        for (int column = 0; column < numberOfSteps; column++) {
            assertEquals(1, sketchPad.getFloor()[0][column]);
        }

        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingSouth() {
        turtle.setCurrentDirection(CurrentDirection.SOUTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        turtle.setCurrentPosition(new Position(0, 0));
        int numberOfSteps = 5;
        turtle.move(sketchPad, numberOfSteps);

        for (int row = 0; row < numberOfSteps; row++) {
            assertEquals(1, sketchPad.getFloor()[row][0]);
        }

        assertEquals(new Position(4, 0), turtle.getCurrentPosition());
    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingWest() {
        turtle.setCurrentDirection(CurrentDirection.WEST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        turtle.setCurrentPosition(new Position(0, 4));
        int numberOfSteps = 5;
        turtle.move(sketchPad, numberOfSteps);

        for (int column = 0; column < numberOfSteps; column++) {
            assertEquals(1, sketchPad.getFloor()[0][column]);
        }

        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
    }


}