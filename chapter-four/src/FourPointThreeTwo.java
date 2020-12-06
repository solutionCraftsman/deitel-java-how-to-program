
public class FourPointThreeTwo {
    public static void main(String[] args) {
        boolean alreadyPrintedSpace;
        boolean lineCounterIsEven;
        int asterisksPrinter;

        for (int lineCounter = 1; lineCounter <= 8; lineCounter++) {
            lineCounterIsEven = (lineCounter % 2 == 0);
            alreadyPrintedSpace = false;
            for (asterisksPrinter = 1; asterisksPrinter <= 8 ; asterisksPrinter++) {
                if(lineCounterIsEven) {
                    if(!alreadyPrintedSpace) {
                        System.out.print(" ");
                        alreadyPrintedSpace = true;
                    }
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
