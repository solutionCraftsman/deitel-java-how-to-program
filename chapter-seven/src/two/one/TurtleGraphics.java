package two.one;

public class TurtleGraphics {

    private PenState penState;
    private Direction direction;
    private int[] position;

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

    private int[][] floor;
    private boolean isAtLeftEdge;
    private boolean isAtTop;
    private boolean isAtBottom;
    private boolean isAtRightEdge;
    private static final int MIN_INDEX = 0;
    private static final int MAX_INDEX = 19;
    private boolean hasSetFloorElementForCurrentPosition;

    public TurtleGraphics() {
        floor = new int[20][20];
        this.direction = Direction.RIGHT;
        this.position = new int[]{0, 0};
    }

    public PenState getPenState() {
        return penState;
    }

    public void setPenState(PenState penState) {
        this.penState = penState;
    }

    public Direction getDirection() {
        return direction;
    }

    public void move(int[] movementCommand) {
        for (int commandIndex = 0; commandIndex < movementCommand.length; commandIndex++) {
            switch (movementCommand[commandIndex]) {
                case 3 -> turnRight();
                case 4 -> turnLeft();
                case 5 -> {
                    try {
                        moveForward(movementCommand[++commandIndex]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Trying to move forward without specifying steps");
                    }
                }
                //case 10 -> continue; //unnecessary, do nothing
            }
        }
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

    private void moveForward(int steps) {
        hasSetFloorElementForCurrentPosition = false;
        switch (direction) {
            case LEFT -> moveLeft(steps);
            case UP -> moveUp(steps);
            case RIGHT -> moveRight(steps);
            case DOWN -> moveDown(steps);
        }
    }

    private void moveLeft(int steps) {
        for (int step = 1; step <= steps; step++) {
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

    private void moveUp(int steps) {
        for (int step = 1; step <= steps; step++) {
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

    private void moveRight(int steps) {
        for (int step = 1; step <= steps; step++) {
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

    private void moveDown(int steps) {
        for (int step = 1; step <= steps; step++) {
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
        System.out.print(position[0] + "," + position[1] + " - ");
        System.out.println(floor[position[0]][position[1]]);
    }
}
