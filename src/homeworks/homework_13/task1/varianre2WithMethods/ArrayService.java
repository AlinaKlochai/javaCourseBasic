package homeworks.homework_13.task1.varianre2WithMethods;

import java.util.Random;

public class ArrayService {
     /*
        1) получить длину массива от пользователя
        2) создание массива нужной длины
        3) получить интервал от пользователя
        4) заполнить массив случайными числами в определенном интервале
        5) вывести информацию о массиве на экран
        6) Замените каждый элемент с нечетным индексом на ноль.
        7) Снова выведете массив на консоль в отдельной строке.
         */
    public int[] createIntArray(int arrayLength){

        // мы создаем метод, цель которого будет создвание массива для этого
        // ему потребудется значение которое ему будет передано(int arrayLength)
        // и будет созранено в этой переменной
        // М результатом этого метода будет массив (int[]) который должен быть
        // создан и передан в качестве результата его работы

        int[] newArray = new int[arrayLength];  // создаем новый массив с переданными параметрами(int[arrayLength])
        return newArray;  // влзвращаем результат работы нашего метода

    }


    public void fillArrayRandom(int [] workingArray, int startValue, int endValue){
        /*
        1) врспользрваться классом Random
        2) в цикле от 0 до конца для КАЖДОГО елемента нужно:
             - вычислить рандомное число из диапазона от startValue до  endValue
             - сохранить это значение с i-ом элементе массива
         */

        Random random = new Random();

        for (int i = 0; i < workingArray.length; i++) {
            int randomValue = random.nextInt(startValue, endValue + 1);
            workingArray[i] = randomValue;
        }
    }
}
