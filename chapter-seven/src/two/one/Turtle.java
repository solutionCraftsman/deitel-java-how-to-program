package two.one;

public class Turtle {

    private final Pen pen;
    private CurrentDirection currentDirection;
    private Position currentPosition;

    public Turtle(Pen pen) {
        this.pen = pen;
        this.currentDirection = CurrentDirection.EAST;
        currentPosition = new Position(0, 0);
    }

    public Pen getPen() {
        return pen;
    }

    public void setCurrentDirection(CurrentDirection currentDirection) {
        this.currentDirection = currentDirection;
    }

    public CurrentDirection getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST -> setCurrentDirection(CurrentDirection.SOUTH);
            case WEST -> setCurrentDirection(CurrentDirection.NORTH);
            case NORTH -> setCurrentDirection(CurrentDirection.EAST);
            case SOUTH -> setCurrentDirection(CurrentDirection.WEST);
        }
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> setCurrentDirection(CurrentDirection.NORTH);
            case WEST -> setCurrentDirection(CurrentDirection.SOUTH);
            case NORTH -> setCurrentDirection(CurrentDirection.WEST);
            case SOUTH -> setCurrentDirection(CurrentDirection.EAST);
        }
    }

    public void move(SketchPad sketchPad, int numberOfSteps) {
        numberOfSteps -= 1;
        PenOrientation currentPenOrientation = getPen().getPenOrientation();

        switch (currentPenOrientation) {
            case PEN_UP -> moveWithPenUp(numberOfSteps);
            case PEN_DOWN -> moveWithPenDown(sketchPad, numberOfSteps);
        }
    }

    private void moveWithPenDown(SketchPad sketchPad, int numberOfSteps) {
        Position currentPosition = getCurrentPosition();
        int currentColumn = currentPosition.getColumnPosition();
        int currentRow = currentPosition.getRowPosition();

        switch (currentDirection) {
            case EAST -> currentColumn = moveEastAndWrite(sketchPad, numberOfSteps, currentColumn, currentRow);
            case SOUTH -> currentRow = moveSouthAndWrite(sketchPad, numberOfSteps, currentColumn, currentRow);
            case WEST -> currentColumn = moveWestAndWrite(sketchPad, numberOfSteps, currentColumn, currentRow);
            case NORTH -> currentRow = moveNorthAndWrite(sketchPad, numberOfSteps, currentColumn, currentRow);
        }

        currentPosition.setRowPosition(currentRow);
        currentPosition.setColumnPosition(currentColumn);
    }

    private int moveNorthAndWrite(SketchPad sketchPad, int numberOfSteps, int currentColumn, int currentRow) {
        int rowAfterMovement = currentRow - numberOfSteps;
        for (; currentRow >= rowAfterMovement; currentRow--) {
            writeOnSketchPad(currentColumn, currentRow, sketchPad);
        }
        currentRow += 1;
        return currentRow;
    }

    private int moveWestAndWrite(SketchPad sketchPad, int numberOfSteps, int currentColumn, int currentRow) {
        int columnAfterMovement = currentColumn - numberOfSteps;
        for (; currentColumn >= columnAfterMovement; currentColumn--) {
            writeOnSketchPad(currentColumn, currentRow, sketchPad);
        }
        currentColumn += 1;
        return currentColumn;
    }

    private int moveSouthAndWrite(SketchPad sketchPad, int numberOfSteps, int currentColumn, int currentRow) {
        int rowAfterMovement = currentRow + numberOfSteps;
        for(; currentRow <= rowAfterMovement; currentRow++) {
            writeOnSketchPad(currentColumn, currentRow, sketchPad);
        }
        currentRow -= 1;
        return currentRow;
    }

    private int moveEastAndWrite(SketchPad sketchPad, int numberOfSteps, int currentColumn, int currentRow) {
        int columnAfterMovement = currentColumn + numberOfSteps;
        for (; currentColumn <= columnAfterMovement; currentColumn++) {
            writeOnSketchPad(currentColumn, currentRow, sketchPad);
        }
        currentColumn -= 1;
        return currentColumn;
    }

    private void writeOnSketchPad(int currentColumn, int currentRow, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        floor[currentRow][currentColumn] = 1;
    }

    private void moveWithPenUp(int numberOfSteps) {
        Position currentPosition = getCurrentPosition();
        int currentColumn = currentPosition.getColumnPosition();
        int currentRow = currentPosition.getRowPosition();

        switch (currentDirection) {
            case EAST -> currentPosition.setColumnPosition(currentColumn + numberOfSteps);
            case SOUTH -> currentPosition.setRowPosition(currentRow + numberOfSteps);
            case WEST -> currentPosition.setColumnPosition(currentColumn - numberOfSteps);
            case NORTH -> currentPosition.setRowPosition(currentRow - numberOfSteps);
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position position) {
        currentPosition = position;
    }
}
