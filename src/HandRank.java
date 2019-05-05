import java.lang.reflect.Array;
import java.util.*;

public class HandRank {

    private ArrayList<Card> cardToCheck;


    public double checkHand (ArrayList<Card> hand, ArrayList<Card> table) {

        this.cardToCheck = new ArrayList<>();


        double value = 0;

        cardToCheck.addAll(hand);
        cardToCheck.addAll(table);

//        System.out.println(cardToCheck);

        Collections.sort(cardToCheck, Card.CardComparator);

        System.out.println("--------------------------------------------------------------------");
        System.out.println(cardToCheck);

        value = onePair();


        return value;
    }



    // 5 next cards from Ace to T of the same suit
    public double poker () {

        double value = 10;






    // value = value + highestCardRank / 10
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
    public double onePair () {

        ListOfNumerbOfOccurrennces list = new ListOfNumerbOfOccurrennces();

        double value = 0.0;
        int count = 0;

        for (int i = 0; i < cardToCheck.size(); i++) {

            count = 1;
            for (int j = i + 1; j < cardToCheck.size(); j++) {

                if (cardToCheck.get(i).getCard_value() == cardToCheck.get(j).getCard_value()) {
                    count = count + 1;
                }
            }
            list.add(cardToCheck.get(i), count);
            System.out.println(cardToCheck.get(i)+ " - "+count);

        }
        list.sort();

        System.out.println("-------------------------------------------");
        System.out.println(list.toString());

        // sprawdzamy czy jest KARETA!

        if (list.get(0).getNumbersOfOccurennces() == 4) {

            value = 8.0 + (list.get(0).getCard().getCard_value() / 100.0);
            return value;
        }

        // sprawdzamy czy jest FULL! xD
        if (list.get(0).getNumbersOfOccurennces() == 3 && list.get(1).getNumbersOfOccurennces() == 3) {

            if (list.get(0).getCard().getCard_value() > list.get(1).getCard().getCard_value()) {
                return value = 7.0 + (list.get(0).getCard().getCard_value() / 100.0);
            } else {
                return value = 7.0 + (list.get(1).getCard().getCard_value() / 100.0);
            }
        }

        // sprawdzamy czy jest trójka
        if (list.get(0).getNumbersOfOccurennces() == 3) {

            value = 4.0 + (list.get(0).getCard().getCard_value() / 100.0);
            return value;
        }



        return value;
    }

    // the highest value of card in hand
    public int hightCard () {

        int value = 1;

        return value;
    }


}
