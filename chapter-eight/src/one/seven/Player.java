package one.seven;

public class Player {

    private boolean isNextToPlay;
    private boolean won;

    public void toggleTurn() {
        isNextToPlay = !isNextToPlay;
    }

    public boolean isNextToPlay() {
        return isNextToPlay;
    }

    public boolean won() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }
}
