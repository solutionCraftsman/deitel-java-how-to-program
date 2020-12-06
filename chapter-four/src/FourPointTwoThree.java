import java.util.Scanner;

public class FourPointTwoThree {
    public static void main(String[] args) {
        int counter = 1;
        int number;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        Scanner scn = new Scanner(System.in);

        while(counter <= 10) {
            System.out.print("Enter value " + counter + ": ");
            number = scn.nextInt();
            if(number > largest) {
                secondLargest = largest;
                largest = number;
            } else {
                if(number > secondLargest){
                    secondLargest = number;
                }
            }

            counter++;
        }

        System.out.println();
        System.out.println("Largest Number is " + largest);
        System.out.println("Second Largest Number is " + secondLargest);
    }
}

