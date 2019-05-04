import java.util.ArrayList;
import java.util.Random;

public class PokerGame {
    private ArrayList<Player> players = new ArrayList<>();
    private Player table = new Player("Table");
    private int buttonPlayer;
    private int numberOfHands;      // liczba rozdań
    private int numberOfPlayers;


    public PokerGame(int numberOfplayers, int numberOfHands) {
        for (int i = 0; i < numberOfplayers; i++) {
            players.add(new Player("Player "+(i)));
        }
        this.numberOfPlayers = numberOfplayers;
        this.numberOfHands = numberOfHands;
        setRandomButtonPlayer();

    }
    public void showPlayers(){
        for (Player player : players) {
            System.out.println(player);
        }
        System.out.println(table);
    }
    public void play(){
        Deck deck = new Deck();
        for (int i = 0; i < this.numberOfHands; i++) {
            // new hands - new deck.
            deck.init();
            // rozdaje player z B
            // więc pierwszy kartę dostaje nastepny player po B
            // rozdajemy po 2 karty
            for(int k = 0; k < 2; k++) {
                int nr = 0;
                for (int j = 0; j < this.numberOfPlayers; j++) {
                    nr = j + this.buttonPlayer + 1;
                    if (nr >= this.numberOfPlayers) {
                        nr -= this.numberOfPlayers;
                    }
                    players.get(nr).cards.add(deck.getCard());
                }
            }
            // teraz 3 karty na stół
            for (int j = 0; j <3 ; j++) {
                table.cards.add(deck.getCard());
            }
        }
    }

    public int getButtonPlayer() {
        return buttonPlayer;
    }

    private void setButtonPlayer(int buttonPlayer) {
        if(buttonPlayer >= 0 && buttonPlayer <= players.size()){
            players.get(this.buttonPlayer).setButton(false);
            this.buttonPlayer = buttonPlayer;
            players.get(buttonPlayer).setButton(true);
        }
    }
    private void setRandomButtonPlayer(){
        Random random = new Random();
        setButtonPlayer(random.nextInt(players.size()));
    }
}
