package poker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

// test dla karety

public class HandQuadTest {

    @Test

    public void itIsAQuad1 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("K", "d", 13));
        testCardsPlayer.add(new Card("K", "s", 13));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("K", "c", 13));
        testCardsTable.add(new Card("T", "c", 10));
        testCardsTable.add(new Card("9", "h", 9));
        testCardsTable.add(new Card("7", "s", 7));
        testCardsTable.add(new Card("K", "h", 13));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(8.13, result);
    }

    @Test

    public void itIsAStraight2 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("2", "d", 2));
        testCardsPlayer.add(new Card("5", "d", 5));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("2", "h", 2));
        testCardsTable.add(new Card("4", "d", 4));
        testCardsTable.add(new Card("9", "s", 9));
        testCardsTable.add(new Card("2", "s", 2));
        testCardsTable.add(new Card("2", "c", 2));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(8.02, result);
    }

    @Test

    public void itIsAQuad3 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("Q", "c", 12));
        testCardsPlayer.add(new Card("Q", "h", 12));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("4", "s", 4));
        testCardsTable.add(new Card("4", "d", 4));
        testCardsTable.add(new Card("T", "c", 10));
        testCardsTable.add(new Card("4", "c", 4));
        testCardsTable.add(new Card("4", "h", 4));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(8.04, result);
    }


}
