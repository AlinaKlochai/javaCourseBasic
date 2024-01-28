//Реализовать программу, выводящую на экран результаты сложения,
//вычитания, умножения и деления двух чисел, введенных пользователем.
// Каждая из арифметических операций должна быть реализована как отдельный метод.
//Ввод пользователем данных реализуйте отдельным классом с соответствующим методом.


package homeworks.homework_06.task5;

import java.util.Scanner;

public class MathOperation {

    public static int inputFirstNumber() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the 1st number: ");
            int inputFirstNumber = scanner.nextInt();
            return inputFirstNumber;
        }
        public static int inputSecondNumber() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the 2nd number: ");
            int inputSecondNumber = scanner.nextInt();
            scanner.close();
            return inputSecondNumber;
        }

        public static int sum(int inputFirstNumber, int inputSecondNumber){
            int result =  inputFirstNumber + inputSecondNumber;
            return result;
        }

        public static int sub(int inputFirstNumber, int inputSecondNumber){
            int result =  inputFirstNumber - inputSecondNumber;
            return result;
        }

        public static int multiplication(int inputFirstNumber, int inputSecondNumber){
            int result =  inputFirstNumber * inputSecondNumber;
            return result;
        }
        public static double div(int inputFirstNumber, int inputSecondNumber){
            double result = (double) inputFirstNumber / inputSecondNumber;
            return result;
        }
    }
