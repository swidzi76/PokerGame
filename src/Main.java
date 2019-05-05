import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
//        PokerGame game = new PokerGame(5,1);
//        game.play();
        //game.showPlayers();

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("K", "h", 13));
        testCardsPlayer.add(new Card("A", "s", 14));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("K", "h", 13));
        testCardsTable.add(new Card("K", "d", 13));
        testCardsTable.add(new Card("Q", "c", 12));
        testCardsTable.add(new Card("A", "d", 14));
        testCardsTable.add(new Card("A", "h", 14));


        HandRank testhandRank = new HandRank();

        System.out.println(testhandRank.checkHand(testCardsPlayer,testCardsTable));

    }
}
