package homeworks.extraHomework.addHomework3.task_5;

import scanner.UserInput;

import java.util.Scanner;

public class WorkWithTwoNumber {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        int firstNumber = userInput.inputInteger("Введите первое целое число: ");
        int secondNumber = userInput.inputInteger("Введите второе целое число: ");

        if (firstNumber>secondNumber){
            System.out.println("Первое число " + firstNumber + " больше второго");
        }
        System.out.println("Второе число " + secondNumber + " больше первого");
    }
}
