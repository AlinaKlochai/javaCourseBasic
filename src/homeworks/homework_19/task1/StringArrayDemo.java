package homeworks.homework_19.task1;

import java.util.Arrays;

/*Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
Не используйте дополнительный массив для хранения результатов.

 */
public class StringArrayDemo {
    public static void main(String[] args) {
        StringArrayServise arrayServise = new StringArrayServise();

        // создаем массив
        int sizeOfArray = arrayServise.inputSizeOfArray();
        String [] Array = arrayServise.createArray(sizeOfArray);
        System.out.println(Arrays.toString(Array));

        // заполняем массив
        String[] array = arrayServise.fillArray(Array);
        System.out.println("---------Заполненный массив из указанных слов-------------");
        System.out.println(Arrays.toString(array));

        // переворачиваем массив
        String[] arrayReverse = arrayServise.reverseArray(Array);
        System.out.println("---------Наш массив из в обратном порядке-------------");
        System.out.println(Arrays.toString(arrayReverse));



    }
}
