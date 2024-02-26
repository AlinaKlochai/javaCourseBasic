package homeworks.homework_30.task_2.var_2;

import java.util.Comparator;

public class SuitcaseComparatorColor implements Comparator<Suitcase> {
    @Override
    public int compare(Suitcase suitcase1, Suitcase suitcase2) {
        return suitcase1.getColor().compareTo(suitcase2.getColor());
    }
}
