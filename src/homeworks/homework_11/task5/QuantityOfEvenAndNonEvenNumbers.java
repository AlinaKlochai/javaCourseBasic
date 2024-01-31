package homeworks.homework_11.task5;

import java.util.Scanner;

public class QuantityOfEvenAndNonEvenNumbers {

    /*Пользователь ввел число N. Подсчитайте количество четных и не четных чисел в диапазоне от 0 до N
    
     */
    public static void main(String[] args) {
        // Создаем сканнер для ввода данных из клавиатуры

        Scanner scanner = new Scanner(System.in);

        // запрауиваем у пользователя значение "n"
        System.out.println("Ввeдите значение N: ");
        int n = scanner.nextInt();
        
        int evenNumbers = 0;
        int nonEvenNumbers = 0;

        for (int number = 0; number < n; number++) {
            if (number % 2 ==0){
                evenNumbers++;
            }else {
                nonEvenNumbers++;
            }
            
        }

        System.out.println("Количество четных чисел в диапазоне от 0 и до " + n + " = " + evenNumbers);
        System.out.println("Количество нечетных чисел в диапазоне от 0 и до " + n + " = " + nonEvenNumbers);
    }
}
