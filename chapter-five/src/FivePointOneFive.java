
public class FivePointOneFive {

    public static void main(String[] args) {

        int lineCounter;
        int spaceCounter;
        int asteriskCounter;
        int upperLimit = 10;
        int lowerLimit = 1;

        for (lineCounter = lowerLimit; lineCounter <= upperLimit; lineCounter++) {
            for (asteriskCounter = lowerLimit; asteriskCounter <= lineCounter; asteriskCounter++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        for (lineCounter = lowerLimit; lineCounter <= upperLimit; lineCounter++) {
            for (asteriskCounter = (upperLimit - lineCounter + 1); asteriskCounter >= lowerLimit; asteriskCounter--) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        for (lineCounter = lowerLimit; lineCounter <= upperLimit; lineCounter++) {
            for (spaceCounter = lowerLimit; spaceCounter <= lineCounter - 1; spaceCounter++) {
                System.out.print(' ');
            }
            for (asteriskCounter = (upperLimit - lineCounter + 1); asteriskCounter >= lowerLimit; asteriskCounter--) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        for (lineCounter = lowerLimit; lineCounter <= upperLimit; lineCounter++) {
            for (spaceCounter = (upperLimit - lineCounter); spaceCounter >= lowerLimit; spaceCounter--) {
                System.out.print(' ');
            }
            for (asteriskCounter = lowerLimit; asteriskCounter <= lineCounter; asteriskCounter++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
