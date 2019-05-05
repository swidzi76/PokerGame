import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
//        this.refresh();
        this.init();
    }
    // we take one card from deck
    // number of card decrease
    public Card getCard(){
        Random random = new Random();
        int nrCard = random.nextInt(cards.size());
        Card card = cards.get(nrCard);
        cards.remove(nrCard);
        return card;
    }
    public void showDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void init() {
        cards.clear();
        int value = 2;
        int nrSuit = 1;
        String rank = "";
        String suit = "";
        for (int i = 1; i < (4 * 13 + 1); i++) {
            switch (value) {
                case 10: {rank = "T"; break;}
                case 11: {rank = "J"; break;}
                case 12: {rank = "Q"; break;}
                case 13: {rank = "K"; break;}
                case 14: {rank = "A"; break;}
                default: rank = String.valueOf(value);

            }
            switch (nrSuit) {
                case 1: {suit = "c"; break;}
                case 2: {suit = "d"; break;}
                case 3: {suit = "h"; break;}
                case 4: {suit = "s"; break;}
            }

            cards.add(new Card(rank, suit, value));
            nrSuit++;
            if (nrSuit == 5) nrSuit = 1;
            if (i % 4 == 0) value++;
        }
//        System.out.println("Deck z init, liczba kart : " + cards.size());
//        for (Card card : cards) {
//            System.out.println(card);
//        }
    }

    public void refresh() {
        Card card1 = new Card("2", "c", 2);
        Card card2 = new Card("2", "d", 2);
        Card card3 = new Card("2", "h", 2);
        Card card4 = new Card("2", "s", 2);
        Card card5 = new Card("3", "c", 3);
        Card card6 = new Card("3", "d", 3);
        Card card7 = new Card("3", "h", 3);
        Card card8 = new Card("3", "s", 3);
        Card card9 = new Card("4", "c", 4);
        Card card10 = new Card("4", "d", 4);
        Card card11 = new Card("4", "h", 4);
        Card card12 = new Card("4", "s", 4);
        Card card13 = new Card("5", "c", 5);
        Card card14 = new Card("5", "d", 5);
        Card card15 = new Card("5", "h", 5);
        Card card16 = new Card("5", "s", 5);
        Card card17 = new Card("6", "c", 6);
        Card card18 = new Card("6", "d", 6);
        Card card19 = new Card("6", "h", 6);
        Card card20 = new Card("6", "s", 6);
        Card card21 = new Card("7", "c", 7);
        Card card22 = new Card("7", "d", 7);
        Card card23 = new Card("7", "h", 7);
        Card card24 = new Card("7", "s", 7);
        Card card25 = new Card("8", "c", 8);
        Card card26 = new Card("8", "d", 8);
        Card card27 = new Card("8", "h", 8);
        Card card28 = new Card("8", "s", 8);
        Card card29 = new Card("9", "c", 9);
        Card card30 = new Card("9", "d", 9);
        Card card31 = new Card("9", "h", 9);
        Card card32 = new Card("9", "s", 9);
        Card card33 = new Card("T", "c", 10);
        Card card34 = new Card("T", "d", 10);
        Card card35 = new Card("T", "h", 10);
        Card card36 = new Card("T", "s", 10);
        Card card37 = new Card("J", "c", 11);
        Card card38 = new Card("J", "d", 11);
        Card card39 = new Card("J", "h", 11);
        Card card40 = new Card("J", "s", 11);
        Card card41 = new Card("Q", "c", 12);
        Card card42 = new Card("Q", "d", 12);
        Card card43 = new Card("Q", "h", 12);
        Card card44 = new Card("Q", "s", 12);
        Card card45 = new Card("K", "c", 13);
        Card card46 = new Card("K", "d", 13);
        Card card47 = new Card("K", "h", 13);
        Card card48 = new Card("K", "s", 13);
        Card card49 = new Card("A", "c", 14);
        Card card50 = new Card("A", "d", 14);
        Card card51 = new Card("A", "h", 14);
        Card card52 = new Card("A", "s", 14);

        this.cards.addAll(Arrays.asList(card1, card2, card3, card4, card5, card6, card7, card8, card9, card10,
                card11, card12, card13, card14, card15, card16, card17, card18, card19, card20,
                card21, card22, card23, card24, card25, card26, card27, card28, card29, card30,
                card31, card32, card33, card34, card35, card36, card37, card38, card39, card40,
                card41, card42, card43, card44, card45, card46, card47, card48, card49, card50,
                card51, card52));
    }
}
