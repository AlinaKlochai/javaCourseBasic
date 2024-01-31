package homeworks.homework_11.task2;

import java.util.Scanner;

public class SimpleNumber {

    /*проверить является ли число которое ввел пользователь - простым
   (делится без остатка только на 1 и на себя)
     */

    public static void main(String[] args) {

        // запрашиваем у пользователя число

        Scanner scanner = new Scanner(System.in);
        IsSimpleNumber simpleNumber = new IsSimpleNumber();

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        // устанавлием метод который будет проверять введенное число на простоту

        boolean isSimple = simpleNumber.isSimple(number);

        if (isSimple){
            System.out.println("Вы ввели " + number + ", а оно является простым.");
        }else {
            System.out.println("Вы ввели " + number + ", а оно не является простым.");

        }

    }

}
