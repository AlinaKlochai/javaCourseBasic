package homeworks.homework_36.Generics.task_1;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.put("Cat");

        System.out.println("В коробке находится: " + stringBox.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.put(56);

        System.out.println("В коробке находится: " + integerBox.get());

        Box<Float> floatBox = new Box<>();
        floatBox.put(8f);


        System.out.println("В коробке находится: " + floatBox.get());

        Box<List<Integer>> listBox = new Box<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(67);
        listBox.put(integerList);
        System.out.println("В коробке находится: " + listBox.get());

    }
}
