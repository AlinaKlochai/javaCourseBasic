package homeworks.homework_38.task_1;
/*
Напишите функциональный интерфейс для преобразования строки в верхний регистр.
 */

import java.util.Locale;

public class StringToUpperCase {
    public static void main(String[] args) {

        StringModifier modifiedString = (currentString -> currentString.toUpperCase(Locale.of(currentString)));

        String currentString = "hello, world";

        String modifiedetString = modifiedString.stringToUpperCase(currentString);
        System.out.println(modifiedetString);
    }

}
