public class GameBoard {
    private String state;

    public GameBoard() {
        this.statea = "Game started!";
    }

    public String state() {
        return this.state;
    }

    public boolean newTurn() {
        this.state = "New turn...";
        return false;
    }
}