public class Deck {

    private String rank; // 2,3,4,5,6,7,8,9,T,J,Q,K,A
    private  String suit; // c - clubs, h - hearts, s - spades, d - diamonds
    private  int card_value; // for example 2 = 2, 8 = 8, T = 10, A = 13,


    public Deck(String rank, String suit, int card_value) {
        this.rank = rank;
        this.suit = suit;
        this.card_value = card_value;
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







}
