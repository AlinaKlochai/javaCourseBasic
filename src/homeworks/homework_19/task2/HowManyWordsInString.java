package homeworks.homework_19.task2;
/*
Напишите программу, которая определит, сколько слов Вы ввели с консоли.
 */

import scanner.UserInput;

public class HowManyWordsInString {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        String words = userInput.inputText("Введите слова одной строкой через пробел: ");

        int count = 0;

        if(words.length() != 0) {         // проверяем не пустая ли строка
            count++;

            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < words.length(); i++) {
                if (words.charAt(i) == ' ') {

                    count++;                           //Если пробел - увеличиваем количество слов на 1
                }
            }
        }

        System.out.println("Вы ввели " + count + " слов");
    }
}
