import java.util.Comparator;

public class NumbersOfOccurennces {

    private Card card;
    private int numbersOfOccurennces;

    public NumbersOfOccurennces(Card card, int numbersOfOccurennces) {
        this.card = card;
        this.numbersOfOccurennces = numbersOfOccurennces;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getNumbersOfOccurennces() {
        return numbersOfOccurennces;
    }

    public void setNumbersOfOccurennces(int numbersOfOccurennces) {
        this.numbersOfOccurennces = numbersOfOccurennces;
    }

    public static Comparator<NumbersOfOccurennces> NumberOfOccirenncesComparator = new Comparator<NumbersOfOccurennces>() {

        public int compare(NumbersOfOccurennces n1, NumbersOfOccurennces n2) {
            Integer value1 = n1.numbersOfOccurennces;
            Integer value2 = n2.numbersOfOccurennces;

            //ascending order
            return value2.compareTo(value1);

        }};


}
