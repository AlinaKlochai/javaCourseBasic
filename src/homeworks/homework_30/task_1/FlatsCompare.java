package homeworks.homework_30.task_1;

import java.util.Set;
import java.util.TreeSet;

public class FlatsCompare {
    public static void main(String[] args) {
        Set<Flat> flats = new TreeSet<>();

        flats.add(new Flat(95.3,3));
        flats.add(new Flat(55,2));
        flats.add(new Flat(55,3));
        System.out.println(flats);
    }
}
