package homeworks.homework_38.task_4;

/*
Напишите функциональный интерфейс для вычисления факториала числа.
 */
public class FactorialOfNumber {
    public static void main(String[] args) {

        FactorialCalsulater factorialCalsulater = (int number) ->{
            int factorial = 1;
            for (int i = 1; i <= number ; i++) {
                factorial = factorial * i;
            }
            return factorial;
        };

        int number = 10;
        int factorialResult = factorialCalsulater.calcFactorial(number);

        System.out.println("Factorail of number: " + number + " = " + factorialResult);




    }
}
