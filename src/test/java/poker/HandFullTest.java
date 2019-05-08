package poker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

// testy dla fulla

public class HandFullTest {

        @Test

        public void itIsAFull_1 () {

            //given

            ArrayList<Card> testCardsPlayer = new ArrayList<>();

            testCardsPlayer.add(new Card("K", "d", 13));
            testCardsPlayer.add(new Card("K", "s", 13));

            ArrayList<Card> testCardsTable = new ArrayList<>();

            testCardsTable.add(new Card("K", "c", 13));
            testCardsTable.add(new Card("T", "c", 10));
            testCardsTable.add(new Card("T", "h", 10));
            testCardsTable.add(new Card("7", "s", 7));
            testCardsTable.add(new Card("Q", "h", 12));

            //when

            HandRank testhandRank = new HandRank();
            double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

            //then

            Assertions.assertEquals(7.13, result);
        }

        @Test

        public void itIsAFull_2 () {

            //given

            ArrayList<Card> testCardsPlayer = new ArrayList<>();

            testCardsPlayer.add(new Card("2", "c", 2));
            testCardsPlayer.add(new Card("5", "h", 5));

            ArrayList<Card> testCardsTable = new ArrayList<>();

            testCardsTable.add(new Card("3", "h", 3));
            testCardsTable.add(new Card("3", "d", 3));
            testCardsTable.add(new Card("3", "s", 3));
            testCardsTable.add(new Card("4", "s", 4));
            testCardsTable.add(new Card("4", "c", 4));

            //when

            HandRank testhandRank = new HandRank();
            double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

            //then

            Assertions.assertEquals(7.04, result);
        }

        @Test

        public void itIsAFull_3 () {

            //given

            ArrayList<Card> testCardsPlayer = new ArrayList<>();

            testCardsPlayer.add(new Card("Q", "c", 12));
            testCardsPlayer.add(new Card("2", "h", 2));

            ArrayList<Card> testCardsTable = new ArrayList<>();

            testCardsTable.add(new Card("Q", "s", 12));
            testCardsTable.add(new Card("Q", "d", 12));
            testCardsTable.add(new Card("2", "c", 2));
            testCardsTable.add(new Card("4", "c", 4));
            testCardsTable.add(new Card("4", "h", 4));

            //when

            HandRank testhandRank = new HandRank();
            double result = testhandRank.checkHand(testCardsPlayer,testCardsTable);

            //then

            Assertions.assertEquals(7.12, result);
        }

    }
