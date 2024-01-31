package homeworks.homework_12.task1;

import homeworks.homework_06.task4.UserInput;

public class Text {

    /*  У вас есть текст
   Требуется:

   убрать все специальные символы, такие "(", ")", "@"
   (методом replaceAll не пользоваться)

     */
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        String text = userInput.inputName("Введите текст с использованией специальных символов: ");

        // тут будет проходить проверку введенная строка от пользователя и заменяться символы

        CheckTextAndChange checkTextAndChange = new CheckTextAndChange();

        String changedText = checkTextAndChange.change(text);

        // и уже измененная строка выводится

        System.out.println("Измененный текст: " + changedText);

    }
}
