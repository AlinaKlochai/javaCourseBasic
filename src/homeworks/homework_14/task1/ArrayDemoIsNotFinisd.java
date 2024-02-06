package homeworks.homework_14.task1;

import java.util.Arrays;

public class ArrayDemoIsNotFinisd {
    public static void main(String[] args) {
        /*Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n .
        Найдите недостающий элемент.

        input:
        arr[] = {1,2,3,5}
        out: 4

        arr[] = {6,1,2,8,3,4,7,10,5}
        out: 9
         */

        int[] array = {6,1,2,8,3,4,7,10,5};
        System.out.println("Наш исходный массив: ");
        System.out.println(Arrays.toString(array));

        //сортируем исходный массив вложенным методом сортировки
        Arrays.sort(array);
        System.out.println("Отсортированный массив по возрастанию: ");
        System.out.println(Arrays.toString(array));

        //ищем недостающий елемент в массиве
        int n = array.length;
        int sumProgression = n * (1 + n)/2;                                   // n * (1 + n)/2;
        int sumArray = 0;

        for (int i = 0; i < array.length - 1; i++) {
            sumArray = sumArray + array[i];
        }
        int missedNumber = sumProgression - sumArray;

        System.out.println("Наш пропущенный елемент: " + missedNumber);

    }
}
