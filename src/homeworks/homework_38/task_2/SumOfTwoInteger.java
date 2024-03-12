package homeworks.homework_38.task_2;

/*
Напишите функциональный интерфейс для вычисления суммы двух целых чисел.
 */
public class SumOfTwoInteger {
    public static void main(String[] args) {
        SumOfNumbers sumOfNumbers = ((Integer::sum));

        Integer integer1 = 15;
        Integer integer2 = 30;

        Integer sum = sumOfNumbers.sumOfTwoInteger(integer1,integer2);
        System.out.println("Sum of numer 1: " + integer1 + ",numer 2: " + integer2 + " = " + sum);


    }
}
