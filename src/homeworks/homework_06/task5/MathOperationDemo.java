package homeworks.homework_06.task5;

import homeworks.homework_06.task5.MathOperation;

public class MathOperationDemo {


    public static void main(String[] args) {

            MathOperation userInput = new MathOperation();

            int number1 = MathOperation.inputFirstNumber();
            System.out.println("You entered the 1st number: " + number1);
            int number2 = MathOperation.inputSecondNumber();
            System.out.println("You entered the 2nd number: " + number2);

            System.out.println("Sum of your numbers: " + MathOperation.sum(number1, number2));
            System.out.println("Subtraction of your numbers: " + MathOperation.sub(number1, number2));
            System.out.println("Multiplication of your numbers: " + MathOperation.multiplication(number1, number2));
            System.out.println("Division of your numbers: " + MathOperation.div(number1, number2));

    }

}
