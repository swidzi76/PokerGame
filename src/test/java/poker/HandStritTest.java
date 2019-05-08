package poker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HandStritTest {

    @Test

    public void itIsAStraight1 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("K", "d", 13));
        testCardsPlayer.add(new Card("Q", "s", 12));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("J", "c", 11));
        testCardsTable.add(new Card("T", "c", 10));
        testCardsTable.add(new Card("9", "h", 9));
        testCardsTable.add(new Card("7", "s", 7));
        testCardsTable.add(new Card("7", "h", 7));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(5.13, result);
    }

    @Test

    public void itIsAStraight2 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("2", "d", 2));
        testCardsPlayer.add(new Card("5", "d", 5));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("3", "h", 3));
        testCardsTable.add(new Card("4", "d", 4));
        testCardsTable.add(new Card("9", "s", 9));
        testCardsTable.add(new Card("T", "s", 10));
        testCardsTable.add(new Card("6", "c", 6));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(5.06, result);
    }

    @Test

    public void itIsAStraight3 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("2", "h", 2));
        testCardsPlayer.add(new Card("Q", "h", 12));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("4", "s", 4));
        testCardsTable.add(new Card("5", "d", 5));
        testCardsTable.add(new Card("6", "c", 6));
        testCardsTable.add(new Card("7", "c", 7));
        testCardsTable.add(new Card("8", "s", 8));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(5.08, result);
    }
}
