package poker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

//testy dla trójki

public class HandThreeOfAKindTest {

    @Test

    public void itIsThreeOfAKind_1 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("K", "d", 13));
        testCardsPlayer.add(new Card("K", "s", 13));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("K", "c", 13));
        testCardsTable.add(new Card("T", "c", 10));
        testCardsTable.add(new Card("2", "h", 2));
        testCardsTable.add(new Card("7", "s", 7));
        testCardsTable.add(new Card("Q", "h", 12));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(4.13, result);
    }

    @Test

    public void itIsThreeOfAKind_2 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("2", "c", 2));
        testCardsPlayer.add(new Card("5", "h", 5));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("5", "c", 5));
        testCardsTable.add(new Card("A", "d", 14));
        testCardsTable.add(new Card("J", "s", 11));
        testCardsTable.add(new Card("4", "s", 4));
        testCardsTable.add(new Card("5", "d", 5));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(4.05, result);
    }

    @Test

    public void itIsThreeOfAKind_3 () {

        //given

        ArrayList<Card> testCardsPlayer = new ArrayList<>();

        testCardsPlayer.add(new Card("3", "c", 3));
        testCardsPlayer.add(new Card("2", "h", 2));

        ArrayList<Card> testCardsTable = new ArrayList<>();

        testCardsTable.add(new Card("A", "s", 14));
        testCardsTable.add(new Card("Q", "d", 12));
        testCardsTable.add(new Card("A", "c", 14));
        testCardsTable.add(new Card("4", "d", 4));
        testCardsTable.add(new Card("A", "h", 14));

        //when

        HandRank testhandRank = new HandRank();
        double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

        //then

        Assertions.assertEquals(4.14, result);
    }

}
