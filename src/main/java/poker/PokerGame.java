package poker;

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
            players.add(new Player("poker.Player "+(i)));
        }
        this.numberOfPlayers = numberOfplayers;
        this.numberOfHands = numberOfHands;
    }
    public void showPlayers(){
        for (Player player : players) {
            System.out.println(player);
        }
        System.out.println(table);
    }
    public void play(){
        Deck deck = new Deck();
        // ustawiamy Buttona
        setRandomButtonPlayer();
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
            // teraz 5 karty na stół
            for (int j = 0; j <5 ; j++) {
                table.cards.add(deck.getCard());
            }
            System.out.println(" rozdanie nr : "+i);
            showPlayers();

            //sprawdzamy kto wygrał
            checkHand();
            // przesuń rozdającego -> next button
            setNextButtonPlayer();
            // usuń karty u graczy
            clearCardOfPlayers();
        }
    }

    private void checkHand(){

        HandRank handRank = new HandRank();

        for (int i = 0; i <numberOfPlayers; i++) {

            handRank.checkHand(players.get(i).cards, table.cards);

        }
    }
    private void clearCardOfPlayers(){
        for (Player player : players) {
            player.cards.clear();
        }
        table.cards.clear();
    }
    public int getButtonPlayer() {
        return buttonPlayer;
    }
    private void setNextButtonPlayer(){
        int nr = this.buttonPlayer;
        nr++;
        if(nr == this.numberOfPlayers){
            nr = 0;
        }
        setButtonPlayer(nr);
    }
    private void setButtonPlayer(int buttonPlayer) {
        if(buttonPlayer >= 0 && buttonPlayer < players.size()){
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
