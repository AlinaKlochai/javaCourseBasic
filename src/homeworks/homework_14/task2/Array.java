package homeworks.homework_14.task2;

import java.util.Arrays;

import static homeworks.homework_14.task2.ArrayService.*;

public class Array {
    public static void main(String[] args) {
        /*
            1.Создайте массив из всех нечётных чисел от 1 до 99.
            2. Выведите его на экран в строку в обратном порядке

         */

        /*
           1) создаем массив из всех нечетных чисел в интервале [1;99]
           2) создать метод, который будет брать данные из нашего массива и
               выведить его на экран в строку в обратном порядке
         */

        //создаем массив из всех нечетных чисел в интервале [1;99]


        ArrayService service = new ArrayService();

        int[] myArray = service.createNumbersArray();
        System.out.println(Arrays.toString(myArray));

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        int[] myArrayInRevers = service.printArrayInReverse(myArray);
        System.out.println(Arrays.toString(myArrayInRevers));



    }
}
