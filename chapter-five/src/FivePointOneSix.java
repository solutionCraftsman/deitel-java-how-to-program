
/* Bar Chart Printing Program
*  Group 2
*  -------
*  Dozie
*  Damilola
*  Toni
*  Peter
*  Titus
*  Ayodele
**/

import java.util.Scanner;

public class FivePointOneSix {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int num;
        String output = "";
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Number " + i + ": ");
            num = userInput.nextInt();

            if(num < 1 || num > 30) {
                System.out.println("Allowed range is 1 - 30.");
                break;
            }

            for (int j = 0; j < num; j++) {
                output += "*";
            }
            output += "\n";
        }
        System.out.println(output);


        System.out.print("Enter first number (1 - 30): ");
        int firstNumber = userInput.nextInt();

        System.out.print("Enter second number (1 - 30): ");
        int secondNumber = userInput.nextInt();

        System.out.print("Enter third number (1 - 30): ");
        int thirdNumber = userInput.nextInt();

        System.out.print("Enter fourth number (1 - 30): ");
        int fourthNumber = userInput.nextInt();

        System.out.print("Enter fifth number (1 - 30): ");
        int fifthNumber = userInput.nextInt();

        System.out.println();

        if (firstNumber < 1 || firstNumber > 30 ||
                secondNumber < 1 || secondNumber > 30 ||
                thirdNumber < 1 || thirdNumber > 30 ||
                fourthNumber < 1 || fourthNumber > 30 ||
                fifthNumber < 1 || fifthNumber > 30) {
            System.out.println("Allowed range is 1 - 30.");
        }
        else {

            System.out.println("Bar Chart");

            int asterisksCounter;

            System.out.printf("%2d ", firstNumber);
            for (asterisksCounter = 1; asterisksCounter <= firstNumber; asterisksCounter++) {
                System.out.print('*');
            }

            System.out.println();

            System.out.printf("%2d ", secondNumber);
            for (asterisksCounter = 1; asterisksCounter <= secondNumber; asterisksCounter++) {
                System.out.print('*');
            }

            System.out.println();

            System.out.printf("%2d ", thirdNumber);
            for (asterisksCounter = 1; asterisksCounter <= thirdNumber; asterisksCounter++) {
                System.out.print('*');
            }

            System.out.println();

            System.out.printf("%2d ", fourthNumber);
            for (asterisksCounter = 1; asterisksCounter <= fourthNumber; asterisksCounter++) {
                System.out.print('*');
            }

            System.out.println();

            System.out.printf("%2d ", fifthNumber);
            for (asterisksCounter = 1; asterisksCounter <= fifthNumber; asterisksCounter++) {
                System.out.print('*');
            }

        }
    }
}
