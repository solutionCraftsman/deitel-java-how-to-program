package two.one;

public class TurtleGraphicsMain {

    public static void main(String[] args) {
        int[] movementCommand = {2, 5,12, 3 , 5,12, 3, 5,12, 3, 5,12, 1, 6, 9};
        TurtleGraphics turtleGraphics = new TurtleGraphics(movementCommand);
        turtleGraphics.move();
    }
}
