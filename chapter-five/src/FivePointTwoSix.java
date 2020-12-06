// Fig. 5.13: BreakTest.java
// break statement exiting a for statement.
//public class BreakTest
public class FivePointTwoSix {
    public static void main(String[] args) {
        int count; // control variable also used after loop terminates

        boolean countIsNotFive = true;
        for (count = 1; countIsNotFive; count++) // loop 10 times
        //for (count = 1; count <= 10; count++) // loop 10 times
        {
            System.out.printf("%d ", count);
            if (count == 5)
                //break; // terminates loop if count is 5
                //count = 10;
                countIsNotFive = false;
        }

        System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
} // end class BreakTest

