package homeworks.homework_12.task3;

public class FactorialCalculator {

    public int factorial(int n){

        // задаем старт нашего факториала
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;

        }
        return factorial;

    }

}
