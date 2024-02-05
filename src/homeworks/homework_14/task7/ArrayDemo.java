package homeworks.homework_14.task7;

import scanner.UserInput;

import java.util.Arrays;
/*
Создать массив размера , полученного от пользователя
Наполнить этот массив случайными числами в диапазоне до 100
- найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
- найти сумму всех элементов

если максимальный элемент повторяется несколько раз то создать массив из индесов

в идеале - оформить основные модули вашей программы отдельными методами

 */
public class ArrayDemo {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        ArrayService service = new ArrayService();

        //Создать массив размера , полученного от пользователя

        int lengthForOurArray = userInput.inputInteger("Введите длину массива: ");

        int[] myArray = service.createIntArray(lengthForOurArray);

        /* в переменной service ксть ссылка на некий обьект, экземпляп класса который храниться в памяти
        в этом обекте, есть метод int[] newArray - запусти его на выполенение ему для работы необхплим
        парамент arrayLength(этот параметр передай в этот метод) и то что он сделает - результат его работы
         сохрани вот в этой переменной у меня здесь
         */

        System.out.println(Arrays.toString(myArray));

        //Наполнить этот массив случайными числами в диапазоне до 100

        int startValue = 0;
        System.out.println("Начальное значение диапазона чисел: " + startValue);

        int endValue = 100;
        System.out.println("Конечное значение диапазона чисел: " + endValue );


        System.out.println("Текущий массив заполненный рандомными числами: ");
        service.fillArrayRandom(myArray, startValue, endValue);
        System.out.println(Arrays.toString(myArray));

        //- найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)

        int[] maxResult = service.findMaxValueAndIndex(myArray, startValue, endValue);
        int max = maxResult[0];
        int maxIndex = maxResult[1];
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Индекс максимального элемента: " + maxIndex);

    }

}
