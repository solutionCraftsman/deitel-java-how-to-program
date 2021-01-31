package one.seven;

public class Player {

    private String name;
    private boolean isNextToPlay;
    private boolean won;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
