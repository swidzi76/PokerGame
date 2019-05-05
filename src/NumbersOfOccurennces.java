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

    public static Comparator<NumbersOfOccurennces> SuitsComparator = new Comparator<NumbersOfOccurennces>() {

        public int compare(NumbersOfOccurennces n1, NumbersOfOccurennces n2) {
            String value1 = n1.getCard().getSuit();
            String value2 = n2.getCard().getSuit();

            //ascending order
            return value2.compareTo(value1);

        }};

    public static Comparator<NumbersOfOccurennces> ValueComparator = new Comparator<NumbersOfOccurennces>() {

        public int compare(NumbersOfOccurennces n1, NumbersOfOccurennces n2) {
            Integer value1 = n1.getCard().getCard_value();
            Integer value2 = n2.getCard().getCard_value();

            //ascending order
            return value2.compareTo(value1);

        }};
}
