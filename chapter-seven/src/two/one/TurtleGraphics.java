package two.one;

public class TurtleGraphics {

    private PenState penState;
    private Direction direction;
    private final int[] position;
    private int currentNoOfStepsToMove;
    private int indexOfCurrentCommand;

    public enum PenState {
        DOWN,
        UP
    }

    public enum Direction {
        LEFT,
        UP,
        RIGHT,
        DOWN
    }

    private final int[][] floor;
    private int[] movementCommand;
    private boolean isAtLeftEdge;
    private boolean isAtTop;
    private boolean isAtBottom;
    private boolean isAtRightEdge;
    private static final int MIN_INDEX = 0;
    private static final int MAX_INDEX = 19;
    private boolean hasSetFloorElementForCurrentPosition;

    public TurtleGraphics(int[] movementCommand) {
        floor = new int[20][20];
        this.movementCommand = movementCommand;
        direction = Direction.RIGHT;
        position = new int[]{0, 0};
        indexOfCurrentCommand = 0;
    }

    public PenState getPenState() {
        return penState;
    }

    public Direction getDirection() {
        return direction;
    }

    public void move() {
        while (indexOfCurrentCommand < movementCommand.length) {
            switch (movementCommand[indexOfCurrentCommand]) {
                case 1 -> setPenStateToUp();
                case 2 -> setPenStateToDown();
                case 3 -> turnRight();
                case 4 -> turnLeft();
                case 5 -> {
                    try {
                        currentNoOfStepsToMove = movementCommand[++indexOfCurrentCommand];
                        moveForward();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Trying to move forward without specifying steps");
                    }
                }
                case 6 -> displayGraphics();
                case 9 -> {
                    return;
                }
                //case 10 -> continue; //unnecessary, do nothing
            }
            indexOfCurrentCommand++;
        }
    }

    private void setPenStateToUp() {
        penState = PenState.UP;
    }

    private void setPenStateToDown() {
        penState = PenState.DOWN;
    }

    private void turnRight() {
        switch (direction) {
            case LEFT -> direction = Direction.UP;
            case UP -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.DOWN;
            case DOWN -> direction = Direction.LEFT;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case LEFT -> direction = Direction.DOWN;
            case UP -> direction = Direction.LEFT;
            case RIGHT -> direction = Direction.UP;
            case DOWN -> direction = Direction.RIGHT;
        }
    }

    private void moveForward() {
        hasSetFloorElementForCurrentPosition = false;
        switch (direction) {
            case LEFT -> moveLeft(currentNoOfStepsToMove);
            case UP -> moveUp(currentNoOfStepsToMove);
            case RIGHT -> moveRight(currentNoOfStepsToMove);
            case DOWN -> moveDown(currentNoOfStepsToMove);
        }
    }

    private void moveLeft(int currentNoOfSteps) {
        for (int step = 1; step <= currentNoOfSteps; step++) {
            if (!isAtLeftEdge) {
                if(!hasSetFloorElementForCurrentPosition) {
                    setFloorElements();
                    hasSetFloorElementForCurrentPosition = true;
                }
                position[1]--;
                setFloorElements();
            }

            if (position[1] == MIN_INDEX) {
                isAtLeftEdge = true;
            }
        }
    }

    private void moveUp(int currentNoOfSteps) {
        for (int step = 1; step <= currentNoOfSteps; step++) {
            if (!isAtTop) {
                if(!hasSetFloorElementForCurrentPosition) {
                    setFloorElements();
                    hasSetFloorElementForCurrentPosition = true;
                }
                position[0]--;
                setFloorElements();
            }

            if (position[0] == MIN_INDEX) {
                isAtTop = true;
            }
        }
    }

    private void moveRight(int currentNoOfSteps) {
        for (int step = 1; step <= currentNoOfSteps; step++) {
            if (!isAtRightEdge) {
                if(!hasSetFloorElementForCurrentPosition) {
                    setFloorElements();
                    hasSetFloorElementForCurrentPosition = true;
                }
                position[1]++;
                setFloorElements();
            }

            if (position[1] == MAX_INDEX) {
                isAtRightEdge = true;
            }
        }
    }

    private void moveDown(int currentNoOfSteps) {
        for (int step = 1; step <= currentNoOfSteps; step++) {
            if (!isAtBottom) {
                if(!hasSetFloorElementForCurrentPosition) {
                    setFloorElements();
                    hasSetFloorElementForCurrentPosition = true;
                }
                position[0]++;
                setFloorElements();
            }

            if (position[0] == MAX_INDEX) {
                isAtBottom = true;
            }
        }
    }

    public int[] getPosition() {
        return position;
    }

    public int[][] getFloor() {
        return floor;
    }

    private void setFloorElements() {
        if(penState == PenState.DOWN) {
            floor[position[0]][position[1]] = 1;
        }
    }

    public void setMovementCommand(int[] movementCommand) {
        this.movementCommand = movementCommand;
        indexOfCurrentCommand = 0;
    }

    public char[][] setGraphicsArray() {
        int arrayLength = floor.length;
        char[][] graphics = new char[arrayLength][arrayLength];

        for (int row = 0; row < arrayLength; row++) {
            for (int column = 0; column < arrayLength; column++) {
                if(floor[row][column] == 1) {
                    graphics[row][column] = '*';
                }
                else {
                    graphics[row][column] = ' ';
                }
            }
        }

        return graphics;
    }

    public void displayGraphics() {
        char[][] graphics = setGraphicsArray();

        for (char[] graphic : graphics) {
            for (int column = 0; column < graphics.length; column++) {
                System.out.print(graphic[column]);

                if (column == graphics.length - 1) {
                    System.out.println();
                }

            }
        }
    }
}
