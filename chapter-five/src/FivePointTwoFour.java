
public class FivePointTwoFour {

    public static void main(String[] args) {
        int spaceLimit;
        int size = 1910;
        int asteriskLimit;
        int half = (size / 2) + 1;
        for (int lineCounter = 1; lineCounter <= size; lineCounter++) {
            spaceLimit = Math.abs(lineCounter - half);
            for (int spaceCounter = 1; spaceCounter <= spaceLimit; spaceCounter++) {
                System.out.print(' ');
            }

            if (lineCounter <= half) {
                asteriskLimit = lineCounter + (lineCounter - 1);
            } else {
                asteriskLimit = Math.abs(lineCounter - size) + (half - spaceLimit);
                //Great job, but try refactor to a less complex expression
            }

            for (int asteriskCounter = 1; asteriskCounter <= asteriskLimit; asteriskCounter++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

