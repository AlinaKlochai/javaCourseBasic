package homeworks.homework_19.Project.Variant_1;

/*Задание: Создайте класс ArrayService, содержащий метод sort,
который принимает массив целых чисел и сортирует его по убыванию.

Добавьте метод createArrayFromUserInput для чтения размера
массива и его создания.

Добавьте метод fillArrayFromUserInput для заполнения
массива элементами от пользователя, возвращая созданный
массив как ссылку.

Добавьте метод printArray для вывода отсортированного массива.

Реализуйте класс ArraySortDemo для демонстрации работы программы.

 */

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        ArrayService service = new ArrayService();
        int[] array = service.createArrayFromUserInput();

        int[] filledArray = service.fillArrayFromUserInput(array);

        int[] reversArray = service.reverseArray(filledArray);
        System.out.println("Исходный массив введен от пользователя: ");
        System.out.println(Arrays.toString(reversArray));

        service.printArray(reversArray);

    }
}
