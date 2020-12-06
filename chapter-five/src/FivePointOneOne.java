import java.util.Scanner;

public class FivePointOneOne {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of items to input: ");
        int noOfValuesToInput = scn.nextInt();

        if(noOfValuesToInput > 0) {

            int min = Integer.MAX_VALUE;
            int temp;
            int inputCount = 1;

            while (inputCount <= noOfValuesToInput) {
                System.out.print("Enter Number " + inputCount + ": ");
                temp = scn.nextInt();
                min = (temp < min) ? temp : min;
                ++inputCount;
            }

            System.out.println();
            System.out.println("Minimum value is " + min);
        }

    }

}

