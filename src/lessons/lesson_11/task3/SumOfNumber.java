package lessons.lesson_11.task3;

import java.util.Scanner;

public class SumOfNumber {

    /*
    Задание 2.
    Напишите программу, которая запрашивает у пользователя несколько чисел
    при вводе 0 - печатает сумму всех введенных чисел и их среднее арифметическое значение

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        boolean condition = true;

        System.out.println("Please enter integer number (0 for exit");

        while (condition){
            int number = scanner.nextInt();

            if (number == 0){
                condition = false;


            }else {
                System.out.println("Please enter next integer number");


                sum = sum + number;
                System.out.println("Sum all number is: " + sum);

            }


        }

    }
}
