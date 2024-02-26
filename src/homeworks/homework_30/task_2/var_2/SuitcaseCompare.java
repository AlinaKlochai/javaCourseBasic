package homeworks.homework_30.task_2.var_2;

import java.util.Comparator;

public class SuitcaseCompare implements Comparator<Suitcase> {
    @Override
    public int compare(Suitcase suitcase1, Suitcase suitcase2) {
        int result = suitcase1.getSize().compareTo(suitcase2.getSize());
        if (result == 0) {
            result = suitcase1.getMaterial().compareTo(suitcase2.getMaterial());
        }

        if (result == 0) {
            result = suitcase1.getColor().compareTo(suitcase2.getColor());
        }

        return result;
    }

}
