package homeworks.homework_09.task5;



import scanner.UserInput;

public class LuckyNumber {

    /*- программа предлагает пользователю ввести четырехзначное число
- Причем: мы можем получать от пользователя **ТОЛЬКО** строки. Данные в формате String
- Если число не четырехзначное, должно вывестись на экран сообщение об ошибке и работа программы завершается
- Проверить, является ли число "счастливым билетом". Т.е. совпадает ли сумма цифр первых двух цифр числа с суммой третьей и четвертой цифры

Пример:
- число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое
- число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым

 */
    public static void main(String[] args) {
        // - программа предлагает пользователю ввести четырехзначное число

        UserInput ui = new UserInput();
        String number = ui.inputText("Введите четырехзначное число: ");

        //Если число не четырехзначное, должно вывестись на экран сообщение об ошибке и работа программы завершается.
        //Проверяем, введенное число является ли четырехзначным

        int lineLength = number.length();
        if (lineLength != 4) {
            System.out.println(" ОШИБКА!!! ");
        }else {
            int nullIndex = 0;
            int firstIndex = 1;
            String firstDigit = number.substring(nullIndex, firstIndex);
            String secondDigit = number.substring(nullIndex + 1, firstIndex + 1);
            String thirdDigit = number.substring(nullIndex + 2, firstIndex + 2);
            String fourDigit = number.substring(nullIndex + 3, firstIndex + 3);

            //конвентируем переменный тила String в Int

            int firstDigitInt = Integer.parseInt(firstDigit);
            int secondDigitInt = Integer.parseInt(secondDigit);
            int thirdDigitInt = Integer.parseInt(thirdDigit);
            int fourDigitInt = Integer.parseInt(fourDigit);

            //Проверяем, является ли число "счастливым билетом". Т.е. совпадает ли сумма цифр первых
            // двух цифр числа с суммой третьей и четвертой цифры

            int firstPartOfNumber = firstDigitInt + secondDigitInt;
            int secondPartOfNumber = thirdDigitInt + fourDigitInt;

            if (firstPartOfNumber == secondPartOfNumber){
                System.out.println("Вы ввели счастривое число!");
            }else {
                System.out.println("Вам не повезло, Вы ввели несчастривое число... Попробуйте еще раз, а вдруг повезет в следующий раз ;) ");
            }

        }




    }
}
