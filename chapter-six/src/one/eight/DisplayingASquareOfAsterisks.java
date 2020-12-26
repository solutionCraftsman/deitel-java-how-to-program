package one.eight;

public class DisplayingASquareOfAsterisks {

    private int rowCounter;
    private int columnCounter;

    public void squareOfAsterisks(int side) {
        for (rowCounter = 0; rowCounter < side; rowCounter++) {
            for (columnCounter = 0; columnCounter < side ; columnCounter++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public int getRowCounter() {
        return rowCounter;
    }

    public int getColumnCounter() {
        return columnCounter;
    }
}
