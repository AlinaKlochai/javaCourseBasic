package homeworks.homework_12.task3;

import homeworks.homework_06.task4.UserInput;

import java.util.Scanner;

public class Factorial {
    /*Написать метод для вычисления факториала числа (произведение всех чисел от 1 до заданного)

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // запрашиваем у пользователя значение "n"
        System.out.println("Ввeдите значение N: ");
        int n = scanner.nextInt();

        //создаем экземпляр класса

        FactorialCalculator factCalc = new FactorialCalculator();

        // выводим результат


        System.out.println("Значение фвкториала числа " + n + " равно " + factCalc.factorial(n) );


    }
}
