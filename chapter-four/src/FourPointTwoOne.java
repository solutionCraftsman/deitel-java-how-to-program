import java.util.Scanner;

public class FourPointTwoOne {
    public static void main(String[] args) {
        int counter  = 1;
        int number;
        int largest = Integer.MIN_VALUE;
        Scanner scn = new Scanner(System.in);

        while(counter <= 10) {
            System.out.print("Enter value " + counter + ": ");
            number = scn.nextInt();
            if(number > largest) {
                largest = number;
            }
            counter++;
        }

        System.out.println();
        System.out.println("Largest Number is " + largest);
    }
}
