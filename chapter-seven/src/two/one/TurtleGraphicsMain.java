package two.one;

public class TurtleGraphicsMain {

    public static void main(String[] args) {
        int[] movementCommand = {5, 6, 3, 5, 5, 9};
        TurtleGraphics turtleGraphics = new TurtleGraphics(movementCommand);
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

        turtleGraphics.displayGraphics();
    }
}
