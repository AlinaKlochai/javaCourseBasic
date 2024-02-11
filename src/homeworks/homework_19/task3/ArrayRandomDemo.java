package homeworks.homework_19.task3;

/*
Создайте массив из 8 случайных целых чисел из отрезка [1;10]
Отсортируйте массив по убыванию любым из алгоритмов.
 */

import java.util.Arrays;

public class ArrayRandomDemo {
    public static void main(String[] args) {
        ArrayRandomServise servise = new ArrayRandomServise();
        int sizeOfArray = servise.inputSizeOfArray();
        System.out.println("Созданный массив будет из " + sizeOfArray + " ячеек.");

        int startValue = servise.inputStartValue();
        int endValue = servise.inputEndValue();

        int[] array = servise.createArray(sizeOfArray, startValue, endValue);


        int[] filledArray = servise.fillArray(array,startValue,endValue);
        System.out.println("Созданный массив из рандомных чисел: ");
        System.out.println(Arrays.toString(filledArray));

        int[] sortedArray = servise.sortArray(filledArray);
        System.out.println("Отсортированный массив по убыванию: ");
        System.out.println(Arrays.toString(sortedArray));
    }

}
