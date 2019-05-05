import java.util.ArrayList;
import java.util.Collections;

public class ListOfNumerbOfOccurrennces {

    ArrayList<NumbersOfOccurennces> list = new ArrayList<>();

    public void add (Card card, int number) {

        for (int i = 0; i < list.size(); i++) {

            if (card.getCard_value() == list.get(i).getCard().getCard_value()) {
                return;
            }
        }
        list.add(new NumbersOfOccurennces(card, number));
    }

    @Override
    public String toString() {
        String s = "";
        for (NumbersOfOccurennces numbersOfOccurennces : list) {
            s = s + " rank: " + numbersOfOccurennces.getCard().getRank() + " count: " + numbersOfOccurennces.getNumbersOfOccurennces();
        }
        return s;
    }

    public void sort () {

        Collections.sort(list, NumbersOfOccurennces.NumberOfOccirenncesComparator);
    }

    public void sortForSuits () {

        Collections.sort(list, NumbersOfOccurennces.SuitsComparator);
    }

    public void sortForValue () {

        Collections.sort(list, NumbersOfOccurennces.ValueComparator);
    }



    public NumbersOfOccurennces get (int i) {

        if (i < 0 && i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public int size () {
        return list.size();
    }


}
