package one.eight;

// Fig. 6.8: Craps.java
// Craps class simulates the dice game craps.

import java.security.SecureRandom;

public class GameOfCraps {
    // create secure random number generator for use in method rollDice
    private static int roll;
    private static int[] gamesWon;
    private static int[] gamesLost;
    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST}

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // plays one game of craps
    public static void main(String[] args) {
        gamesWon = new int[21];
        gamesLost = new int[21];

        for (int gameCount = 1; gameCount <= 1_000_000; gameCount++) {
            runGameOfCraps();
        }

        System.out.println("Number of Games Won on Rolls");
        for (int roll = 0; roll < gamesWon.length; roll++) {
            System.out.println(roll + 1 + " -> " + gamesWon[roll]);
        }

        System.out.println();

        System.out.println("Number of Games Lost on Rolls");
        for (int roll = 0; roll < gamesLost.length; roll++) {
            System.out.println(roll + 1 + " -> " + gamesLost[roll]);
        }

        System.out.println();

        System.out.println("Chance of Winning at Craps");
        double totalWins = 0;
        double totalLosses = 0;
        for (int roll = 0; roll < 21; roll++) {
            totalWins += gamesWon[roll];
            totalLosses += gamesLost[roll];
        }
        System.out.println(totalWins / totalLosses);

        System.out.println();

        System.out.println("Average Length of a Game of Craps");
        System.out.println((totalWins + totalLosses) / 20);

        System.out.println("No, the chances of winning reduces with the length of the game!");

    }

    private static void runGameOfCraps() {
        int myPoint = 0; // point if no win or loss on first roll
        roll = 0;
        Status gameStatus; // can contain CONTINUE, WON or LOST

        int sumOfDice = rollDice(); // first roll of the dice
        // determine game status and point based on first roll
        switch (sumOfDice) {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                gameStatus = Status.WON;
                gamesWon[roll - 1]++;
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                gamesLost[roll - 1]++;
                break;
            default: // did not win or lose, so remember point
                gameStatus = Status.CONTINUE; // game is not over
                myPoint = sumOfDice; // remember the point
                //System.out.printf("Point is %d%n", myPoint);
                break;
        }

        // while game is not complete
        while (gameStatus == Status.CONTINUE) // not WON or LOST
        {
            sumOfDice = rollDice(); // roll dice again
            // determine game status
            if (sumOfDice == myPoint) { // win by making point
                gameStatus = Status.WON;
                gamesWon[roll - 1]++;
            }
            else{
                if (sumOfDice == SEVEN) { // lose by rolling 7 before point
                    gameStatus = Status.LOST;
                    gamesLost[roll - 1]++;
                }
            }
        }

        // display won or lost message
        /*if (gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");*/
    }

    // roll dice, calculate sum and display results
    public static int rollDice() {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

        roll = (roll >= 20) ? 20 : roll + 1;

        int sum = die1 + die2; // sum of die values

        // display results of this roll
        /*System.out.printf("Player rolled %d + %d = %d%n",
                die1, die2, sum);*/
        return sum;
    }
}
