import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Card {

    public static Comparator<Card> CardComparator = new Comparator<Card>() {

        public int compare(Card c1, Card c2) {
            Integer value1 = c1.getCard_value();
            Integer value2 = c2.getCard_value();


            //ascending order
            return value1.compareTo(value2);

        }};

    private String rank; // 2,3,4,5,6,7,8,9,T,J,Q,K,A
    private  String suit; // c - clubs, h - hearts, s - spades, d - diamonds
    private  int card_value; // for example 2 = 2, 8 = 8, T = 10, A = 13,


    public Card(String rank, String suit, int card_value) {
        this.rank = rank;
        this.suit = suit;
        this.card_value = card_value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                ", card_value=" + card_value +
                '}';
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getCard_value() {
        return card_value;
    }

    public void setCard_value(int card_value) {
        this.card_value = card_value;
    }


    public ArrayList<Card> createDeck () {

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

        ArrayList<Card> deck = new ArrayList<>();

        deck.add(card1);
        deck.add(card2);
        deck.add(card3);
        deck.add(card4);
        deck.add(card5);
        deck.add(card6);
        deck.add(card7);
        deck.add(card8);
        deck.add(card9);
        deck.add(card10);
        deck.add(card11);
        deck.add(card12);
        deck.add(card13);
        deck.add(card14);
        deck.add(card15);
        deck.add(card16);
        deck.add(card17);
        deck.add(card18);
        deck.add(card19);
        deck.add(card20);
        deck.add(card21);
        deck.add(card22);
        deck.add(card23);
        deck.add(card24);
        deck.add(card25);
        deck.add(card26);
        deck.add(card27);
        deck.add(card28);
        deck.add(card29);
        deck.add(card30);
        deck.add(card31);
        deck.add(card32);
        deck.add(card33);
        deck.add(card34);
        deck.add(card35);
        deck.add(card36);
        deck.add(card37);
        deck.add(card38);
        deck.add(card39);
        deck.add(card40);
        deck.add(card41);
        deck.add(card42);
        deck.add(card43);
        deck.add(card44);
        deck.add(card45);
        deck.add(card46);
        deck.add(card47);
        deck.add(card48);
        deck.add(card49);
        deck.add(card50);
        deck.add(card51);
        deck.add(card52);
        
        return deck;

    }


}