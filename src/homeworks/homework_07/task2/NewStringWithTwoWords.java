package homeworks.homework_07.task2;

import scanner.UserInput;

/*
Введите 2 слова, используйте сканер.
Получить слово, состоящее из первой половины первого слова и второй половины второго слова.
Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать.
Распечатать на консоль.
 */
public class NewStringWithTwoWords {
    public static void main(String[] args) {
        //Введите 2 слова, используйте сканер.

        UserInput userInput = new UserInput();
        String firstWord = userInput.inputText("Введите первое слово: ");
        String secondWord = userInput.inputText("Введите второе слово: ");

        System.out.println("Вы ввели два слова, первое: " + firstWord + ", и второе: " + secondWord);

        // Получаем первую половину первого слова
        String half1 = firstWord.substring(0, firstWord.length() / 2);

        // Получаем вторую половину второго слова
        String half2 = secondWord.substring(secondWord.length() / 2);

        // Склеиваем полученные половины
        String result = half1 + half2;

        System.out.println("При склеивании первой половины первого слова и второй половины второго слова вышло новое слово: ");
        System.out.println("" + result);
    }
}
