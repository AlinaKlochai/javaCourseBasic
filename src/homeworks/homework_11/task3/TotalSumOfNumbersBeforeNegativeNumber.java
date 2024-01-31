package homeworks.homework_11.task3;

import java.util.Scanner;

public class TotalSumOfNumbersBeforeNegativeNumber {

    /* Используйте цикл, чтобы просуммировать все числа, которые ввел пользователь, до первого отрицательного.

     */

    public static void main(String[] args) {
        // Создаем сканнер для ввода данных из клавиатуры

        Scanner scanner = new Scanner(System.in);

        // запрашиваем у пользователя числа
        System.out.println("Ввeдите значение : ");


        //Создаем переменные, которые будем использовать в нашем цикле
        int sum = 0;

        boolean condition = true;

        while (condition){
            int number = scanner.nextInt();

            if (number >= 0 ){
                sum = sum + number;

                System.out.println("Сумма всех введенных цифр = " + sum);

            }else {
                condition = false;
            }
        }

    }

}
