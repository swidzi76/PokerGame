package poker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HandColorCheck {

    // test dla koloru

    @Test

    public void itIsColour1 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("K", "d", 13));
        testCardsPlayer.add(new Card("K", "s", 13));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("Q", "s", 12));
        testCardsTable.add(new Card("3", "s", 3));
        testCardsTable.add(new Card("T", "s", 10));
        testCardsTable.add(new Card("7", "c", 7));
        testCardsTable.add(new Card("5", "s", 5));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(6.13, result);
    }

    @Test

    public void itIsColour2 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("2", "c", 2));
        testCardsPlayer.add(new Card("5", "h", 5));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("5", "d", 5));
        testCardsTable.add(new Card("6", "c", 6));
        testCardsTable.add(new Card("A", "c", 14));
        testCardsTable.add(new Card("J", "c", 11));
        testCardsTable.add(new Card("7", "c", 7));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(6.14, result);
    }

    @Test

    public void itIsColour3 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("J", "d", 11));
        testCardsPlayer.add(new Card("8", "d", 8));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("T", "h", 10));
        testCardsTable.add(new Card("6", "h", 6));
        testCardsTable.add(new Card("9", "h", 9));
        testCardsTable.add(new Card("2", "h", 2));
        testCardsTable.add(new Card("4", "h", 4));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(6.10, result);
    }

}
