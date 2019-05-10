package poker;

import java.util.*;

import static java.lang.Math.round;

public class HandRank {

    private ArrayList<Card> cardToCheck;


    public double checkHand (ArrayList<Card> hand, ArrayList<Card> table) {

        this.cardToCheck = new ArrayList<>();


        double value = 0;

        cardToCheck.addAll(hand);
        cardToCheck.addAll(table);

//        System.out.println(cardToCheck);

        Collections.sort(cardToCheck, Card.CardComparator);

        System.out.println("---- kolekcja wejsciowa hand + table - cardToCheck --------------------");
        System.out.println(cardToCheck);

        value = onePair();
        System.out.println("value = "+value);

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
//            System.out.println(cardToCheck.get(i)+ " - "+count);

        }

        // obiekt list zawiera kolekcje: karta - liczba występeń
        list.sort();    // sortowanie po value
        System.out.println("-- posortowana kolekcja list  LICZBA WYSTĄPIEń  -----------------");
        System.out.println(list.toString());

        // sprawdzamy czy jest poker!!!
        // liczymy ile jest wystąpień danego koloru
        // c - clubs, h - hearts, s - spades, d - diamonds
        int numC = 0;
        int numH = 0;
        int numS = 0;
        int numD = 0;
        for (int i = 0; i < cardToCheck.size(); i++) {
            if( cardToCheck.get(i).getSuit().equals("c")){
                numC++;
            }
            if(cardToCheck.get(i).getSuit().equals("h")){
                numH++;
            }
            if(cardToCheck.get(i).getSuit().equals("s")){
                numS++;
            }
            if(cardToCheck.get(i).getSuit().equals("d")){
                numD++;
            }
        }

        System.out.println("liczba wystąpień c:"+numC+ " h:"+numH+ " s:"+numS+" d:"+numD);
        if(numC > 4){ return checkPokerOrColor(list,"c"); }        // jeżeli 5 lub więcej pików
        if(numH > 4){ return checkPokerOrColor(list,"h"); }        // jeżeli 5 lub więcej serc
        if(numS > 4){ return checkPokerOrColor(list,"s"); }        // jeżeli 5 lub więcej krzyże
        if(numD > 4){ return checkPokerOrColor(list,"d"); }        // jeżeli 5 lub więcej karo

        // sprawdzamy czy jest STRIT - pięć kart po kolei wg. value.
        // list posortowany po value

        int numberCard = 1;
        Card maxCard = null;
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i).getCard().getCard_value() == list.get(i+1).getCard().getCard_value()-1){
                maxCard = list.get(i+1).getCard();
                numberCard++;
            }else{
                maxCard = null;
                numberCard=1;
            }
            // jeżeli mamy 5 kart po kolei to STRIT
            if (numberCard == 5) {
                return 5.0 + maxCard.getCard_value() / 100.0;
            }
        }



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
                    return round4(3.0 + list.get(0).getCard().getCard_value() / 100.0 + list.get(1).getCard().getCard_value() / 10000.0);
                } else {
                    return round4(3.0 + list.get(0).getCard().getCard_value() / 100.0 + list.get(2).getCard().getCard_value() / 10000.0);
                }
            }

            if (list.get(1).getCard().getCard_value() > list.get(0).getCard().getCard_value() && list.get(1).getCard().getCard_value() > list.get(2).getCard().getCard_value()) {
                if (list.get(0).getCard().getCard_value() > list.get(2).getCard().getCard_value()) {
                    return round4(3.0 + list.get(1).getCard().getCard_value() / 100.0 + list.get(0).getCard().getCard_value() / 10000.0);
                } else {
                    return round4(3.0 + list.get(1).getCard().getCard_value() / 100.0 + list.get(2).getCard().getCard_value() / 10000.0);
                }
            }

            if (list.get(2).getCard().getCard_value() > list.get(0).getCard().getCard_value() && list.get(2).getCard().getCard_value() > list.get(1).getCard().getCard_value()) {
                if (list.get(0).getCard().getCard_value() > list.get(1).getCard().getCard_value()) {
                    return round4(3.0 + list.get(2).getCard().getCard_value() / 100.0 + list.get(0).getCard().getCard_value() / 10000.0);
                } else {
                    return round4(3.0 + list.get(2).getCard().getCard_value() / 100.0 + list.get(1).getCard().getCard_value() / 10000.0);
                }
            }


        }

        if (list.get(0).getNumbersOfOccurennces() == 2 && list.get(1).getNumbersOfOccurennces() == 2) {
            if (list.get(0).getCard().getCard_value() > list.get(1).getCard().getCard_value()) {
                return round4(3.0 + list.get(0).getCard().getCard_value() / 100.0 + list.get(1).getCard().getCard_value() / 10000.0);
            } else {
                return round4(3.0 + list.get(1).getCard().getCard_value() / 100.0 + list.get(0).getCard().getCard_value() / 10000.0);
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
    private double checkPokerOrColor(ListOfNumerbOfOccurrennces list, String s){
        double value = 0.0;
        // list posortowany po value
        // badamy kolekcję cardToCheck
        ArrayList<Card>  tempList = new ArrayList<>();
        for (int i = 0; i < cardToCheck.size(); i++) {
            if(cardToCheck.get(i).getSuit().equals(s)){
                tempList.add(cardToCheck.get(i));
            }
        }
        // w tempList mamy tylko karty o jednym kolorzei i jest ich conajmniej 5
        // sotrujemy tempList po value
        Collections.sort(tempList, Card.CardComparator);
        System.out.println("--- lista tempList z posortowanymi kartamiw jednym kolorze -----");
        System.out.println(tempList);

        if(tempList.size() == 5){
            if((tempList.get(0).getCard_value() + 4) == tempList.get(4).getCard_value()){
                // mamy POKERA
                return 9.0 + tempList.get(4).getCard_value() / 100.0;
            }else{
                // mamy KOLOR
                return 6.0 + tempList.get(4).getCard_value() / 100.0;
            }
        }
        if(tempList.size() == 6){
            if((tempList.get(0).getCard_value() + 4) == tempList.get(4).getCard_value()){
                // mamy POKERA
                return 9.0 + tempList.get(4).getCard_value() / 100.0;
            }

            if((tempList.get(1).getCard_value() + 4) == tempList.get(5).getCard_value()){
                // mamy POKERA
                return 9.0 + tempList.get(5).getCard_value() / 100.0;
            }else{
                // mamy KOLOR
                return 6.0 + tempList.get(5).getCard_value() / 100.0;
            }

        }
        if(tempList.size() == 7){
            if((tempList.get(0).getCard_value() + 4) == tempList.get(4).getCard_value()){
                // mamy POKERA
                return 9.0 + tempList.get(4).getCard_value() / 100.0;
            }
            if((tempList.get(1).getCard_value() + 4) == tempList.get(5).getCard_value()){
                // mamy POKERA
                return 9.0 + tempList.get(5).getCard_value() / 100.0;
            }

            if((tempList.get(2).getCard_value() + 4) == tempList.get(6).getCard_value()){
                // mamy POKERA
                return 9.0 + tempList.get(6).getCard_value() / 100.0;
            }else{
                // mamy KOLOR
                return 6.0 + tempList.get(6).getCard_value() / 100.0;
            }

        }
        return value;
    }

    // the highest value of card in hand
    public int hightCard () {

        int value = 1;

        return value;
    }
    private double round4(double d){
        double d1 = d * 10000.0;

        return round(d1) / 10000.0;
    }

}
