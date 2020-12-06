
public class FivePointTwoNine {
    public static void main(String[] args) {
        int daysCount = 1;

        while(daysCount <= 12) {
            System.out.printf("Verse %d\nOn the ", daysCount);
            printDay(daysCount);
            System.out.println("day of Christmas my true love sent to me");
            printRemainingLyrics(daysCount);
            ++daysCount;
        }
    }

    static void printDay(int daysCount) {
        switch (daysCount) {
            case 1:
                System.out.print("first ");
                break;
            case 2:
                System.out.print("second ");
                break;
            case 3:
                System.out.print("third ");
                break;
            case 4:
                System.out.print("fourth ");
                break;
            case 5:
                System.out.print("fifth ");
                break;
            case 6:
                System.out.print("sixth ");
                break;
            case 7:
                System.out.print("seventh ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("ninth ");
                break;
            case 10:
                System.out.print("tenth ");
                break;
            case 11:
                System.out.print("eleventh ");
                break;
            case 12:
                System.out.print("twelfth ");
                break;
            default:
                //Not reachable
        }
    }

    static void printRemainingLyrics(int daysCount) {
        switch (daysCount) {
            case 12:
                System.out.println("Twelve drummers drumming, ");
            case 11:
                System.out.println("Eleven pipers piping, ");
            case 10:
                System.out.println("Ten lords a-leaping, ");
            case 9:
                System.out.println("Nine ladies dancing, ");
            case 8:
                System.out.println("Eight maids a-milking ");
            case 7:
                System.out.println("Seven swans a-swimming, ");
            case 6:
                System.out.println("Six geese a-laying, ");
            case 5:
                System.out.println("Five gold rings, ");
            case 4:
                System.out.println("Four calling birds, ");
            case 3:
                System.out.println("Three French hens, ");
            case 2:
                System.out.println("Two turtle doves,");
            case 1:
                if(daysCount == 1) {
                    System.out.print("A ");
                } else {
                    System.out.print("And a ");
                }
                System.out.println("partridge in a pear tree.\n");
            default:
                //Not reachable
        }
    }
}
