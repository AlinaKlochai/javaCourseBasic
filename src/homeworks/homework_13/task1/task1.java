package homeworks.homework_13.task1;

import java.util.Arrays;

public class task1 {

    /*  1.	Создайте массив из 8 случайных целых чисел из интервала [1;50]
        2.	Выведите массив на консоль в строку.
        3.	Замените каждый элемент с нечетным индексом на ноль.
        4.	Снова выведете массив на консоль в отдельной строке.


     */
    public static void main(String[] args) {

        //создавем рандом
        //как получить значение от 1 до 50 если random() возвращает значение от 0 до 1
        //  по следующей формуле
        //       random =  Math.random() * ( max - min + 1) + min

        int random0 = (int) (Math.random() * ( 50 - 1 + 1) + 1);
        int random1 = (int) (Math.random() * ( 50 - 1 + 1) + 1);
        int random2 = (int) (Math.random() * ( 50 - 1 + 1) + 1);
        int random3 = (int) (Math.random() * ( 50 - 1 + 1) + 1);
        int random4 = (int) (Math.random() * ( 50 - 1 + 1) + 1);
        int random5 = (int) (Math.random() * ( 50 - 1 + 1) + 1);
        int random6 = (int) (Math.random() * ( 50 - 1 + 1) + 1);
        int random7 = (int) (Math.random() * ( 50 - 1 + 1) + 1);



        // создаем массив с 8 элементами

        int[] array = new int[8];
        array[0] = random0;
        array[1] = random1;
        array[2] = random2;
        array[3] = random3;
        array[4] = random4;
        array[5] = random5;
        array[6] = random6;
        array[7] = random7;
        System.out.println("Первоначальный вид нашего массива: " + Arrays.toString(array));

        //Замените каждый элемент с нечетным индексом на ноль.

        for (int i = 0; i < array.length; i += 2 ) {
            array[i] = 0;

        }

        //Снова выведете массив на консоль в отдельной строке.

        System.out.println("измененный массив имеет следующий вид: " + Arrays.toString(array));


    }
}
