package homeworks.homework_29.task_6_ArrayList_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteDublicates {
    public static void main(String[] args) {
        //Создайте `ArrayList` с дублирующимися элементами.

        List<Integer> arrayListWithDublicates = new ArrayList<>();
        arrayListWithDublicates.add(1);
        arrayListWithDublicates.add(1);
        arrayListWithDublicates.add(2);
        arrayListWithDublicates.add(5);
        arrayListWithDublicates.add(7);
        arrayListWithDublicates.add(7);

        System.out.println("ArrayList с дублирующимися элементами: ");
        System.out.println(arrayListWithDublicates);

        //Преобразуйте `ArrayList` в `HashSet`, чтобы автоматически удалить дубликаты.

        Set<Integer> hashSetWithoutDublicates = new HashSet<>(arrayListWithDublicates);
        System.out.println("Новый список HashSet без дуликатов:");
        System.out.println(hashSetWithoutDublicates);

        //Добавьте новые элементы в `HashSet`
        hashSetWithoutDublicates.add(8);
        hashSetWithoutDublicates.add(11);
        System.out.println("Список HashSet с новыми элементами:");
        System.out.println(hashSetWithoutDublicates);

        //преобразуйте его обратно в `ArrayList`
        List<Integer> arrayListWithoutDublicates = new ArrayList<>(hashSetWithoutDublicates);
        System.out.println("Список HashSet в ArrayList:");
        System.out.println(arrayListWithoutDublicates);
    }
}
