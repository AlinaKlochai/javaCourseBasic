package lessons.lesson_28;

import java.util.HashMap;
import java.util.Map;

public class MapTask1 {
    public static void main(String[] args) {
        int[] arr = {1,7,49,4,12,9,45,3,9,23,1,7,12,1,7,23};

          /*
        написать метод, который получает на входе массив
        возвращает коллекцию, у которой
        в качестве ключа - элемент массива,
        а значение - количество повторений
         */

        Map<Integer, Integer> result = createHashMapCollection(arr);
        System.out.println(result);
    }

    public static Map<Integer, Integer> createHashMapCollection(int[] arr) {
        Map<Integer, Integer> repetitions = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int key = arr[i];
            repetitions.put(key, repetitions.getOrDefault(key, 0) + 1);
        }

        return repetitions;
    }

}
