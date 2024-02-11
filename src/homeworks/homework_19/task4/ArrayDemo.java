package homeworks.homework_19.task4;

/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
Выведите массивы на экран в двух отдельных строках
Посчитайте среднее арифметическое элементов каждого массива и сообщите,
для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
 */

import homeworks.homework_14.task3.ArrayServise;
import scanner.UserInput;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayService service = new ArrayService();
        int sizeOfArray = service.inputSizeOfArray();
        int startValur = service.inputStartValue();
        int endValue = service.inputEndValue();

        // создаем первый массив
       int[] firstArray = service.createArray(sizeOfArray, startValur, endValue);

        // создаем второй массив
       int[] secondArray = service.createArray(sizeOfArray, startValur, endValue);


        // заполняем первый массив
        int[] firstArrayFilled = service.fillArray(firstArray,startValur,endValue);
        System.out.println("Первый заполненный массив рандомными значениеями: ");
        System.out.println(Arrays.toString(firstArrayFilled));

        // заполняем второй массив
        int[] secondArrayFilled = service.fillArray(secondArray,startValur,endValue);
        System.out.println("Второй заполненный массив рандомными значениеями: ");
        System.out.println(Arrays.toString(secondArrayFilled));

        //считаем среднее арифметическое значения первого массива
        double avarageFirstArray = service.calculateAverage(firstArrayFilled);
        System.out.println("Среднее арифметическое элементов первого массива: " + avarageFirstArray);

        //считаем среднее арифметическое значения второго массива
        double avarageSecondArray = service.calculateAverage(secondArrayFilled);
        System.out.println("Среднее арифметическое элементов второго массива: " + avarageSecondArray);


        //сравниваем значения средних арифметических
        if (avarageFirstArray > avarageSecondArray) {
            System.out.println("Среднее арифметическое элементов первого массива больше, чем второго массива.");
        } else if (avarageFirstArray < avarageSecondArray) {
            System.out.println("Среднее арифметическое элементов второго массива больше, чем первого массива.");
        } else {
            System.out.println("Средние арифметические элементов обоих массивов равны.");
        }






    }
}
