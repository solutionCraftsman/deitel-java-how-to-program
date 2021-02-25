package two.two;

public class Position {

    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEquals = false;
        if(obj instanceof Position positionToCompare) {
            isEquals = (positionToCompare.getRow() == getRow()) &&
                    (positionToCompare.getColumn() == getColumn());
        }
        return isEquals;
    }
}
