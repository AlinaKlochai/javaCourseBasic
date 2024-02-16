package homeworks.homework_19.task5;

import java.util.Arrays;

/*
    Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
   Введенное пользователем число сохраняется в переменную n.
   Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.

   Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
   Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

 */
public class ArrayDemo {
    public static void main(String[] args) {
        ArrayServise servise = new ArrayServise();

        /*Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
            Введенное пользователем число сохраняется в переменную n.
            Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.

         */
        int n = servise.inputSizeOfArray();

        int[] arrayFirst = servise.createArray(n);
        System.out.println("Созданный массив из рандомных чисел: ");
        System.out.println(Arrays.toString(arrayFirst));

        int[] arrayWithEvenNumbers = servise.extractEvenNumbers(arrayFirst);

        System.out.println("Массив из четных числел: " + Arrays.toString(arrayWithEvenNumbers));
    }
}
