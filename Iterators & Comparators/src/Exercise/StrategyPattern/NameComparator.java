package Exercise.StrategyPattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = Integer.compare(o1.getName().length(), o2.getName().length());
        if (result == 0) {
            char o1FirstLetter = o1.getName().toLowerCase().charAt(0);
            char o2FirstLetter = o2.getName().toLowerCase().charAt(0);
            result = /*Integer.compare(o1FirstLetter, o2FirstLetter);*/
            o1FirstLetter-o2FirstLetter;
        }
        return result;
    }
}
