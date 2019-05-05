import javafx.util.StringConverter;

import java.util.ArrayList;

public class Player {
    private String name;
    private boolean button;
    private int score;
    ArrayList<Card> cards = new ArrayList<>();

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

    private String getCadrds(){
        String string ="";
        for (Card card : cards) {
            string += "["+card.getRank()+ ":"+card.getSuit()+"]";
        }
        return string;
    }
    @Override
    public String toString() {
        return getName()+(isButton()?" B ":"   ")+getScore()+getCadrds();
    }
}
