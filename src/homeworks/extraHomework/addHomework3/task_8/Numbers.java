package homeworks.extraHomework.addHomework3.task_8;

import scanner.UserInput;

public class Numbers {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int num1 = userInput.inputInteger("Enter first integer number: ");
        int num2 = userInput.inputInteger("Enter second integer number: ");
        int num3 = userInput.inputInteger("Enter third integer number: ");

        // Проверка условий и печать соответствующего сообщения
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
