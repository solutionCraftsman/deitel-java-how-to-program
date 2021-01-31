package one.seven;

import javax.swing.*;

public class TicTacToeMain {

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.getFirstPlayer().toggleTurn();

        while (!ticTacToe.gameHasBeenWon() && !ticTacToe.gameIsADraw()) {
            String cellNumber = JOptionPane.showInputDialog("Player " +
                        (ticTacToe.getFirstPlayer().isNextToPlay() && !ticTacToe.getSecondPlayer().isNextToPlay() ? "1" : "2") +
                        "'s turn. Type in cell number (1-9)\n\n" + ticTacToe.getBoard().display());
            ticTacToe.makeAMove(Integer.parseInt(cellNumber));
        }

        String message;

        if(ticTacToe.gameHasBeenWon()) {
            message = "Player " +
                    (ticTacToe.getFirstPlayer().won() && !ticTacToe.getSecondPlayer().won() ? "1" : "2") +
                    " won.";
        } else {
            message = "Omo, na draw soup oo";
        }

        JOptionPane.showMessageDialog(null, message + "\n\n" + ticTacToe.getBoard().display());
    }
}
