package homeworks.homework_29.task_5_HashSet;

import java.util.HashSet;
import java.util.Set;

public class UniqNames {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Amanda");
        names.add("Nicolas");
        names.add("Holly");
        names.add("Holly");
        names.add("Sam");
        names.add("Sam");
        names.add("Kolly");
        names.add("David");
        names.add("Jams");
        names.add("Samon");


        //Выведите количество уникальных имен в наборе.
        System.out.println("Количество уникальных имен в наборе: " + names.size());

        //Проверьте, содержит ли набор определенное имя.
        String nameToCheck = "Holly";
        if (names.contains(nameToCheck)) {
            System.out.println("Набор содержит имя - " + nameToCheck);
        } else {
            System.out.println("Набор не содержит имя  - " + nameToCheck);
        }

    }
}
