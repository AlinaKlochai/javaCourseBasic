package homeworks.homework_36.Collections.task_1_10;

/*
Создать HashSet из нескольких элементов, создать LinkedList из тех же элементов и вывести на экран элементы LinkedList в том порядке, в котором они были добавлены.
 */

import java.util.*;

public class HashSetLinkedList {
    public static void main(String[] args) {

        Set<Integer> integerSet2 = new LinkedHashSet<>();              //LinkedHashSet - сохраняет порядок введенных елементов
        integerSet2.add(2);
        integerSet2.add(5);
        integerSet2.add(52);

        System.out.println("HashSet");
        System.out.println(integerSet2);

        List<Integer> integerList2 = new LinkedList<>(integerSet2);
        System.out.println("LinkedList");
        System.out.println(integerList2);
    }
}
