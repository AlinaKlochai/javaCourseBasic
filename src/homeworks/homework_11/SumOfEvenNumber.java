package homeworks.homework_11;

import java.util.Scanner;

public class SumOfEvenNumber {

    /*Подсчитать сумму всех четных чисел от 0 до N
   при том что N вводится пользователем

     */
    public static void main(String[] args) {
        // Создаем сканнер для ввода данных из клавиатуры

        Scanner scanner = new Scanner(System.in);

        // запрауиваем у пользователя значение "n"
        System.out.println("Ввeдите значение N: ");
         int n = scanner.nextInt();

        //Создаем переменные, которые будем использовать в нашем цикле
        int sum = 0;

        // Создаем цикл для вычисления суммы всех четный чисел от 0 до N

        for (int i = 0; i < n; i+=2) {
            sum += i;

        }

        // Выводим полученный результат всех четных чисел от 0 до N
        System.out.println("Полученная сумма всех четных чисел от 0 и до " + n + " :" + sum);

    }
}
