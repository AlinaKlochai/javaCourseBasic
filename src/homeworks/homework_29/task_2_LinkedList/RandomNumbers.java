package homeworks.homework_29.task_2_LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        List<Integer> integerLinkedList = new LinkedList<>();

        Random random = new Random();
        // Добавление случайных чисел в диапазоне от 1 до 100
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            integerLinkedList.add(randomNumber);
        }

        System.out.println("Список случайных чисел:");
        System.out.println(integerLinkedList);

        //сначала устанавливаем начальные значения max и min как
        // первый элемент списка, если список не пустой. Затем мы
        // проходимся по остальным элементам списка и обновляем max и
        // min с помощью методов Math.max() и Math.min() соответственно.


        int max = integerLinkedList.isEmpty() ? 0 : integerLinkedList.getFirst();
        int min = integerLinkedList.isEmpty() ? 0 : integerLinkedList.getFirst();
        for (int number : integerLinkedList){
            max = Math.max(max,number);                               // сравнивает текущее значение max с текущим элементом number и присваивает max большее из двух значений.
            min = Math.min(min,number);
        }

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

        // с помощью класса "Collections" сортируем наш список в порядке возрастания
        Collections.sort(integerLinkedList);

        System.out.println("Отсортированный писок в порядке возрастания: ");
        System.out.println(integerLinkedList);

    }
}
