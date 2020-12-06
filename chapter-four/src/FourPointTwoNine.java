import java.util.Scanner;

public class FourPointTwoNine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Square size: ");
        int size = in.nextInt();

        int rowCounter = 1;
        int columnCounter;
        for ( ; rowCounter <= size; rowCounter++) {
            for (columnCounter = 1; columnCounter <= size; columnCounter++) {
                if (rowCounter == 1 ||
                        columnCounter == 1 ||
                        rowCounter == size ||
                        columnCounter == size) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}