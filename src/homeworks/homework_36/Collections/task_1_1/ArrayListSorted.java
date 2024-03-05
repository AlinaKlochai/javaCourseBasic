package homeworks.homework_36.Collections.task_1_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Создать ArrayList из 10 элементов, отсортировать его по возрастанию и вывести на экран.
 */
public class ArrayListSorted {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(8);
        numbers.add(10);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        System.out.println("Исходний массив: ");
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("Отсортированный массив по возрастанию: ");
        System.out.println(numbers);


    }
}
