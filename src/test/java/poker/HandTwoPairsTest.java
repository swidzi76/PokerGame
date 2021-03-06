package poker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

// testy dla dwóch par

public class HandTwoPairsTest {

    @Test

    public void itIsTwoPairs1 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("K", "d", 13));
        testCardsPlayer.add(new Card("K", "s", 13));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("Q", "c", 12));
        testCardsTable.add(new Card("T", "c", 10));
        testCardsTable.add(new Card("T", "h", 10));
        testCardsTable.add(new Card("7", "s", 7));
        testCardsTable.add(new Card("Q", "h", 12));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(3.1312, result);
    }

    @Test

    public void itIsTwoPairs2 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("2", "c", 2));
        testCardsPlayer.add(new Card("5", "h", 5));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("5", "d", 5));
        testCardsTable.add(new Card("6", "d", 6));
        testCardsTable.add(new Card("A", "s", 14));
        testCardsTable.add(new Card("J", "s", 11));
        testCardsTable.add(new Card("6", "c", 6));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(3.0605, result);
    }

    @Test

    public void itIsTwoPairs3 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("J", "d", 11));
        testCardsPlayer.add(new Card("8", "d", 8));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("Q", "s", 12));
        testCardsTable.add(new Card("Q", "d", 12));
        testCardsTable.add(new Card("2", "c", 2));
        testCardsTable.add(new Card("2", "h", 2));
        testCardsTable.add(new Card("4", "h", 4));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(3.1202, result);
    }


}
