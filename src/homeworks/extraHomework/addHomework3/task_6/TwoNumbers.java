package homeworks.extraHomework.addHomework3.task_6;

import scanner.UserInput;

public class TwoNumbers {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        int firstNumber = userInput.inputInteger("Введите первое целое число: ");
        int secondNumber = userInput.inputInteger("Введите второе целое число: ");

        int minNumber = Math.min(firstNumber,secondNumber);
        System.out.println("Найменьшее число из заданных: " + minNumber);
    }
}
