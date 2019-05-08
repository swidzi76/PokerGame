package poker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HandPokerTest {

    @Test

    public void itIsAPoker1 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("K", "d", 13));
        testCardsPlayer.add(new Card("3", "s", 3));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("4", "s", 4));
        testCardsTable.add(new Card("5", "s", 5));
        testCardsTable.add(new Card("6", "s", 6));
        testCardsTable.add(new Card("7", "s", 7));
        testCardsTable.add(new Card("7", "h", 7));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(9.07, result);
    }

    @Test

    public void itIsAPoker2 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("K", "d", 13));
        testCardsPlayer.add(new Card("Q", "d", 12));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("A", "d", 14));
        testCardsTable.add(new Card("J", "d", 11));
        testCardsTable.add(new Card("6", "s", 6));
        testCardsTable.add(new Card("7", "s", 7));
        testCardsTable.add(new Card("T", "d", 10));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(9.14, result);
    }

    @Test

    public void itIsAPoker3 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("2", "h", 2));
        testCardsPlayer.add(new Card("Q", "h", 12));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("A", "d", 14));
        testCardsTable.add(new Card("J", "h", 11));
        testCardsTable.add(new Card("9", "h", 9));
        testCardsTable.add(new Card("8", "h", 8));
        testCardsTable.add(new Card("T", "h", 10));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(9.12, result);
    }


}
