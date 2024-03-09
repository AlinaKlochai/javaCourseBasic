package homeworks.homework_36.Collections.task_1_8;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.offerFirst(5);
        arrayDeque.offerLast(10);

        System.out.println("ArrayDeque с добавленными елементами:");
        System.out.println(arrayDeque);

        System.out.println("Извлечение элементов с конца очереди:");
        while (!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.pollLast());
        }

    }
}
