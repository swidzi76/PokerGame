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


        System.out.println("-------------------------------------------");
        System.out.println(list.toString());

        // sprawdzamy czy jest poker!!!

        list.sortForSuits();

        System.out.println(list.toString());




        // sprawdzamy czy jest KARETA!

        list.sort();

        if (list.get(0).getNumbersOfOccurennces() == 4) {

            value = 8.0 + (list.get(0).getCard().getCard_value() / 100.0);
            return value;
        }

        // sprawdzamy czy jest FULL! xD
        if ((list.get(0).getNumbersOfOccurennces() == 3 && list.get(1).getNumbersOfOccurennces() == 3) || (list.get(0).getNumbersOfOccurennces() == 3 && list.get(1).getNumbersOfOccurennces() == 2)) {

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

        // sprawdzamy czy są DWIE PARY!!!

        if (list.get(0).getNumbersOfOccurennces() == 2 && list.get(1).getNumbersOfOccurennces() == 2 && list.get(2).getNumbersOfOccurennces() == 2) {

            if (list.get(0).getCard().getCard_value() > list.get(1).getCard().getCard_value() && list.get(0).getCard().getCard_value() > list.get(2).getCard().getCard_value()) {
                if (list.get(1).getCard().getCard_value() > list.get(2).getCard().getCard_value()) {
                    return 3.0 + list.get(0).getCard().getCard_value() / 100.0 + list.get(1).getCard().getCard_value() / 10000.0;
                } else {
                    return 3.0 + list.get(0).getCard().getCard_value() / 100.0 + list.get(2).getCard().getCard_value() / 10000.0;
                }
            }

            if (list.get(1).getCard().getCard_value() > list.get(0).getCard().getCard_value() && list.get(1).getCard().getCard_value() > list.get(2).getCard().getCard_value()) {
                if (list.get(0).getCard().getCard_value() > list.get(2).getCard().getCard_value()) {
                    return 3.0 + list.get(1).getCard().getCard_value() / 100.0 + list.get(0).getCard().getCard_value() / 10000.0;
                } else {
                    return 3.0 + list.get(1).getCard().getCard_value() / 100.0 + list.get(2).getCard().getCard_value() / 10000.0;
                }
            }

            if (list.get(2).getCard().getCard_value() > list.get(0).getCard().getCard_value() && list.get(2).getCard().getCard_value() > list.get(1).getCard().getCard_value()) {
                if (list.get(0).getCard().getCard_value() > list.get(1).getCard().getCard_value()) {
                    return 3.0 + list.get(2).getCard().getCard_value() / 100.0 + list.get(0).getCard().getCard_value() / 10000.0;
                } else {
                    return 3.0 + list.get(2).getCard().getCard_value() / 100.0 + list.get(1).getCard().getCard_value() / 10000.0;
                }
            }


        }

        if (list.get(0).getNumbersOfOccurennces() == 2 && list.get(1).getNumbersOfOccurennces() == 2) {
            if (list.get(0).getCard().getCard_value() > list.get(1).getCard().getCard_value()) {
                return 3.0 + list.get(0).getCard().getCard_value() / 100.0 + list.get(1).getCard().getCard_value() / 10000.0;
            } else {
                return 3.0 + list.get(1).getCard().getCard_value() / 100.0 + list.get(0).getCard().getCard_value() / 10000.0;
            }
        }

        // sprawdzamy czy jest 1 PARA!!! xD :D XOXOXOXOXOXXOXO :*

        if (list.get(0).getNumbersOfOccurennces() == 2) {
            return 2.0 + list.get(0).getCard().getCard_value() / 100.0;
        }

        // szukamy karty o maksytmalnej wartości w tablicy gdzie ilość wystąpień dla każdej karty = 1

        int max = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getCard().getCard_value() >  max) {
                max = list.get(i).getCard().getCard_value();
            }
        }

        return 1 + max / 100.0;
    }

    // the highest value of card in hand
    public int hightCard () {

        int value = 1;

        return value;
    }


}
