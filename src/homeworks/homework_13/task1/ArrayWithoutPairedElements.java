package homeworks.homework_13.task1;

import java.util.Arrays;

public class ArrayWithoutPairedElements {

    /*  1.	Создайте массив из 8 случайных целых чисел из интервала [1;50]
        2.	Выведите массив на консоль в строку.
        3.	Замените каждый элемент с нечетным индексом на ноль.
        4.	Снова выведете массив на консоль в отдельной строке.


     */
    public static void main(String[] args) {

        //создавем рандом
        //как получить значение от 1 до 50 если random() возвращает значение от 0 до 1
        //  по следующей формуле
        //       random =  Math.random() * ( max - min + 1 ) + min

        int[] array = new int[8];

        int min = 1;
        int max = 49;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ( max - min + 1) + min);
        }

        System.out.println("Первоначальный вид нашего массива: " + Arrays.toString(array));


        //Замените каждый элемент с нечетным индексом на ноль.

        for (int i = 1; i < array.length; i += 2 ) {
            array[i] = 0;

        }

        //Снова выведете массив на консоль в отдельной строке.

        System.out.println("измененный массив имеет следующий вид: " + Arrays.toString(array));


    }
}
