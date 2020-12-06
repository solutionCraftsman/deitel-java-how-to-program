
public class FivePointTwoTwo {

    public static void main(String[] args) {
        int upperLimit = 10;
        int lowerLimit = 1;
        int aAsterisksCounter;
        int aSpacesCounter;
        int bAsterisksCounter;
        int bSpacesCounter;
        int cAsterisksCounter;
        int cSpacesCounter;
        int dAsterisksCounter;
        int dSpacesCounter;

        for (int lineCounter = lowerLimit; lineCounter <= upperLimit; lineCounter++) {

            for (aAsterisksCounter = lowerLimit; aAsterisksCounter <= lineCounter; aAsterisksCounter++) {
                System.out.print('*');
            }
            for (aSpacesCounter = upperLimit - lineCounter; aSpacesCounter >= lowerLimit; aSpacesCounter--) {
                System.out.print(' ');
            }

            System.out.printf("%5s", "");

            for (bAsterisksCounter = upperLimit - lineCounter + 1 ; bAsterisksCounter >= 1; bAsterisksCounter--) {
                System.out.print('*');
            }
            for (bSpacesCounter = lineCounter; bSpacesCounter < lineCounter; bSpacesCounter++) {
                System.out.print(' ');
            }

            System.out.printf("%5s", "");

            for (cSpacesCounter = lowerLimit; cSpacesCounter < lineCounter; cSpacesCounter++) {
                System.out.print(' ');
            }
            for (cAsterisksCounter = upperLimit - lineCounter + 1; cAsterisksCounter >= 1; cAsterisksCounter--) {
                System.out.print('*');
            }

            System.out.printf("%5s", "");

            for (dSpacesCounter = upperLimit - lineCounter; dSpacesCounter >= lowerLimit; dSpacesCounter--) {
                System.out.print(' ');
            }
            for (dAsterisksCounter = lowerLimit; dAsterisksCounter <= lineCounter; dAsterisksCounter++) {
                System.out.print('*');
            }

            System.out.println();

        }
    }
}
