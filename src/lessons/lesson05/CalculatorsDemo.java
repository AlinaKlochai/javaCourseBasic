package lessons.lesson05;

public class CalculatorsDemo {
    public static void main(String[] args) {

        // ----- Используем метод, который будет ВОЗВРАЩАТЬ значение результата своей работы -----

        CalculatorWithReturnResult calculatorWithReturnResult = new CalculatorWithReturnResult();

        int x = 10;
        int y = 12;

        int resultSum = calculatorWithReturnResult.sum(x,y);

        System.out.println("Результат сложения x = " + x + " и у = " + y + " будет равен: " + resultSum);

        // добавляем -

        int resultSub = calculatorWithReturnResult.sub(x,y);
        System.out.println("Результат разницы x = " + x + " и у = " + y + " будет равен: " + resultSub);

        // теперь с *

        int resultMul = calculatorWithReturnResult.mul(x,y);
        System.out.println("Результат умножения x = " + x + " и у = " + y + " будет равен: " + resultMul);

        // и с /

        double resultDev = calculatorWithReturnResult.dev(x,y);
        System.out.println("Результат деления x = " + x + " и у = " + y + " будет равен: " + resultDev);







    }
}

