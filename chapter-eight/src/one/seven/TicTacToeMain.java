package one.seven;

import javax.swing.*;

public class TicTacToeMain {

    public static void main(String[] args) {
        try {
            TicTacToe ticTacToe = new TicTacToe();

            String playerOnesName = JOptionPane.showInputDialog("O boy, you waka well. " +
                    "Na which name the first player papa and mama dem give am?");
            String playerTwosName = JOptionPane.showInputDialog("Second player nko " +
                    "put ya name for inside this thing down here?");

            if(playerOnesName != null) {
                ticTacToe.getFirstPlayer().setName(playerOnesName);
            }
            if(playerTwosName != null) {
                ticTacToe.getSecondPlayer().setName(playerTwosName);
            }

            ticTacToe.getFirstPlayer().toggleTurn();
            ticTacToe.setCurrentPlayer();

            while (!ticTacToe.gameHasBeenWon() && !ticTacToe.gameIsADraw()) {
                String cellNumber = JOptionPane.showInputDialog(ticTacToe.getCurrentPlayer().getName() +
                        "'s turn. Type in cell number (1-9) to play on\n\n" + ticTacToe.getBoard().display());
                ticTacToe.makeAMove(Integer.parseInt(cellNumber));
            }

            String message;

            if(ticTacToe.gameHasBeenWon()) {
                message = ticTacToe.getWinner().getName() + " don carry cup. Mae una gi am two bottles!";
            } else {
                message = "Omo, na draw una draw oo, like soup.";
            }

            JOptionPane.showMessageDialog(null, message + "\n\n" + ticTacToe.getBoard().display());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Dialog Box cancelled. Program failed gracefully. " +
                            "Ntoor. Carry yourself and go!");
        }
    }
}
