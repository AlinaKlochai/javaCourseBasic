package lessons.lesson_41.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskStream4 {
    /*
 создать коллекцию с номерами телефонов
 (с циклами и с помощью стрима)

     */

    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Ruslan", Arrays.asList("+26478384", "+4534632263")));
        humans.add(new Human("Victor", Arrays.asList("+673473473", "+64584584567")));
        humans.add(new Human("Petr", Arrays.asList("+25635623564", "+3263565465")));

        List<String> phones = humans.stream()
                .flatMap(human -> human.getPhones().stream())
                .toList();

        System.out.println(phones);

        List<String> phones2 = new ArrayList<>();

        for (Human human: humans){
            phones2.addAll(human.getPhones());
        }

        System.out.println(phones2);



       }
}
