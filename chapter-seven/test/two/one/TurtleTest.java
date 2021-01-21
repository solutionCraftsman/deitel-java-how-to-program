package two.one;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {

    Turtle turtle;
    Pen turtlePen;

    @BeforeEach
    void setUp() {
        turtlePen = new Pen();
        turtle = new Turtle(turtlePen);
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
    void turtle_canMoveEastWard_onASketchPad() {
        //given
        turtle.setCurrentDirection(CurrentDirection.EAST);
        SketchPad sketchPad = new SketchPad();
        turtle.move(sketchPad, 5);
    }

}