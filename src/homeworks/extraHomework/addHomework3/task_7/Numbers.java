package homeworks.extraHomework.addHomework3.task_7;

import scanner.UserInput;

public class Numbers {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        int firstNumber = userInput.inputInteger("Enter first integer number: ");
        int secondNumber = userInput.inputInteger("Enter second integer number: ");

        if(firstNumber == secondNumber){
            System.out.println("Numbers are equals");
        }else {
        System.out.println("Numbers are different");
        }
    }
}
