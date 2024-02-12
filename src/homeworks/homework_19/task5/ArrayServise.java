package homeworks.homework_19.task5;

import scanner.UserInput;

import java.util.Arrays;
import java.util.Random;

public class ArrayServise {

    /*
        Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
        Введенное пользователем число сохраняется в переменную n.
        Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.

         */

    private int n;

    public int inputSizeOfArray() {
        UserInput userInput = new UserInput();
        int n = userInput.inputInteger("Введите размер массива: ");
        while (n <= 3) {
            System.out.println("Вы ввели слишком маленькое число, оно должно быть больше 3.");
            System.out.println("Попробуйте еще раз.");
            n = userInput.inputInteger("Введите размер массива: ");
        }
        return n;
    }

    // создаем массив в [0; до n]
    public int[] createArray(int n){
        int[] arrayFirst = new int[n];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = (int) (Math.random()*(n));
        }
        return arrayFirst;
    }

    //Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

    /*
    public int[] createArrayWithEvenElements(int[] arrayFirst) {

        // Сначала подсчитываем количество чётных чисел в исходном массиве
        int evenCount = 0;
        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 == 0) {
                evenCount++;                             // если елемент четный то увеоичиваем счетчик на +1
            }
        }
        // Создаём новый массив, в который будем помещать чётные числа
            int[] arrayWithEvenElements = new int[evenCount];
            int index = 0;
            for (int i = 0; i < arrayFirst.length; i++) {
                if (arrayFirst[i] % 2 == 0){
                    arrayWithEvenElements[index] = arrayWithEvenElements[i];
                    index++;
                }

            }
            // Возвращаем новый массив, содержащий чётные числа
            return arrayWithEvenElements;

    }

     */

    public int[] extractEvenNumbers(int[] arrayFirst) {
        // Сначала подсчитываем количество чётных чисел в исходном массиве
        int evenCount = 0;
        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 == 0)
                evenCount++;
        }

        // Создаём новый массив, в который будем помещать чётные числа из исходного массива
        int[] arrayWithEvenElements = new int[evenCount];
        int index = 0;

        // Проходим по исходному массиву и добавляем чётные числа в новый массив
        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 == 0) {
                arrayWithEvenElements[index] = arrayFirst[i];
                index++;
            }
        }

        // Возвращаем новый массив, содержащий чётные числа
        return arrayWithEvenElements;
    }


}


