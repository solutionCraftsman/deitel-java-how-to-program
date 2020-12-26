package one.nine;

public class DisplayingASquareOfAnyCharacter {

    private int rowCounter;
    private int columnCounter;

    public void squareOfCharacter(int side, char character) {
        for (rowCounter = 0; rowCounter < side; rowCounter++) {
            for (columnCounter = 0; columnCounter < side ; columnCounter++) {
                System.out.print(character);
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
