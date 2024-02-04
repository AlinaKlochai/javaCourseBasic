package homeworks.homework_14.task3;

import scanner.UserInput;

import java.util.Arrays;

public class ArrayDemo {


    /*
        1 Создайте массив из 15 случайных целых чисел из отрезка [0;9].
        2. Подсчитайте сколько в массиве чётных элементов и выведете это
            количество на экран на отдельной строке.

     */

    public static void main(String[] args) {
        ArrayServise servise = new ArrayServise();
        UserInput userInput = new UserInput();

        int lengthForOurArray = userInput.inputInteger("Введите длину массива: ");
        int[] myArray = servise.createIntArray(lengthForOurArray);


        /* в переменной service ксть ссылка на некий обьект, экземпляп класса который храниться в памяти
        в этом обекте, есть метод int[] newArray - запусти его на выполенение ему для работы необхплим
        парамент arrayLength(этот параметр передай в этот метод) и то что он сделает - результат его работы
         сохрани вот в этой переменной у меня здесь
         */

        System.out.println(Arrays.toString(myArray));

        int startValue = userInput.inputInteger("Ввелите начальное значение диапазона чисел массива: ");
        int endValue = userInput.inputInteger("Ввелите конечное значение диапазона чисел массива: ");

        System.out.println("Текущий массив заполненный рандомными числами: ");
        servise.fillArrayRandom(myArray, startValue, endValue);

        System.out.println(Arrays.toString(myArray));

        //выводим информацию о количестве четных елементов в данным массиве

        int countOfEvenNumber = servise.countEvenNumbers(myArray);
        System.out.println("Количество четных елементов в данным массиве: " + countOfEvenNumber);


    }
}
