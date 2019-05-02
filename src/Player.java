import javafx.util.StringConverter;

public class Player {
    private String name;
    private boolean button;
    private int score;

    public Player(String name) {
        this.name = name;
        this.button = false;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return getName()+(isButton()?" B ":"   ")+getScore();
    }
}
