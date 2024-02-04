package homeworks.homework_13.task1.varianre2WithMethods;

import scanner.UserInput;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

       /*
          1.	Создайте массив из 8 случайных целых чисел из интервала [1;50]
          2.	Выведите массив на консоль в строку.
          3.	Замените каждый элемент с нечетным индексом на ноль.
          4.	Снова выведете массив на консоль в отдельной строке.
        */

        /* алгоритм действий:

        1) получить длину массива от пользователя
        2) создание массива нужной длины
        3) получить интервал от пользователя
        4) заполнить массив случайными числами в определенном интервале
        5) вывести информацию о массиве на экран
        6) Замените каждый элемент с нечетным индексом на ноль.
        7) Снова выведете массив на консоль в отдельной строке.
         */



        // 2) создание массива нужной длины


        // срздаем екземпляры нужных класса чтобы мы могли воспользоваться методами которые там есть
        ArrayService service = new ArrayService();
        UserInput userInput = new UserInput();

        int lengthForOurArray = userInput.inputInteger("Ввелите длину массива: ");

        int[] myArray = service.createIntArray(lengthForOurArray);

        /* в переменной service ксть ссылка на некий обьект, экземпляп класса который храниться в памяти
        в этом обекте, есть метод int[] newArray - запусти его на выполенение ему для работы необхплим
        парамент arrayLength(этот параметр передай в этот метод) и то что он сделает - результат его работы
         сохрани вот в этой переменной у меня здесь
         */

        System.out.println(Arrays.toString(myArray));

        int startValue = userInput.inputInteger("Ввелите начальное значение диапазона чисел массива: ");
        int endValue = userInput.inputInteger("Ввелите конечное значение диапазона чисел массива: ");

        System.out.println("Текущий массив заполненный рандомными числами: ");
        service.fillArrayRandom(myArray, startValue, endValue);
        System.out.println(Arrays.toString(myArray));

        //вызываем работу нашего метода arrayWithoutPairedElements
        System.out.println("Измененный массив, где каждый элемент с нечетным индексом заменен: ");
        service.arrayWithoutPairedElements(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
