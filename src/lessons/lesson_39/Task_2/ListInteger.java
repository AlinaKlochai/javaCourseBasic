package lessons.lesson_39.Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInteger {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(6);
        integers.add(3);

       // Collections.sort(integers,((o1, o2) -> o2.compareTo(o1)));
        Collections.sort(integers,((o1, o2) ->(-1) * (o1.compareTo(o2))));
        System.out.println(integers);
    }
}
