package homeworks.homework_30.task_1;

import java.util.Set;
import java.util.TreeSet;

public class FlatsCompare {
    public static void main(String[] args) {
        Set<Flat> flats = new TreeSet<>();

        flats.add(new Flat(3,95.3));
        flats.add(new Flat(2,55.4));
        flats.add(new Flat(3,55.4));

        System.out.println(flats);
    }
}
