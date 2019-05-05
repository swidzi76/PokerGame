import java.lang.reflect.Array;
import java.util.ArrayList;

public class HandRank {



    // 5 next cards from Ace to T of the same suit
    public int royalFlush (ArrayList<Deck> hand) {

        int value = 10;




        return value;

    }

    // 5 next cards of the same suit
    public int straightFlush () {

        int value = 9;

        return value;
    }

    // 4 of the same cards
    public int fourOfAKind () {

        int value = 8;

        return value;
    }

    // 3 + 2
    public int fullHouse () {

        int value = 7;

        return value;
    }

    // 5 cards of the same suit
    public int flush () {

        int value = 6;

        return value;
    }

    // 5 next cards
    public int streight () {

        int value = 5;

        return value;
    }

    // 3 the same cards
    public int threeOfAKind () {

        int value = 4;

        return value;
    }

    // 2 + 2
    public int twoPairs () {

        int value = 3;

        return value;
    }

    // two the same cards
    public int onePair () {

        int value = 2;

        return value;
    }

    // the highest value of card in hand
    public int hightCard () {

        int value = 1;

        return value;
    }


}
