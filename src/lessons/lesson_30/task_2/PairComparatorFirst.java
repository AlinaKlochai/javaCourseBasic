package lessons.lesson_30.task_2;

import java.util.Comparator;

public class PairComparatorFirst implements Comparator<Pair> {
    @Override
    public int compare(Pair dog1, Pair dog2) {
        return dog1.getName().compareTo(dog2.getName());
    }
}
