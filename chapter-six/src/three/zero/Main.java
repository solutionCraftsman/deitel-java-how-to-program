package three.zero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tha Oracle welcomes you to tha Guessing Game!");

        GuessTheNumber gtn = new GuessTheNumber();
        Scanner in = new Scanner(System.in);
        int guess;
        int choice;

        String result;

        while(true) {
            gtn.generateRandomNumber();
            do {
                System.out.print("Guess a number between 1 and 20: ");
                guess = in.nextInt();
                result = gtn.guessTheNumber(guess);
                System.out.println(result);
            } while(!result.equals("Congratulations. You guessed the number!"));

            System.out.print("Play again? Enter 1: ");
            choice = in.nextInt();
            if(choice != 1) {
                break;
            }
            System.out.println();
        }
    }
}
