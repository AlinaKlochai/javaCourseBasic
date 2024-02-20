package lessons.lesson_26;

import java.util.ArrayList;

public class TVCollection {
    public static void main(String[] args) {
        ArrayList<TV> tvCollections = new ArrayList<>();

        TV tv1 = new TV("Samsung",42);
        TV tv2 = new TV("LG",46);
        TV tv3 = new TV("LG",48);
        tvCollections.add(tv1);
        tvCollections.add(tv2);
        tvCollections.add(tv3);

        System.out.println(tvCollections);

        String producerForDelete = "LG";

        tvCollections.remove("LG");
        System.out.println(tvCollections);


    }
}
