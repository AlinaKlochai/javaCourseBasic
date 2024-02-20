package homeworks.extraHomework.addHomework3.task_9;

import scanner.UserInput;

public class Numbers {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        int num1 = userInput.inputInteger("Enter first integer number: ");
        int num2 = userInput.inputInteger("Enter second integer number: ");
        int num3 = userInput.inputInteger("Enter third integer number: ");


        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");
        } else if (num1 >  num2 && num2 > num3 ) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
