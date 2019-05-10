package poker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        poker.PokerGame game = new poker.PokerGame(5,1);
//        game.play();
        //game.showPlayers();

        // BARTKU
        // przerób projekt na maven'a
        // i zrób testy dla wszytkich mozliwych wyników
        // czyli poker, kareta, full, Kolor itd.


        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("K", "d", 13));
        testCardsPlayer.add(new Card("3", "s", 3));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("4", "s", 4));
        testCardsTable.add(new Card("5", "s", 5));
        testCardsTable.add(new Card("2", "s", 2));
        testCardsTable.add(new Card("7", "s", 7));
        testCardsTable.add(new Card("7", "h", 7));


        HandRank testhandRank = new HandRank();

        System.out.println(testhandRank.checkHand(testCardsPlayer,testCardsTable));

    }
}
